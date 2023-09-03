package cl.barbatos.rooms.services;

import java.util.List;

import cl.barbatos.rooms.dao.IRoomDao;
import cl.barbatos.rooms.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements IRoomService {
	
	@Autowired
	private IRoomDao roomDao;

	@Override
	public List<Room> search() {
		return (List<Room>) roomDao.findAll();
	}

}
