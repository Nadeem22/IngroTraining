package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			Instructor myInstructor = new Instructor("madhu","patel","madhu@luv2code.com");
			
			InstructorDetail instructorDetail = new InstructorDetail("luv2code","Guitar");
			
			myInstructor.setInstructorDetail(instructorDetail);
			
			session.beginTransaction();
			///Saving Instructor object,it will save InstructorDetail object too because of cascadeType.ALL
			System.out.println("Saving Instructor object "+myInstructor);
			session.save(myInstructor);
			System.out.println();
			System.out.println("After saving Object " +myInstructor);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

}
