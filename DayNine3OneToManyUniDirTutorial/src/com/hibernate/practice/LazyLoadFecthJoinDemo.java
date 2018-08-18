package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class LazyLoadFecthJoinDemo {

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
			
		Query<Instructor> query = session.createQuery("select i from Instructor i "
				+ "JOIN FETCH i.courses "
				+ "where i.id=:theInstructorId",
				Instructor.class);
		
		query.setParameter("theInstructorId", theId);
		
		Instructor tempInstructor = query.getSingleResult();
			
			System.out.println("Instructor object is "+tempInstructor);
			
		
			
 			session.getTransaction().commit();
 			
 			//we are closing session 
 			session.close();
 		
			
          
			System.out.println("Courses are "+tempInstructor.getCourses());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

}
