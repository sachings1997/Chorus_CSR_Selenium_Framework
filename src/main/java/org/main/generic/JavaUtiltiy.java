package org.main.generic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtiltiy {
	public int getrandomnuber(int limit) {
		return new Random().nextInt(limit);
		
	}
 public Object convertStringIntoLong(String data,DataType strategy) {
	 Object obj=null;
	 if(strategy.toString().equalsIgnoreCase("long")) {
		 obj=Long.parseLong(data);
		 
	 }
	 else if(strategy.toString().equalsIgnoreCase("int")) {
		 obj=Integer.parseInt(data);
		 
		 
	 }
	 else if(strategy.toString().equalsIgnoreCase("double")) {
		 obj=Double.parseDouble(data);
	 }
	return obj;
	
	 
 }
public int getrandomnuber(String timeout, DataType l) {
	// TODO Auto-generated method stub
	return 0;
}
   public String currentTime() {
	   Date date = new Date();
	   SimpleDateFormat sdf= new SimpleDateFormat("dd_MM_yy_hh_mm_sss");
	 String actulDate = sdf.format(date);
			   
	return actulDate;
	   
   }
}
 

