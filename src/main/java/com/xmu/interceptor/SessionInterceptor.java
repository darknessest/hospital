package com.xmu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class SessionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session.getAttribute("admin")!=null){
			return true;
		}else{
			request.setAttribute("msg", "请先登录系统！");
			request.getRequestDispatcher("adminlogin.jsp").forward(request, response);
			return false;
		}
	}

	
}
