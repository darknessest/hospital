package com.xmu.controller;

import com.xmu.entity.Admin;
import com.xmu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/find")
    public String find(Model model){
        Admin admin=adminService.fingById(1);
        model.addAttribute("admin",admin);
        return "admin";
    }
}
