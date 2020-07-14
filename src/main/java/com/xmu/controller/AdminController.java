package com.xmu.controller;

import com.xmu.entity.*;
import com.xmu.service.AdminService;
import com.xmu.service.HospitalService;
import com.xmu.service.OrdersService;
import com.xmu.service.UserService;
import com.xmu.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private HospitalService hospitalService;


    @RequestMapping("adminlogin")
    public String doLogin(String aAccount, String aPassword, HttpServletRequest request){
        Admin admin = adminService.login(aAccount, MD5Util.crypt(aPassword));
        if(admin==null){
            request.setAttribute("msg", "用户名或密码有误！请重新输入");
            return "../../adminlogin";
        }else{
            admin.setaPassword(null);
            request.getSession().setAttribute("admin", admin);
            return "forward:showuser.ad";
        }
    }

    @RequestMapping("adminlogout")
    public String logout(HttpServletRequest request){
        request.setAttribute("msg", "您已安全退出系统！");
        request.getSession().invalidate();
        return "../../index";
    };

//    用户部分管理===================================================================================
    @RequestMapping("showuser.ad")
    public String showUser(Model model){
        List<User> list=userService.findAll();
        for(User user:list){
            user.setuPassword(null);
        }
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
        List<Hospital> list=hospitalService.findAll();
        for(Hospital hospital:list){
            hospital.sethPassword(null);
        }
        model.addAttribute("list",list);
        return "adminhospital";
    }
    @RequestMapping("addhospital.ad")
    public String addHospital(Hospital hospital,HttpServletRequest request){
        boolean isExist=hospitalService.findByAccount(hospital.gethAccount());
        hospital.sethPassword(MD5Util.crypt(hospital.gethPassword()));
        if (!isExist){
            hospitalService.add(hospital);
        }
        return "forward:showhospital.ad";
    }
    @RequestMapping("updatehospital.ad")
    public String updateHospital(Hospital hospital){
        if(hospital.gethPassword().equals("")){
            hospital.sethPassword(null);
        }else{
            hospital.sethPassword(MD5Util.crypt(hospital.gethPassword()));
        }
        hospitalService.update(hospital);
        return "forward:showhospital.ad";
    }
    @RequestMapping("deletehospital.ad")
    public String deleteHospital(Long hId){
        hospitalService.delete(hId);
        return "forward:showhospital.ad";
    }

//    @RequestMapping("checkaccount.ad")
//    @ResponseBody
//    public Map<String,Object> checkAccount(String hAccount){
//        boolean isExist=hospitalService.findByAccount(hAccount);
//        Map<String,Object>retMsg=null;
//        if(isExist){
//            retMsg.put("accountExist","true");
//        }else{
//            retMsg.put("accountExist","false");
//        }
//        return retMsg;
//    }


//    订单部分管理===================================================================================
    @RequestMapping("showorder.ad")
    public String showOrder(Model model){
        List<Map<String,Object>> list=ordersService.findAll();
        model.addAttribute("list",list);
        return "adminorder";
    }
    @RequestMapping("updateorder.ad")
    public String updateOrder(AdminOrderUpdate adminOrderUpdate){
        Orders orders=new Orders();
        orders.setoId(adminOrderUpdate.getoId());
        byte i=0;
        if(adminOrderUpdate.getoStatus().equals("未支付")){
            i=1;
        }else if(adminOrderUpdate.getoStatus().equals("已支付")){
            i=2;
        }else if(adminOrderUpdate.getoStatus().equals("已完成")){
            i=3;
        }
        orders.setoStatus(i);
        orders.setoPrice(adminOrderUpdate.getoPrice());
        ordersService.update(orders);
        return "forward:showorder.ad";
    }



}
