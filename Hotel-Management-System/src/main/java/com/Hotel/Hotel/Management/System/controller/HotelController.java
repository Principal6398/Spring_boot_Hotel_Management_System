package com.Hotel.Hotel.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.Hotel.Management.System.entity.Hotel;
import com.Hotel.Hotel.Management.System.service.HotelService;
@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired
	private HotelService service;
	@PostMapping
	public Hotel saveHotel(@RequestBody Hotel hotel) {
		return service.saveHotel(hotel);
	}
	@GetMapping
	public List<Hotel>getAllHotels(){
		return service.getAllHotels();
	}
	@GetMapping("/{id}")
	public Hotel getHotelById(@PathVariable Long id) {
		return service.getHotelById(id);
	}
	@DeleteMapping("/{id}")
	public String deletehotel(@PathVariable Long id) {
		service.deleteHotel(id);
		return "Hotel Deleted Successfully";
	}

}
