package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			Instructor instructor = new Instructor("Rupali","Wakudkar","rupaliw26@gmail.com");
			
			InstructorDetail instructorDetail = new InstructorDetail("luv2code","reading");
			
			instructor.setInstructorDetail(instructorDetail);
			
			session.beginTransaction();
			
			System.out.println("before saving "+instructor);
			
			session.save(instructor);
			
			System.out.println("before saving "+instructor);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

}
