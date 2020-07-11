package com.xmu.controller;

import com.xmu.entity.User;
import com.xmu.service.UserService;
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

import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String findUser(Model model) {
        // TODO: add login part

        User user = userService.findByUserId(1);
        model.addAttribute("user", user);
        return "user";
    }

    @RequestMapping("/users")
    public String findAll(Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("users", user);
        return "user";
    }


    @RequestMapping(value = "/update-user", method = RequestMethod.GET)
    public String showUpdateUserPage(@RequestParam long id, ModelMap model) {
        User user = userService.findByUserId(id);
        model.put("user", user);
        return "update-user";
    }

    @RequestMapping(value = "/update-user", method = RequestMethod.POST)
    public String editUser(ModelMap model, User user, BindingResult result) {

        if (result.hasErrors()) {
            return "redirect:/user";
        }

//        user.setUserName(getLoggedInUserName(model));
        userService.update(user);
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
//    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
//    public String updateTodo(ModelMap model, @Valid User user, BindingResult result) {
//
//        if (result.hasErrors()) {
//            return "todo";
//        }
//
//        user.setuName(getLoggedInUserName(model));
//        userService.update(user);
//        return "redirect:/list-todos";
//    }
}
