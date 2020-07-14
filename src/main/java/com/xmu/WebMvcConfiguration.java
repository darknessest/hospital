package com.xmu;

import com.xmu.interceptor.AdminSessionInterceptor;
import com.xmu.interceptor.SessionInterceptor;
import com.xmu.interceptor.UserSessionInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootConfiguration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter{

	//默认主页配置
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:index.jsp");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		super.addViewControllers(registry);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AdminSessionInterceptor()).addPathPatterns("/**.ad");
		registry.addInterceptor(new UserSessionInterceptor()).addPathPatterns("/**.us");

	}
	
	
	
	
}
