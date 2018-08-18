package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorFromInstructorDetail {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			int theId = 3;
			session.beginTransaction();
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class,theId);
			
			System.out.println("Instructordetail object "+tempInstructorDetail);
			
			System.out.println("Instructor Object "+tempInstructorDetail.getInstructor());
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {       
			factory.close();
		}

	}

}
