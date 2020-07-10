package com.xmu.hospital.controller;

import com.xmu.hospital.entity.User;
import com.xmu.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("find")
    @ResponseBody
    public User login(){
        return userService.findAll();
    }
}
