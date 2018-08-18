package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeletingStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                  .configure("hibernate.cfg.xml")
				                  .addAnnotatedClass(Student.class)
				                  .buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			///Deleting Student way 1
			session.beginTransaction();
			Student student = session.get(Student.class, 10);
						
			session.delete(student);
		
			System.out.println("student deleted with id 1");
			
			//Deleting student way 2
			session.createQuery("delete from Student where id=7").executeUpdate();
			System.out.println("student deleted with id 2");
			
		
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
