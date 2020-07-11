package com.xmu.controller;

import com.xmu.entity.Admin;
import com.xmu.entity.Hospital;
import com.xmu.entity.User;
import com.xmu.service.AdminService;
import com.xmu.service.UserService;
import com.xmu.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;


    @RequestMapping("login")
    public String doLogin(String aAccount, String aPassword, HttpServletRequest request){
        Admin admin = adminService.login(aAccount, MD5Util.crypt(aPassword));
        if(admin==null){
            request.setAttribute("msg", "用户名或密码有误！请重新输入");
            return "../../adminlogin";
        }else{
            request.getSession().setAttribute("admin", admin);
            return "forward:showuser.ad";
        }
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request){
        request.setAttribute("msg", "您已安全退出系统！");
        request.getSession().invalidate();
        return "../../index";
    };

//    用户部分管理===================================================================================
    @RequestMapping("showuser.ad")
    public String showUser(Model model){
        List<User> list=userService.findAll();
        model.addAttribute("list",list);
        return "adminuser";
    }
    @RequestMapping("inituser.ad")
    public String updateUser(long uId){
        User user=new User();
        user.setuId(uId);
        user.setuPassword(MD5Util.crypt("666666"));
        userService.update(user);
        return "forward:showuser.ad";
    }


//    医院部分管理===================================================================================
    @RequestMapping("showhospital.ad")
    public String showHospital(Model model){
        List<User> list=null;
        model.addAttribute("list",list);
        return "adminhospital";
    }
    @RequestMapping("addhospital.ad")
    public String addHospital(Hospital hospital){

        return "forward:showhospital.ad";
    }
    @RequestMapping("updatehospital.ad")
    public String updateHospital(Hospital hospital){

        return "forward:showhospital.ad";
    }
    @RequestMapping("deletehospital.ad")
    public String deleteHospital(Long hId){

        return "forward:showhospital.ad";
    }


//    订单部分管理===================================================================================
    @RequestMapping("showorder.ad")
    public String showOrder(Model model){
        List<User> list=null;
        model.addAttribute("list",list);
        return "adminorder";
    }



}
