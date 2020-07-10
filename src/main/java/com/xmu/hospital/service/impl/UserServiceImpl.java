package com.xmu.hospital.service.impl;

import com.xmu.hospital.entity.User;
import com.xmu.hospital.mapper.UserMapper;
import com.xmu.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findAll() {
        return userMapper.selectByPrimaryKey((long) 1);
    }
}
