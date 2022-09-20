package org.Chorus.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetch_Property_File {

	public static void main(String[] args) throws IOException {
		// step 1 convert physical file into java readable java object
		FileInputStream fis= new FileInputStream("./src/test/resources/commondata.properties");
		// step2 create object to properties
		Properties porperty= new Properties();
		// step load all the keys 
		porperty.load(fis);
		//step 4 fetch data
		String url = porperty.getProperty("url").trim();
		String username = porperty.getProperty("username").trim();
		String password = porperty.getProperty("password").trim();
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
