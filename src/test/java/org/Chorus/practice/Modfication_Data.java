package org.Chorus.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Modfication_Data {



	public static void main(String[] args) throws SQLException {
		Driver dbdriver= new Driver();
		//step-2----> register the driver
		DriverManager.registerDriver(dbdriver);
		//step-3--->get/establish the database connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");
		try {
			
				 Statement statement = connection.createStatement();
				 int result = statement.executeUpdate("insert into employees values(5,'sachings',5687876,'Banagalore');");
				 
				System.out.println("data suessfully updated");
				
		}
		finally {
			connection.close();
		}
	}

}
