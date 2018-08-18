package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String homeMethod() {
		return "home";
	}
	@RequestMapping("/Form1-request")
	public String showForm1Method() {
		return "Form1";
	}
	@RequestMapping("/processForm1")
	public String processForm1Method(@RequestParam ("name") String theName,Model model) {
		
		model.addAttribute("name",theName);
		return "form1Data";
	}
	@RequestMapping("/studentForm-request")
	public String showStudentForm(Model model) {
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		return "showStudentForm";
	}
	
	@RequestMapping("/processStudent")
	public String processStudentForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getCountry());
		return "studentConfirm";
	}
	
}
