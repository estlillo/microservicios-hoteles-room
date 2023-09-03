package com.aleal.rooms.controller;

import java.util.List;

import com.aleal.rooms.config.RoomsServiceConfig;
import com.aleal.rooms.model.PropertiesRooms;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleal.rooms.model.Room;
import com.aleal.rooms.services.IRoomService;

@RestController
public class RoomController {

	@Autowired
	private IRoomService service;

	@Autowired
	private RoomsServiceConfig config;
	
	@GetMapping("rooms")
	public List<Room> search(){
		return (List<Room>) this.service.search();	
	}


	@GetMapping("rooms/properties")
	public String getProperties() throws JsonProcessingException {

		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		PropertiesRooms properties = new PropertiesRooms(config.getMsg(), config.getBuildVersion(), config.getMailDetails());

		return ow.writeValueAsString(properties);
	}

}
