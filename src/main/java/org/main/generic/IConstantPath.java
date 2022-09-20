package org.main.generic;

public interface IConstantPath {
	String PROJECT_PATH=System.getProperty("user.dir");
	
	 String PROPERTY_FILE_PATH=PROJECT_PATH + "./src/test/resources/commondata.properties";
	String EXCEL_PATH =PROJECT_PATH +  "./src/test/resources/opportuinties.xlsx";
	String  DB_URL="jdbc:mysql://localhost:3306/tyss";

}
