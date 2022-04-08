package com.cerner.WebApplication;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@Autowired 
	StudentsRepo repo;
	@RequestMapping("/")
	public String addStudent() {
		return "Registration";
	}
	@RequestMapping("/addStudent")
	public String addStudent(Students students)
	{
		repo.save(students);
		return "Registration"; 	
	}
	@RequestMapping("/getStudentDetails")
	public String getRegistration()
	{
		return "StudentInfo";
	}
	@PostMapping("/getStudentDetails")
	public ModelAndView getStudentDetails(@RequestParam String id)
	{ 
		ModelAndView MV = new ModelAndView("StudentsData");
		Students students = repo.findById(id).orElse(null);
		MV.addObject(students);
		return MV;
	}
	@RequestMapping("/students/{id}")
	@ResponseBody
	public  Optional<Students> getStudentDetails1(@PathVariable("id")String id)
	{
		return repo.findById(id);
	}
	@RequestMapping("/students")
	@ResponseBody
	public List<Students> getStudentDetails1()
	{
		return repo.findAll();
	}
	@PostMapping("/students")
	public Students getStudentDetails2(@RequestBody Students students)
	{
		repo.save(students);
		return students;
	}
	@PostMapping("/students")
	public Students getStudentDetails3(@PathVariable("id") String id)
	{
		Students std = repo.getById(id);
		return std;
	}
//	public ModelAndView getStudentDetails(Students sreg)
//	{
//		ModelMap model=new ModelMap();
//		model.addAttribute("id", sreg.getId());
//		model.addAttribute("name", sreg.getName());
//		model.addAttribute("email", sreg.getEmail());
//		model.addAttribute("password", sreg.getPassword());
//		model.addAttribute("gender", sreg.getGender()==Integer.parseInt("1") ? "Male": "Female");
//		model.addAttribute("dob", sreg.getDob()); 
// 		
//		ModelAndView MV=new ModelAndView("StudentInfo");
//		MV.addObject("regObj",sreg);
//		
//		return MV;
//	}
}
