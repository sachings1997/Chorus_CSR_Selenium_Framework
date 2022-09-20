package org.Chorus.practice;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.main.generic.ExcelUtility;
import org.main.generic.IConstantPath;

public class FetchDataFromExcelThroughmap {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelUtility excelUtility = new ExcelUtility();
		excelUtility.openExcel(IConstantPath.EXCEL_PATH);
		Map<String, String> map= excelUtility.getDataFromExcelInMap("datatype");
		System.out.println(map.get("pincode "));
		// TODO Auto-generated method stub

	}

}
