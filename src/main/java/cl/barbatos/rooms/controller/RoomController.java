package cl.barbatos.rooms.controller;

import java.util.List;

import cl.barbatos.rooms.config.RoomsServiceConfig;
import cl.barbatos.rooms.model.PropertiesRooms;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cl.barbatos.rooms.model.Room;
import cl.barbatos.rooms.services.IRoomService;

@RestController
public class RoomController {

	@Autowired
	private IRoomService service;

	@Autowired
	private RoomsServiceConfig config;

	@GetMapping("rooms")
	public List<Room> search() {

		return (List<Room>) this.service.search();
	}

	@GetMapping("rooms/{id}")
	public Room searchById(@PathVariable Long id) {
		return (Room) this.service.searchById(id);
	}

	@GetMapping("rooms/hotel/{id}")
	public List<Room> searchByHotelId(@PathVariable Long id) {
		return this.service.searchByHotelId(id);
	}

	@GetMapping("rooms/properties")
	public String getProperties() throws JsonProcessingException {

		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		PropertiesRooms properties = new PropertiesRooms(config.getMsg(), config.getBuildVersion(),
				config.getMailDetails());

		return ow.writeValueAsString(properties);

	}

}
