package com.springdemo.service;

import java.util.List;

import com.springdemo.entity.Customer;

public interface CustomerService {

	List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	List<Customer>  searchCustomer(String theName);

	
}
