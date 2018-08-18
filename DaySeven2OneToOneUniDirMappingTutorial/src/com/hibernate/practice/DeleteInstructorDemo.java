package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Instructor tempInstructor = session.get(Instructor.class, 4);
			
			
			session.delete(tempInstructor);
			
			session.getTransaction().commit();
			
			System.out.println("Object Deleted");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}

	}

}
