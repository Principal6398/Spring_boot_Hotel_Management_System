package com.Hotel.Hotel.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hotel.Hotel.Management.System.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Long> {

}
