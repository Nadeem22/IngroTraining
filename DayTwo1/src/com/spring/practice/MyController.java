package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class MyController {
	
	
	@RequestMapping("/form1")
	public String showForm() {
		return "displayForm1";
	}
	
	@RequestMapping("/processForm1")
	public String processForm1Method(@RequestParam("studentName") String theName,@RequestParam("city") String theCity,Model model) {
		String msg = "Hello "+theName+". City is "+theCity;
		
		model.addAttribute("message", msg);
		return "showData";
	}

}
