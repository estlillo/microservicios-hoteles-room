package cl.barbatos.rooms.dao;

import org.springframework.data.repository.CrudRepository;

import cl.barbatos.rooms.model.Room;

import java.util.List;

public interface IRoomDao extends CrudRepository<Room, Long>{

    List<Room> findByHotelId(Long id);
}
