package com.newlecture.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DetailController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	System.out.println("detail controller");
		
		ModelAndView mv = new ModelAndView("notice.detail");
		//mv.addObject("data", "Hello Spring MVC ~ ");
		//mv.setViewName("/WEB-INF/view/notice/index.jsp");
		//prefix : /WEB-INF/view/
		//suffix : .jsp
		return mv;

	}

}
