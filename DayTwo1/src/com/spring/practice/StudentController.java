package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {
	
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	
	
	
	@RequestMapping("/showStudentForm")
	public String showForm(Model model) {
		
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		return "showStudent" ;
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println("theStudent: "+theStudent.getFirstName()+""+theStudent.getLastName());
		return "studentConfirmation";
	}

}
