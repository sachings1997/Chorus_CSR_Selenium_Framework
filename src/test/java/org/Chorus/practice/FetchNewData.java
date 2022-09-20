package org.Chorus.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchNewData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
 {
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("testcase");
	//	step 2---> get control of existing row 
		Row row = sheet.getRow(2);
		// step 3---> create row 
	        Cell cell = row.createCell(3);
	        // step -1--> fetch data 
	        cell.setCellValue("pass");
	        FileOutputStream fos= new FileOutputStream("./src/test/resources/commondata.xlsx");
	        wb.write(fos);
	        System.out.println("data updated succefully ");
	}
}

	

