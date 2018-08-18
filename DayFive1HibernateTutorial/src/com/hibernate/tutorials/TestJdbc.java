package com.hibernate.tutorials;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database "+jdbcUrl);
			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection established");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
