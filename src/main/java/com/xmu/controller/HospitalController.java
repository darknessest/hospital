package com.xmu.controller;

import com.xmu.entity.Admin;
import com.xmu.entity.Hospital;
import com.xmu.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @RequestMapping("/getHospitals")
    public List<String> hospitalNames(Model model) {
//        Admin admin= hospitalService.fingById(1);
//        model.addAttribute("admin",admin);
        List<Hospital> list_hospitals = hospitalService.findAll();
        model.addAttribute("list_hospitals", list_hospitals);
        return null;
    }

    @RequestMapping(value = "/helloWorld", method = RequestMethod.POST)
    public String helloWorld() {
//        model.addAttribute("message", "Hello World!");
        System.out.println("FROM HELLO WORLD");
        return "helloWorld";
    }
}
