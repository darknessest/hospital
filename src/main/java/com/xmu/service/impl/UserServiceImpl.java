package com.xmu.service.impl;

import com.xmu.entity.User;
import com.xmu.entity.UserUpdate;
import com.xmu.mapper.UserMapper;
import com.xmu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public User findByUserId(long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean save(User user) {
        int i = userMapper.insertSelective(user);
        return i == 1;
    }

    @Override
    public boolean update(User user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        return i == 1;
    }

    @Override
    public boolean update(UserUpdate userUpdate) {
        User user = userMapper.selectByPrimaryKey(userUpdate.getuId());
        user.setuPhone(userUpdate.getuPhone());
        user.setuPassword(userUpdate.getuPassword());

        int i = userMapper.updateByPrimaryKeySelective(user);
        return i == 1;
    }

    @Override
    public boolean delete(long userId) {
        int i = userMapper.deleteByPrimaryKey(userId);
        return i == 1;
    }
}