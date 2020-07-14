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
import java.util.Objects;

/**
 * @author lsy
 */
@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;
    @Autowired
    private RoomService roomService;

    /**
     *  查找本医院所有医生
     */
    @RequestMapping("showdoctors.hp")
    public String showDoctors(Model model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")!=null){
            Hospital hospital = new Hospital();
            hospital = (Hospital)request.getSession().getAttribute("hospital");
            List<Doctor> list = doctorService.findByHospitalId(hospital.gethId());
            model.addAttribute("list",list);
            return "doctors";
        }else{
            request.setAttribute("msg","请先登录系统！");
            request.getRequestDispatcher("hospitallogin.jsp").forward(request,response);
            return "../../index";
        }
    }

    /**
     *  添加医生 ： 校验填入的诊室是否存在，且是否还有空位 ； 添加医生成功后，相应的诊室的rNum会加1
     */
    @RequestMapping("adddoctors.hp")
    public String addDoctors(Doctor doctor, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")!=null) {
            Hospital hospital = new Hospital();
            hospital = (Hospital)request.getSession().getAttribute("hospital");
            Long rId = doctor.getdRid();
            List<Room> listRooms = roomService.findByHospitalId(hospital.gethId());
            for (Room aRoom : listRooms) {
                if (Objects.equals(aRoom.getrId(), rId)&&((aRoom.getrMax()-aRoom.getrNum())>0)) {
                    doctor.setdHid(hospital.gethId());
                    Byte bt = (byte)(aRoom.getrNum()+1);
                    aRoom.setrNum(bt);
                    roomService.update(aRoom);
                    doctorService.save(doctor);
                    return "forward:showdoctors.hp";
                }
            }
            request.setAttribute("msg","请输入正确的诊室编号！");
            return "forward:showdoctors.hp";
        }else{
            request.setAttribute("msg","请先登录系统！");
            request.getRequestDispatcher("hospitallogin.jsp").forward(request,response);
            return "../../index";
        }
    }

    /**
     *  修改医生信息 : 先判断诊室的合法性 ； 原诊室的rNum-1 , 新诊室的rNum+1
     */
    @RequestMapping("modifydoctors.hp")
    public String modifyDoctors(Doctor doctor, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")!=null) {
            Hospital hospital = new Hospital();
            hospital = (Hospital)request.getSession().getAttribute("hospital");
            Doctor doctor1 = doctorService.findByDoctorId(doctor.getdId());
            Long rId1 = doctor1.getdRid();
            List<Room> listRoom1 = roomService.findByHospitalId(hospital.gethId());
            for (Room room1:listRoom1) {
                if(Objects.equals(room1.getrId(), rId1)){
                    Byte bt1 = (byte)(room1.getrNum()-1);
                    room1.setrNum(bt1);
                    roomService.update(room1);
                }
            }

            Long rId = doctor.getdRid();
            List<Room> listRooms = roomService.findByHospitalId(hospital.gethId());
            for (Room aRoom : listRooms) {
                if (Objects.equals(aRoom.getrId(), rId)&&((aRoom.getrMax()-aRoom.getrNum())>0)) {
                    Byte bt = (byte)(aRoom.getrNum()+1);
                    aRoom.setrNum(bt);
                    roomService.update(aRoom);
                    doctorService.update(doctor);
                    return "forward:showdoctors.hp";
                }
            }
            request.setAttribute("msg","请输入正确的诊室编号！");
            return "forward:showdoctors.hp";
        }else{
            request.setAttribute("msg","请先登录系统！");
            request.getRequestDispatcher("hospitallogin.jsp").forward(request,response);
            return "../../index";
        }
    }

    /**
     *  删除医生 ： 相应的诊室的 rNum -1
     */
    @RequestMapping("removedoctors.hp")
    public String removeDoctors(Long dId, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("hospital")!=null) {
            Hospital hospital = new Hospital();
            hospital = (Hospital)request.getSession().getAttribute("hospital");
            Doctor doctor = doctorService.findByDoctorId(dId);
            Long rId = doctor.getdRid();
            Room room = roomService.findByRoomId(rId);
            Byte bt = (byte)(room.getrNum()-1);
            room.setrNum(bt);
            roomService.update(room);
            doctorService.delete(dId);
            return "forward:showdoctors.hp";
        }else{
            request.setAttribute("msg","请先登录系统！");
            request.getRequestDispatcher("hospitallogin.jsp").forward(request,response);
            return "../../index";
        }
    }

}
