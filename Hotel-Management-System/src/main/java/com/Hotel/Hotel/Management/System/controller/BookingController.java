package com.Hotel.Hotel.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.Hotel.Management.System.entity.Booking;
import com.Hotel.Hotel.Management.System.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	@Autowired
	private BookingService bookingService;
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }
    @GetMapping
    public List<Booking>getAllBookings(){
		return bookingService.getAllBookings();
    	
    }
    @DeleteMapping("/{id}")
    public String cancelBooking(@PathVariable long id) {
    	bookingService.cancelBooking(id);
    	return "Booking cncelled successfully";
    }
    
}
