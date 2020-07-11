package com.xmu.controller;

import com.xmu.entity.Admin;
import com.xmu.service.AdminService;
import com.xmu.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;


    @RequestMapping("login")
    public String doLogin(String aAccount, String aPassword, HttpServletRequest request){
        Admin admin = adminService.login(aAccount, MD5Util.crypt(aPassword));
        if(admin==null){
            request.setAttribute("msg", "用户名或密码有误！请重新输入");
            return "../../login";
        }else{
            System.out.println("success++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            request.getSession().setAttribute("admin", admin);
            return "forward:showgoods.do";
        }
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request){
        request.setAttribute("msg", "您已安全退出系统！");
        request.getSession().invalidate();
        return "../../login";
    };

}
