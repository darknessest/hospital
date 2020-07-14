package com.xmu.controller;

import com.xmu.entity.User;
import com.xmu.entity.UserUpdate;
import com.xmu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/user")
    public String showUser(Model model) {
        // TODO: add login part
        // get id from logged in user info
        User user = userService.findByUserId(1);

        user.setuPassword("");  // hiding password

        model.addAttribute("user", user);
        return "user";
    }


    @RequestMapping("/edit-user")
    public String editUser(UserUpdate updateUser) {
        System.out.println(updateUser.getuId() + updateUser.getuPassword() + updateUser.getuPhone());
//        userService.update(updateUser);
        return "redirect:/user";
    }


//    @RequestMapping(value = "/auth", method = RequestMethod.POST)
//    public ModelAndView auth(String username, String password, HttpSession session) {
//
//        ModelAndView modelAndView = new ModelAndView();
//        User user = userService.auth(username, password);
//        if (user == null) {    //登录失败
//            modelAndView.setViewName("fail");
//            modelAndView.addObject("msg", "登录失败，用户名或者密码错误！");
//        } else {//成功！
//            //session中保存user
//            user.setPassword("");
//            session.setAttribute("user", user);
//            modelAndView.setViewName("main");
//        }
//
//        return modelAndView;
//    }
//

}
