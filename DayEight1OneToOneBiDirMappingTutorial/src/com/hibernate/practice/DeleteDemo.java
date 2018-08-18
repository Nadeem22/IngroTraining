package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, 5);
			
			session.delete(instructorDetail);
			
			session.getTransaction().commit();
			
			System.out.println("Above object deleted with associated object");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			factory.close();
		}

	}

}
