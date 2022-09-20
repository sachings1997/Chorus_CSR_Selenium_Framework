package org.main.generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	Connection connection;
	public List<String> getdatafromdatabase(String qurey,String coloumname) throws SQLException{
		Statement statement = connection.createStatement();
		ResultSet resulth = statement.executeQuery(qurey);
		List<String> list= new ArrayList<>();
		while(resulth.next()) {
			list.add(resulth.getString(coloumname));
			
		}
		return list;
		
	}
	public void openDBconnection(String dburl,String dbusername,String password) throws SQLException {
		Driver dbdriver= new Driver();
		DriverManager.registerDriver(dbdriver);
		connection=DriverManager.getConnection(dburl,dbusername,password);
		
		
		
	}
	public void closeDb() throws SQLException {
		connection.close();
	}

}
