package com.xmu.service;

import com.xmu.entity.Room;

import java.util.List;

/**
 * @author lsy
 */
public interface RoomService {
    public List<Room> findAll();
    public Room findByRoomId(Long roomId);
    public boolean save(Room room);
    public boolean update(Room room);
    public boolean delete(Long roomId);
}
