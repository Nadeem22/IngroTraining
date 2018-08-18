package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertEmployeeDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Employee.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			//Employee employee1 = new Employee("Rupali","Wakudkar","IngroInfo");
			Employee employee2 = new Employee("Prashanti","Ganne","IngroInfo");
			
			session.beginTransaction();
			
		//	session.save(employee1);
			session.save(employee2);
			
			session.getTransaction().commit();
			
			System.out.println("Employees are inserted successfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

}
