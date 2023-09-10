package cl.barbatos.rooms.services;

import java.util.List;

import cl.barbatos.rooms.model.Room;

public interface IRoomService {
	
	List<Room> search();
	Room searchById(Long id);

	List<Room> searchByHotelId(Long id);
}
