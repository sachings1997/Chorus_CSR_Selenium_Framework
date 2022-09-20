package org.Chorus.practice;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.main.generic.ExcelUtility;
import org.main.generic.IConstantPath;

public class FetechDataFromExceldataList {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelUtility excelUtility = new ExcelUtility();
		excelUtility.openExcel(IConstantPath.EXCEL_PATH);
		List<Map<String, String>> list =excelUtility.getdatafromexcelInlist("datatype");
		System.out.println(list.get(2).get("Email")+list.get(1).get("Last name"));
		
		// TODO Auto-generated method stub

	}

}
