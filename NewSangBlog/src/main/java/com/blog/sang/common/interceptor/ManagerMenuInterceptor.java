package com.blog.sang.common.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.blog.sang.manager.menu.domain.Menu;
import com.blog.sang.manager.menu.service.ManagerMenuService;

public class ManagerMenuInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	ManagerMenuService managerMenuService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return super.preHandle(request, response, handler);
	}

	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		List<Menu> managerMenuList = managerMenuService.findAllMenuOrder();
		
		for (Menu a : managerMenuList) {
			System.out.println("test: "  + a.getMenuName());
		}
		
		modelAndView.addObject("managerMenuList", managerMenuList);
		
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}
