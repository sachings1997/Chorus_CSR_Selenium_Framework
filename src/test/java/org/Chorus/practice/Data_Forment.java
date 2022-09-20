package org.Chorus.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_Forment {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		try {
		DataFormatter fd= new DataFormatter();
		Sheet sheet = wb.getSheet("Sheet1");
		Cell cell = sheet.getRow(0).getCell(0);
		String data = fd.formatCellValue(cell);
		System.out.println(data);
		}
		finally {
			wb.close();
		}
		// TODO Auto-generated method stub

	}

}
