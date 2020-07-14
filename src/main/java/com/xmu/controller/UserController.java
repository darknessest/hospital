package com.xmu.controller;

import com.xmu.entity.User;
import com.xmu.entity.UserUpdate;
import com.xmu.service.OrdersService;
import com.xmu.service.UserService;
import com.xmu.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/showinfo.us")
    public String findUser(Model model, HttpServletRequest request) {
        // TODO: add login part
        // get id from logged in user info
        User sessionUser= (User) request.getSession().getAttribute("user");
        User user = userService.findByUserId(sessionUser.getuId());
        model.addAttribute("user", user);
        return "user";
    }

//    @RequestMapping("/users")
//    public String findAll(Model model) {
//        List<User> user = userService.findAll();
//        model.addAttribute("users", user);
//        return "user";
//    }

    @RequestMapping("editinfo.us")
    public String editUser(UserUpdate updateUser) {
        if(!updateUser.getuPassword().equals("")){
            updateUser.setuPassword(MD5Util.crypt(updateUser.getuPassword()));
        }else updateUser.setuPassword(null);
        userService.update(updateUser);
        return "redirect:/showinfo.us";
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
