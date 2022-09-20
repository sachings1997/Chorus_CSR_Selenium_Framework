package org.Chorus.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchDataFromDataBase {
	public static void main(String[] args ) throws SQLException {
		//step-1---> create object Driver
		Driver dbdriver= new Driver();
		//step-2----> register the driver
		DriverManager.registerDriver(dbdriver);
		//step-3--->get/establish the database connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");
	try {
			//step-4---> create statement 
			Statement statement = connection.createStatement();
		
			ResultSet result = statement.executeQuery("select * from employees");
			while(result.next()) {
				System.out.println(result.getString("emp_name"));
			}
				
			}
			finally {
				connection.close();
				System.out.println("connection sueccfully close");
			}
		
		
	}
   

	
}


						
	
		
			

	
	

