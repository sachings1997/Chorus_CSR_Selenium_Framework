package org.Chorus.practice;

import java.sql.SQLException;
import java.util.List;

import org.main.generic.DataBaseUtility;
import org.openqa.selenium.devtools.v102.database.Database;
     
public class Fetch_Data_From_Database {

	private static final String IConstantPath = null;

	public static void main(String[] args) throws SQLException {
		DataBaseUtility databaseutility = new DataBaseUtility();
		//databaseutility.openDBconnection(IConstantPath.  IConstantPath, IConstantPath);
		List<String> data = databaseutility.getdatafromdatabase("select * from employees", "emp_name");
		System.out.println(data);
		databaseutility.closeDb();
		
		// TODO Auto-generated method stub

	}

}
