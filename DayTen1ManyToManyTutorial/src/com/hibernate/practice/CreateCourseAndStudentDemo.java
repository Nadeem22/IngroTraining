package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndStudentDemo {

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
			
			Course tempCourse = new Course(".Net");
		
			
			System.out.println("Saving Course");
			System.out.println("Course object "+tempCourse);
			session.save(tempCourse); 
			
			Student tempStudent1 = new Student("Monica","Geller","monica@gmail.com");
			Student tempStudent2 = new Student("Ross","Geller","ross@gmail.com");
			
			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);
			
			System.out.println("saving students");
			session.save(tempStudent1);
			System.out.println(tempStudent1);
			session.save(tempStudent2);
			System.out.println(tempStudent2); 
			
			System.out.println("Saved students "+tempCourse.getStudents());
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

}
