package com.hibernate.practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			List<Student> students1 = session.createQuery("from Student").getResultList();
			for (Student student : students1) {
				System.out.println(student);
			}
			
			System.out.println();
			System.out.println("Students based last name ");
			List<Student> students2 = session.createQuery("from Student s where s.lastName='pqr'").getResultList();
			for (Student student : students2) {
				System.out.println(student);
			}
			
			System.out.println();
			System.out.println("Student based on first and last name");
			List<Student> students3 = session.createQuery("from Student s where s.firstName='Sachin'"
					+ "OR s.lastName='Dhoni'").list();
			for(Student s : students3) {
				System.out.println(s);
			}
			
			System.out.println();
			System.out.println("Using like clause");
			List<Student> students4 = session.createQuery("from Student s where "
					                                    + "s.email LIKE '%gmail.com'").list();
			
			for (Student student : students4) {
				System.out.println(student);
			}
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println("Exception is : ");
			e.printStackTrace();
		}finally {
			factory.close();
		}
	}

}
