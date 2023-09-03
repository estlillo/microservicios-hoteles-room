package cl.barbatos.rooms.dao;

import org.springframework.data.repository.CrudRepository;

import cl.barbatos.rooms.model.Room;

public interface IRoomDao extends CrudRepository<Room, Long>{

}
