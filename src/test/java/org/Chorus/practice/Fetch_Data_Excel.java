package org.Chorus.practice;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step-1--> converted physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.xlsx");
		//step-2---> open the excel work book 
		Workbook wb = WorkbookFactory.create(fis);
		//step 3--->get the control sheet
		Sheet sheet = wb.getSheet("commondata");
		//step-4--->get the control row
		 Row row = sheet.getRow(1);
		//step-5--->get the cell
		Cell cell = row.getCell(1);
		// step-4--->fetch the data
		String data = cell.getStringCellValue();
		System.out.println(data);
		// step--5---> close the excel
		wb.close();


	}

}
