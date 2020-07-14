package com.xmu.service;

import com.xmu.entity.User;
import com.xmu.entity.UserUpdate;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User findByUserId(long userId);

    public boolean save(User user);

    public boolean update(User user);

    public boolean delete(long userId);

    public boolean update(UserUpdate user);

    User findByUnameAndPassword(String uAccount,String uPassword);

    public boolean findByUAccount(String uaccount);

    User findByUaccountAndUpassword(String uaccount,String upassword);


}
