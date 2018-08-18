package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LazyVsEagerDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .addAnnotatedClass(Course.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			int theId = 1;
			
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			System.out.println("Instructor object is "+tempInstructor);
			
		//	System.out.println("Courses are "+tempInstructor.getCourses());
			
 			session.getTransaction().commit();
 			
 			//we are closing session to check lazy loading
 			session.close();
 			
           System.out.println("Instructor object is "+tempInstructor);
			
           //here it should fail as courses are lazy loaded
			System.out.println("Courses are "+tempInstructor.getCourses());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

}
