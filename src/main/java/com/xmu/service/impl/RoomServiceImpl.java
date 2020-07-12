package com.xmu.service.impl;

import com.xmu.entity.Room;
import com.xmu.mapper.RoomMapper;
import com.xmu.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<Room> findAll() {
        return roomMapper.selectByExample(null);
    }

    @Override
    public Room findByRoomId(Long roomId) {
        return roomMapper.selectByPrimaryKey(roomId);
    }

    @Override
    public boolean save(Room room) {
        int i = roomMapper.insertSelective(room);
        return i==1?true:false;
    }

    @Override
    public boolean update(Room room) {
        int i = roomMapper.updateByPrimaryKeySelective(room);
        return i == 1 ? true : false;
    }

    @Override
    public boolean delete(Long roomId) {
        int i = roomMapper.deleteByPrimaryKey(roomId);
        return i == 1 ? true : false;
    }
}
