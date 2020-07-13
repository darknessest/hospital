package com.xmu.service;

import com.xmu.entity.Room;

import java.util.List;

/**
 * @author lsy
 */
public interface RoomService {
    public List<Room> findAll();
    public Room findByRoomId(Long roomId);
    public void save(Room room);
    public void update(Room room);
    public void delete(Long roomId);
    public List<Room> findByHospitalId(Long hId);
}
