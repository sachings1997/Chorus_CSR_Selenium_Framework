package org.main.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * 
	 * @param excelpath
	 * @param sheetname
	 * @param rownumber
	 * @param cellnumber
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	FileInputStream fisexcel  = null;
	Workbook wb;
	String value;
	/**
	 * 
	 * @param Excelpath
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public void openExcel(String Excelpath) throws EncryptedDocumentException, IOException {
		fisexcel = new FileInputStream(Excelpath);
		wb=WorkbookFactory.create(fisexcel);
		
		
		
		}
	public String getdatafromExcel(String sheetname,int rowNumber, int cellNumber) {
		Sheet sheet = wb.getSheet(sheetname);
   
		String data = new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		return data ;
		
	}
	/**
	 * this method is used to fetch the data from the excel based on key  
	 * @param sheetname
	 * @param requriredkey
	 * @return
	 */
	public String getdatafromexcel(String sheetname , String requriredkey) {
		 Sheet sheet = wb.getSheet(sheetname);
		 String value=null;
		 for(int i=0;i<=sheet.getLastRowNum();i++) {
			String actualkey = sheet.getRow(i).getCell(0).getStringCellValue();
			if(actualkey.equalsIgnoreCase(requriredkey)) {
			value	= sheet.getRow(i).getCell(1).getStringCellValue();
				break;
			}
			 
		 }
		 
		return value ;
		
	}
	/**
	 * this method used to fetch data from excel and stored i map
	 * @param sheetname
	 * @return
	 */
	public Map<String, String> getDataFromExcelInMap(String sheetname){
		Sheet sheet = wb.getSheet(sheetname);
		Map<String, String> map= new HashMap<>();
		DataFormatter df= new DataFormatter();
		
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(0)),df.formatCellValue(sheet.getRow(i).getCell(1)));
			
		}
		
		
		return map;
		
	}
	/**
	 * this method used to fetch data from excel and also we can fetch data multiple time
	 * @param sheetname
	 * @return
	 */
	public List<Map<String,String>> getdatafromexcelInlist(String sheetname) {
		Sheet sheet = wb.getSheet("datatype");
		List<Map<String, String>> list = new ArrayList<>();
		DataFormatter df= new DataFormatter();
		for(int k=1;k<sheet.getRow(0).getLastCellNum();k++) {
			Map<String , String > map= new HashMap<>();
			for(int i=0; i<=sheet.getLastRowNum();i++) {
				map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(k)));
			}
			list.add(map);
		}
		return list;
	}
	public String getdatafromexcel(String sheetname,String requriedkey, String testcasename) {
		Sheet sheet = wb.getSheet(sheetname);
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			String actualtestcasename=sheet.getRow(i).getCell(0).getStringCellValue();
			if(actualtestcasename.equalsIgnoreCase(testcasename)) {
				for(int j=1;j<sheet.getRow(i).getLastCellNum();j++) {
					String actualkey = sheet.getRow(i).getCell(j).getStringCellValue();
					
				
					if(actualkey.equalsIgnoreCase(requriedkey))
				 value=	sheet.getRow(i+1).getCell(j).getStringCellValue();
					
		break;
			}
				break;
			
		}
		
	
		
		
	}
	
return value;
		// TODO Auto-generated method stub


	
		
	}
	public void closeingexcelutility() throws IOException {
		
		wb.close(); 
			
		}
	public void savedataintoexcel(String outputpath) throws FileNotFoundException, IOException {
		wb.write(new FileOutputStream(outputpath));
	}
	}



