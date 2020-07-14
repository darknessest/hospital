package com.xmu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserSessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        HttpSession session = request.getSession();
        if(session.getAttribute("user")!=null){
            return true;
        }else{
            request.setAttribute("msg", "请先登录系统！");
            request.getRequestDispatcher("userlogin.jsp").forward(request, response);
            return false;
        }
    }
}
