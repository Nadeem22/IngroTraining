package com.hibernate.practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetieveEmployeeDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Employee.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			//// Retrieving single  object
			Employee emp4 = new Employee("Megha","XYZ","Persistance");
			session.beginTransaction();
			
			session.save(emp4);
			
			Employee emp = session.get(Employee.class,1);
			
			System.out.println("Employee Data is : " );
			System.out.println(emp);
			
			///Retrieving multiple objects .....(Selecting All employees)
			
			List<Employee> employees = session.createQuery("from Employee").list();
			
			System.out.println();
			System.out.println("Retrieving all employees");
			
			for (Employee employee : employees) {
				System.out.println(employee);
			}
			
			////finding employees for given company
			
			List<Employee> employees1 = session.createQuery("from Employee"
					+ " where company = 'ingroinfo'").list();
			System.out.println();
			System.out.println("All Employees having company IngoInfo");
			for (Employee employee : employees1) {
				System.out.println(employee);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}

	}

}
