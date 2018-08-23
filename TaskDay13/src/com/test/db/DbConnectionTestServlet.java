package com.test.db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


@WebServlet("/DbConnectionTestServlet")
public class DbConnectionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "springstudent";
		String pass = "springstudent";
		String driver = "com.mysql.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		
		try {
			 Class.forName(driver);
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			PrintWriter out = response.getWriter();
			out.println("Connection establised successfully....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
