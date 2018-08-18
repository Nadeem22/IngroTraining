package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			///UPDATING SINGLE RECORD
			session.beginTransaction();
			
			//Getting student
			Student student = session.get(Student.class, 3);
			
			//Updating first name(into memory)
			student.setEmail("sachin@ingroinfo.com");
			
			//Commiting (updating data into database)
		//	session.getTransaction().commit();
			System.out.println("student updated");
			
	//		session = factory.getCurrentSession();
	//		session.beginTransaction();
			
			
			//UPDATING ALL RECORDS
			session.createQuery("update Student set email='car@ingoinfo.com'").executeUpdate();
			session.getTransaction().commit();
			System.out.println("students are updated");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

}
