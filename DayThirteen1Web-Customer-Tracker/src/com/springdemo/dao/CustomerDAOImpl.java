package com.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	Session currentSession;
	
	//As we are adding service layer,so we are removing @Transactional from here
	@Override
	//@Transactional
	public List<Customer> getCustomers() {
		
	 currentSession =sessionFactory.getCurrentSession();
	//	currentSession.beginTransaction();
		Query<Customer> query = currentSession.createQuery("from Customer order by lastName",Customer.class);
		
		List<Customer> customers =query.getResultList();
	//	currentSession.getTransaction().commit();
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		 currentSession =sessionFactory.getCurrentSession();
		 
		 //we are using saveorupdate method because we r using same method for savin and updating data
		 currentSession.saveOrUpdate(theCustomer);
		
	}

	@Override
	public List<Customer>  searchCustomer(String theName) {
		 currentSession =sessionFactory.getCurrentSession();
				Query<Customer> query = currentSession.createQuery("from Customer where firstName = '"+theName+"' OR lastName = '"+theName+"'" ,Customer.class);
				
				List<Customer> customers =query.getResultList();
			
			return customers;
		
	}

	@Override
	public Customer getCustomer(int theId) {
		
		currentSession = sessionFactory.getCurrentSession();
		
		Customer theCustomer = currentSession.get(Customer.class, theId);
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		currentSession = sessionFactory.getCurrentSession();
		
		Query query = currentSession.createQuery("delete from Customer where id=: customerId");
		
		query.setParameter("customerId", theId);
		
		query.executeUpdate();
		
	}

	

	

	


	
}
