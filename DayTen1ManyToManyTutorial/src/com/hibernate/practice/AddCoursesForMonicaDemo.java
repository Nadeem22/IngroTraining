package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddCoursesForMonicaDemo {

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
			
			Student tempStudent = session.get(Student.class,1);
			System.out.println("Student is "+tempStudent);
			
			Course tempCourse1 = new Course("PHP");
			Course tempCourse2 = new Course("Dance");
			
			System.out.println("Adding Student");
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			
			System.out.println("Saving courses for Student");
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			System.out.println("Saved courses are ");
			System.out.println(tempCourse1);
			System.out.println(tempCourse2);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}

}
