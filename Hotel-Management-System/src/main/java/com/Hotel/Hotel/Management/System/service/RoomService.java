package com.Hotel.Hotel.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.Management.System.entity.Room;
import com.Hotel.Hotel.Management.System.repository.RoomRespository;

@Service
public class RoomService {
	@Autowired
	private RoomRespository roomRepository;
	
	public List<Room>getAllRooms(){
		
			return roomRepository.findAll();
		}
	public Room addroom(Room room) {
		return roomRepository.save(room);
	}

}
