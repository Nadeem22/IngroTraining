package com.spring.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String show() {
		
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String process() {
		return "hello";
	}
	@RequestMapping("/showForm2")
	public String showform() {
		
		return "helloworld-form2";
	}
	
	@RequestMapping("/processFormTwo")
	public String processTwo(HttpServletRequest req,Model model) {
		String name = req.getParameter("studentName");
		String msg = "Hii "+name.toUpperCase();
		model.addAttribute("message",msg);
		
		return "hello2";
		
	}
}
