package com.xmu.service;

import com.xmu.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User findByUserId(long userId);

    public boolean save(User user);

    public boolean update(User user);

    public boolean delete(long userId);
}
