package org.Chorus.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data_Numercalvalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/commondata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		int data = (int) wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		int i=data;
		System.out.println(i);
		// TODO Auto-generated method stub
		 
	}

}


