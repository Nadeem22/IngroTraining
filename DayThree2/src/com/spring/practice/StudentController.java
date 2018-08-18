package com.spring.practice;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	@RequestMapping("/showStudent")
	public String showStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "studentForm";
	}
	@RequestMapping("/processStudent")
	public String processStudentForm(@Valid @ModelAttribute("student") Student theStudent,
			BindingResult theBindingResult) {
		if(theBindingResult.hasErrors()) {
			return "studentForm";
		}
		return "confirmStudent";
	}
}
