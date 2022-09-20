package org.main.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;




public class FileUtility {
	/**
	 * 
	 * @param PropertyFilePath
	 * @param key
	 * @return
	 */
Properties property;
public String getdatafromporpertyfile(String key) {
   String value = property.getProperty(key);
	
	return value;
}
	public void intaillizedPropertyfile(String propertyfilepath ) throws IOException {
		FileInputStream fis = new FileInputStream(propertyfilepath);
		property = new Properties();
		property.load(fis);
		
	}
	

		
	}
		
         
         
	
		
	 
		
	
			
			
	    
		

	


