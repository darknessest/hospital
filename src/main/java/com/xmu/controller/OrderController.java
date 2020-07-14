package com.xmu.controller;

import com.xmu.entity.*;
import com.xmu.service.DoctorService;
import com.xmu.service.OrdersService;
import com.xmu.service.RoomService;
import com.xmu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Controller
public class OrderController {
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private UserService userService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private RoomService roomService;

    @RequestMapping("showorder.us")
    public String showOrder(Model model, HttpServletRequest request) {
        User sessionUser= (User) request.getSession().getAttribute("user");
        List<Map<String, Object>> list = ordersService.findByUserId(sessionUser.getuId());
        String name = sessionUser.getuName();
        model.addAttribute("name", name);
        model.addAttribute("list", list);
        return "userorders";
    }

    @RequestMapping("showdoctors.us")
    public String showDoctors(Model model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<Doctor> list = doctorService.findAll();
            model.addAttribute("list",list);
            return "userdoctors";
    }

    @RequestMapping("addorder.us")
    public String addOrder(Orders order,HttpServletRequest request){
        User user= (User) request.getSession().getAttribute("user");
        long uId=user.getuId();
        Doctor doctor= doctorService.findByDoctorId(order.getoDid());
        Room room=roomService.findByRoomId(doctor.getdRid());
        order.setoUserid(uId);
        order.setoHid(doctor.getdHid());
        order.setoRaddress(room.getrAddress());
        order.setoPrice(new BigDecimal(100));
        order.setoStatus((byte)1);
        ordersService.add(order);
        return "forward:showorder.us";
    }
    @RequestMapping("payorder.us")
    public String payOrder(Model model,long oId) {

        //TODO: create payment link generator
        Orders order=new Orders();
        order.setoId(oId);
        order.setoStatus((byte) 2);
        ordersService.update(order);
        return "redirect:showorder.us";
    }

    @RequestMapping("cancelorder.us")
    public String cancelOrder(String oId) {
        ordersService.delete(Long.parseLong(oId));
        return "forward:showorder.us";
    }

}