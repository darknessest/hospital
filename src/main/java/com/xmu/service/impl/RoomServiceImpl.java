package com.xmu.service.impl;

import com.xmu.entity.Room;
import com.xmu.entity.RoomExample;
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
    public void save(Room room) {
        roomMapper.insertSelective(room);
    }

    @Override
    public void update(Room room) {
        roomMapper.updateByPrimaryKeySelective(room);
    }

    @Override
    public void delete(Long roomId) {
        roomMapper.deleteByPrimaryKey(roomId);
    }

    @Override
    public List<Room> findByHospitalId(Long hId) {
        RoomExample example = new RoomExample();
        example.createCriteria().andRHidEqualTo(hId);
        return roomMapper.selectByExample(example);
    }
}