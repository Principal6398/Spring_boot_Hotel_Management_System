package com.Hotel.Hotel.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.Hotel.Management.System.entity.Room;
import com.Hotel.Hotel.Management.System.service.RoomService;


@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService RoomService;
    @GetMapping
    public List<Room>getAllRooms(){
    	return RoomService.getAllRooms();
    }
    @PostMapping
    public Room addRoom(@RequestBody Room room) {
    	return RoomService.addroom(room);
    }
    
}
