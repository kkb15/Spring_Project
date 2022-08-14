package com.example.SmallWebapp;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SmallWebapp.dao.UserRepo;


@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/register")
	public 	String show() {
		return "registration";
	}
	
	
	
	@RequestMapping("/userDetail")
	public String display(UserRegister reg) {
		repo.save(reg);
		return "operation";
	}
	
	@RequestMapping("/operation")
	public ModelAndView operation(Long UId, String ddlFlag) {
		
		
	if(ddlFlag.equals("select")) {
		
	UserRegister reg=repo.findById(UId).orElse(new UserRegister());
	return selectRecords(reg);
	}
		
		else if(ddlFlag.equals("delete")) {
			repo.deleteById(UId);
			
		}
		
		else if(ddlFlag.equals("update")) {
			UserRegister reg=repo.findById(UId).orElse(new UserRegister());
			reg.setUName("xyz_update_name");
			repo.save(reg);
			
		}
		
		else {
			System.out.println(repo.selectRecordByName("Kamal"));
		}
		
		return new ModelAndView("operation");
	}
	public ModelAndView selectRecords(UserRegister reg){
			
			ModelMap model=new ModelMap();
			model.put("name", reg.getUName());
			model.put("Email", reg.getEmailId());
			model.put("Gender", reg.getGender()==Integer.parseInt("1")?"Male":"Female");
			model.addAttribute("hobbies", reg.getHobby());
			
			
			ModelAndView mv = new ModelAndView("user-define");
			mv.addObject("regObj",model);
			return mv;

}
	
	}
