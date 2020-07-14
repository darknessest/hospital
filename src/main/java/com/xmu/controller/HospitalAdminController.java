package com.xmu.controller;

import com.xmu.entity.*;
import com.xmu.service.HospitalService;
import com.xmu.service.OrdersService;
import com.xmu.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class HospitalAdminController {
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private HospitalService hospitalService;


    @RequestMapping("hplogin")
    public String doLogin(String hAccount, String hPassword, HttpServletRequest request){
        Hospital hospital = hospitalService.login(hAccount, MD5Util.crypt(hPassword));
        if(hospital==null){
            request.setAttribute("msg", "用户名或密码有误！请重新输入");
            return "../../hospitallogin";
        }else{
            hospital.sethPassword(null);
            request.getSession().setAttribute("hospital", hospital);
            return "forward:showdoctors.hp";
        }
    }

    @RequestMapping("hplogout")
    public String logout(HttpServletRequest request){
        request.setAttribute("msg", "您已安全退出系统！");
        request.getSession().invalidate();
        return "../../index";
    };
    //
    //
    //    //    订单部分管理===================================================================================
    @RequestMapping("showorder.hp")
    public String showOrder(Model model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")!=null){
            Hospital hospital = new Hospital();
            hospital = (Hospital) request.getSession().getAttribute("hospital");
            List<Map<String,Object>> list=ordersService.findByHospitalId(hospital.gethId());
            model.addAttribute("list",list);
            return "hospitalorder";
        }else{
            request.setAttribute("msg", "请先登录系统！");
            request.getRequestDispatcher("hospitallogin.jsp").forward(request, response);
            return "../../index";
        }
    }

}