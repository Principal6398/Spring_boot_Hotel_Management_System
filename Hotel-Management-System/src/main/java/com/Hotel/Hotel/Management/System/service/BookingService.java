package com.Hotel.Hotel.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.Management.System.entity.Booking;
import com.Hotel.Hotel.Management.System.entity.Room;
import com.Hotel.Hotel.Management.System.repository.BookingRespository;
import com.Hotel.Hotel.Management.System.repository.RoomRespository;

@Service
public class BookingService {
	@Autowired
	private BookingRespository bookingRespository;
	@Autowired
	private RoomRespository roomRepository;
	
	public Booking createBooking(Booking booking) {
		Room room = roomRepository.findById(booking.getRoom().getId())
                .orElseThrow(() -> new RuntimeException("Room is not found"));
		if (!room.getAvailable()) {
            throw new RuntimeException("Room is not available");
        }

        // Mark room unavailable
        room.setAvailable(false);
        roomRepository.save(room);

        return bookingRespository.save(booking);
	}
	 // Get all bookings
    public List<Booking> getAllBookings() {
        return bookingRespository.findAll();
    }
    //cancel booking
    public void cancelBooking(Long bookingId) {
        Booking booking = bookingRespository.findById(bookingId)
                                           .orElseThrow(() -> new RuntimeException("Booking not found"));

        Room room = booking.getRoom();
        room.setAvailable(true); // free the room again
        roomRepository.save(room);

        bookingRespository.delete(booking);
    }
}
