package com.cerner.WebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	 
	@RequestMapping("/regform")
	public String register() {
		return "Registration";
	}
	@RequestMapping("/addStudent")
	public ModelAndView StudentDetails(Students sreg)
	{
		ModelMap model=new ModelMap();
		model.addAttribute("id", sreg.getId());
		model.addAttribute("name", sreg.getName());
		model.addAttribute("email", sreg.getEmail());
		model.addAttribute("password", sreg.getPassword());
		model.addAttribute("gender", sreg.getGender()==Integer.parseInt("1") ? "Male": "Female");
		model.addAttribute("dob", sreg.getDob()); 
 		
		ModelAndView MV=new ModelAndView("StudentInfo");
		MV.addObject("regObj",sreg);
		
		return MV;
	}
}
