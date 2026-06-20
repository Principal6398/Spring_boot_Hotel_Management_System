package com.Hotel.Hotel.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.Management.System.entity.Hotel;
import com.Hotel.Hotel.Management.System.repository.HotelRepository;
@Service
public class HotelService {
	@Autowired
	private HotelRepository repository;
	 public Hotel saveHotel(Hotel hotel) {
		 return repository.save(hotel);
	 }
	public List<Hotel>getAllHotels(){
		return repository.findAll();
	}
	public Hotel getHotelById(Long id) {
		return repository.findById(id).orElse(null);
	}
	public void deleteHotel(Long id) {
		repository.deleteById(id);
	}

}
