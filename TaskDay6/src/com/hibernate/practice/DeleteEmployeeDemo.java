package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployeeDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Employee.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			Employee emp = new Employee("Rashmi","Wankhade","Zenser");
			
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			System.out.println("object saved");
			
			///Now delete object with delete method
			 session = factory.getCurrentSession();
			 session.beginTransaction();
			 session.delete(emp);
			 session.getTransaction().commit();
			 System.out.println();
			 System.out.println("Object deleted which had just saved");
			
			 //delete object with primary key
			 session = factory.getCurrentSession();
			 session.beginTransaction();
			 session.createQuery("delete from Employee where id = 7").executeUpdate();
			 session.getTransaction().commit();
			 System.out.println();
			 System.out.println("Object deleted whose id is 3");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

}
