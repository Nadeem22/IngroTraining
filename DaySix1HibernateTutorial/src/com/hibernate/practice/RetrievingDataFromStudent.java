package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class RetrievingDataFromStudent {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                  .configure("hibernate.cfg.xml")
				                  .addAnnotatedClass(Student.class)
				                  .buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			//Creating and saving object
			Student student = new Student("abc","pqr","abc@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("Before adding, id :"+student.getId());
			
			System.out.println("Student object before saving :" + student);
			
			session.save(student);
			
		//	session.getTransaction().commit();
			
			//Retrieving Object
			
			System.out.println("After adding, id :"+student.getId());
			
			//factory.getCurrentSession();
			//session.beginTransaction();
			
			
			
			Student myStudent = session.get(Student.class, student.getId());
			
			
			
			System.out.println("Student info : "+ myStudent);
			
			session.getTransaction().commit();
			System.out.println("done!");
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
		}

}
