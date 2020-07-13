package com.xmu.controller;

import com.xmu.entity.Doctor;
import com.xmu.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author lsy
 */
@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping("showdoctors.hp")
    public String showDoctors(Model model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")==null){
//            Hospital hospital = new Hospital();
//            hospital = (Hospital)request.getSession().getAttribute("hospital");
            List<Doctor> list = doctorService.findByHospitalId(1L);     //hospital.gethId()
            model.addAttribute("list",list);
            return "doctors";
        }else{
            request.setAttribute("msg","请先登录系统！");
            request.getRequestDispatcher("login.jsp").forward(request,response);
            return "login.jsp";
        }
    }

    @RequestMapping("adddoctors.hp")
    public String addDoctors(Doctor doctor){
        doctorService.save(doctor);
        return "forward:showdoctors.hp";
    }

    @RequestMapping("modifydoctors.hp")
    public String modifyDoctors(Doctor doctor){
        doctorService.update(doctor);
        return "forward:showdoctors.hp";
    }

    @RequestMapping("removedoctors.hp")
    public String removeDoctors(Long dId){
        doctorService.delete(dId);
        return "forward:showdoctors.hp";
    }

}
