package com.xmu.hospital.service.impl;

import com.xmu.hospital.entity.User;
import com.xmu.hospital.service.UserService;

import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceImplTest {
    private UserService userService;

    @Before
    public void init(){
        userService=new UserServiceImpl();
    }
//    @Test
//    public void testFindAll(){
//        List<User> list=userService.findAll();
//        System.out.println(list);
//    }

}