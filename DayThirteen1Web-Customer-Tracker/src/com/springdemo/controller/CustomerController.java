package com.springdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springdemo.dao.CustomerDAO;
import com.springdemo.dao.CustomerDAOImpl;
import com.springdemo.entity.Customer;
import com.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
 private CustomerService CustomerService;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		List<Customer> theCustomers = CustomerService.getCustomers();
		
		model.addAttribute("customers",theCustomers);
		return "list-customers";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
	Customer theCustomer = new Customer();
	model.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute ("customer") Customer theCustomer) {
		CustomerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
		
	}
	

	@RequestMapping("/searchCustomerByName")
	public String searchCustomers(HttpServletRequest req,Model model) {
		String theName = req.getParameter("fname");
	//	CustomerService.searchCustomer(theName);

		List<Customer> theCustomers = CustomerService.searchCustomer(theName);
		
		model.addAttribute("customers",theCustomers);
		return "list-customers";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showForUpdate(@RequestParam ("customerId") int theId
			                     ,Model model) {
			
		Customer theCustomer = CustomerService.getCustomer(theId); 
		
		model.addAttribute("customer",theCustomer);
		
		return "customer-form";
		
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomerData(@RequestParam ("customerId") int theId) {
		
		CustomerService.deleteCustomer(theId);
		
		return "redirect:/customer/list";
		
	}
	
}
