package com.hutech.employe.config;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hutech.employe.LogTimeIntercptor;
@Configuration
public class EmployeInterceptorConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LogTimeIntercptor()).addPathPatterns("/employe");
	}
    
}
