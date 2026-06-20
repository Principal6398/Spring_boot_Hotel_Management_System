package com.Hotel.Hotel.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel.Hotel.Management.System.entity.Booking;

public interface BookingRespository extends JpaRepository<Booking , Long> {

}
