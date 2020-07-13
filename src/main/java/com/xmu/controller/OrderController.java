package com.xmu.controller;

import com.xmu.entity.Orders;
import com.xmu.service.OrdersService;
import com.xmu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class OrderController {
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private UserService userService;

    @RequestMapping("/user-orders")
    public String showOrder(Model model) {
        // TODO: add login part
        // get id from logged in user info

        List<Map<String, Object>> list = ordersService.findByUserId(71);
        String name = userService.findByUserId(71).getuName();
        model.addAttribute("name", name);
        model.addAttribute("list", list);
        return "userorders";
    }

    @RequestMapping("/pay-order")
    public String payOrder(Model model) {

        //TODO: create payment link generator
        String payment_link = "alipay.com";
        model.addAttribute("payment-link", payment_link);
        return "redirect:/user-orders";
    }

    @RequestMapping("/cancel-order")
    public String cancelOrder(String oIdDelete) {
//        System.out.println("FROM CANCEL ORDER " + Long.parseLong(oIdDelete));
        ordersService.delete(Long.parseLong(oIdDelete));
        return "redirect:/user-orders";
    }

    @RequestMapping("/new-order")
    public String newOrder(Orders order) {
        // TODO: add login part
        // get id from logged in user info


        order.setoStatus((byte) 1);
        ordersService.add(order);
        return "userorders";
    }

    @RequestMapping(value = "/ajax-cancel", method = RequestMethod.POST)
    public @ResponseBody
    String postEmployeeData(@RequestBody Integer id) {
        System.out.println("FROM AJAX CANCEL ORDER" + id);

        return "";
    }
}