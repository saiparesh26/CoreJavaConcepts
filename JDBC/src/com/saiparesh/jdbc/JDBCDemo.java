package com.saiparesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database"; 
		
		try {
			//Establish connection object			
			Connection connection =  DriverManager.getConnection(url,"root", "password123");
			
			//Create a statement object to send to  the database
			Statement statement = connection.createStatement();
			
			//Execute the statement object			
			ResultSet resultSet =  statement.executeQuery("select * from employees_tbl");
			
//			statement.executeUpdate("insert into employees_tbl (id, name, dept , salary) "
//					+ "values (600, \"Priya\", \"Sales\", 30000)");
//			
//			statement.executeUpdate("insert into employees_tbl ( name, dept , salary) "
//					+ "values (\"Puru\", \"Dev\", 20000)");
			
			statement.executeUpdate("delete from employees_tbl where id = 602 ");
			
			//Process the result
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
