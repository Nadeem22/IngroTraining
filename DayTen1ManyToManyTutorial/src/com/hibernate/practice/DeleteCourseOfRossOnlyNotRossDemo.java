package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCourseOfRossOnlyNotRossDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Instructor.class)
				                 .addAnnotatedClass(InstructorDetail.class)
				                 .addAnnotatedClass(Course.class)
				                 .addAnnotatedClass(Review.class)
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			int courseId = 12;
			
			Course tempCourse = session.get(Course.class, courseId);
			
			System.out.println("Deleting course but not student :"+tempCourse);
			session.delete(tempCourse);
			System.out.println("Course Deleted");
		
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}

}
