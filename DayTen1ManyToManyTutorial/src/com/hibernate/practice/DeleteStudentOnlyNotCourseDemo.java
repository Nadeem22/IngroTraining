package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentOnlyNotCourseDemo {

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
			
			
			
			Student tempStudent = session.get(Student.class, 1);
			
			System.out.println("Deleting student but not course :"+tempStudent);
			session.delete(tempStudent);
			System.out.println("Student Deleted");
		
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}

}
