package com.xmu.controller;

import com.xmu.entity.Doctor;
import com.xmu.entity.Hospital;
import com.xmu.entity.Room;
import com.xmu.service.DoctorService;
import com.xmu.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author lsy
 */
@Controller
public class RoomController {

    @Autowired
    private RoomService roomService;
    @Autowired
    private DoctorService doctorService;

    /**
    * 查到本医院的所有诊室
     */
    @RequestMapping("showrooms.hp")
    public String showRooms(Model model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")!=null){
            Hospital hospital = new Hospital();
            hospital = (Hospital)request.getSession().getAttribute("hospital");
            List<Room> list = roomService.findByHospitalId(hospital.gethId());
            model.addAttribute("list",list);
            return "rooms";
        }else{
            request.setAttribute("msg","请先登录系统！");
            request.getRequestDispatcher("hospitallogin.jsp").forward(request,response);
            return "../../index";
        }
    }

    /**
     * 添加诊室 ： 诊室初始人数rNum自动设为0
     */
    @RequestMapping("addrooms.hp")
    public String addRooms(Room room, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")!=null){
            Hospital hospital = new Hospital();
            hospital = (Hospital)request.getSession().getAttribute("hospital");
            Byte bt = 0;
            room.setrNum(bt);
            room.setrHid(hospital.gethId());
            roomService.save(room);
            return "forward:showrooms.hp";
        }else{
            request.setAttribute("msg","请先登录系统！");
            request.getRequestDispatcher("hospitallogin.jsp").forward(request,response);
            return "../../index";
        }
    }

    /**
     * 修改诊室 ： 只能修改 desc,address,rMax
     */
    @RequestMapping("modifyrooms.hp")
    public String modifyRooms(Room room, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")!=null){
            roomService.update(room);
            return "forward:showrooms.hp";
        }else{
            request.setAttribute("msg","请先登录系统！");
            request.getRequestDispatcher("hospitallogin.jsp").forward(request,response);
            return "../../index";
        }
    }

    /**
     * 删除诊室 ： 删除后，诊室里的医生的 rId 置为0，需要重新为这些医生分配诊室
     */
    @RequestMapping("removerooms.hp")
    public String removeRooms(Long rId, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")!=null){
            roomService.delete(rId);
            List<Doctor> list = doctorService.findByRoomId(rId);
            for (Doctor doctor:list) {
                doctor.setdRid(0L);
                doctorService.update(doctor);
            }
            return "forward:showrooms.hp";
        }else{
            request.setAttribute("msg","请先登录系统！");
            request.getRequestDispatcher("hospitallogin.jsp").forward(request,response);
            return "../../index";
        }
    }

}
