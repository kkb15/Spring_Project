package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/index")
	public String show() {
		return "index";
	}
	
	// Used for multiple values
//	@RequestMapping("/result")
//	public String output(HttpServletRequest request) {
//		System.out.println("value:"+request.getParameter("value"));
//		HttpSession session = request.getSession();
//		session.setAttribute("data", request.getParameter("value"));
//		return "result";
//	}
	
	@RequestMapping("/result")
	 
	public ModelAndView output(@RequestParam("xy") String value) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result");
		mv.addObject("data",value);
		return mv;
		
		
	}

}
