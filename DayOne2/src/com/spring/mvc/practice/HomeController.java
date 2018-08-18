package com.spring.mvc.practice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/showForm1")
	public String showFormPage1() {
		return "formOne";
	}
	
	@RequestMapping("/processForm1")
	public String processFormPage1() {
		return "displayForm1";
	}
	
	@RequestMapping("/showForm2")
	public String showFormPage2() {
		return "formTwo";
	}
	@RequestMapping("/processForm2")
	public String processFormPage2(HttpServletRequest req , Model model) {
		
		String name = req.getParameter("name");
		
		String s = name.toUpperCase();
		
		model.addAttribute("message", "Hello.........."+s);
		
		return "displayForm2";
	}
}
