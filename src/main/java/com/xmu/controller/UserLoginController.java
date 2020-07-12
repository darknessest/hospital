package com.xmu.controller;

import com.xmu.entity.User;
import com.xmu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserLoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String doLogin(String uaccount, String upassword, HttpServletRequest request){
        User user = userService.findByUaccountAndUpassword(uaccount, upassword);
        if(user==null){
            request.setAttribute("msg", "用户名或密码有误！请重新输入");
            return "../../login";
        }else{
            request.getSession().setAttribute("admin", user);
            //跳转到主页面暂时不确定
            return "forward:showgoods.do";

        }
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request){
        request.setAttribute("msg", "您已安全退出系统！");
        request.getSession().invalidate();
        return "../../login";
    }

    @RequestMapping("toreg")
    public String toReg(HttpServletRequest request){
        return "register";
    }

    @RequestMapping("tologin")
    public String toLogin(HttpServletRequest request){
        return "../../login";
    }















}
