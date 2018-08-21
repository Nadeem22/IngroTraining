package com.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.dao.CustomerDAO;
import com.springdemo.dao.CustomerDAOImpl;
import com.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	 CustomerDAO customerDAO;
//	 CustomerDAO customerDAO = new CustomerDAOImpl();
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		model.addAttribute("customers",theCustomers);
		return "list-customers";
	}

}
