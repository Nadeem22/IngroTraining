package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentControlller {

	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	@RequestMapping("/showStudent")
	public String showStudentForm(Model model) {
		
	Student theStudent = new Student();
	model.addAttribute("student",theStudent);
		return "studentForm";
	}
	
	@RequestMapping("/processStudent")
	public String processStudent(@ModelAttribute ("student") Student theStudent) {
		
		System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getCountry());
		String[]  arr = theStudent.getOperatingSystems();
		for(String s : arr) {
		System.out.println(s);
		}
		return "confirmStudent";
	}
	
	
	
}
