package org.main.generic;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

public class TestingGenericUtility{
	public static void main(String [] args) throws IOException {
		//int randomNumber= new JavaUtilty().getrandomnuber(10000);
		ExcelUtility excelUtility  =new ExcelUtility();
		try {
			excelUtility.openExcel(IConstantPath.EXCEL_PATH);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = excelUtility.getdatafromExcel("opportuintits", 0, 1);
		System.out.println(data);
		//System.out.println(data);
		FileUtility fileutility = new FileUtility();
				
		String browser = fileutility.getdatafromporpertyfile(IConstantPath.PROPERTY_FILE_PATH);
		
		System.out.println(browser);
		
		
	
		
		
	}

}
