package com.BikeRentalManagement.genric.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getDataFromExcel(String sheetname, int rowNum, int colNum)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/TesScriptDat.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		wb.close();
		return data;
	}

	public int getRowCount(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/TesScriptDat.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int count = sheet.getLastRowNum();		
		wb.close();
		return count;
	}
	
	public void setDataIntoExcel(String sheetname, int rowNum, int colNum,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/TesScriptDat.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		sheet.getRow(rowNum).createCell(colNum);
		
		FileOutputStream fos = new FileOutputStream("./testData/TesScriptDat.xlsx");
		wb.write(fos);
		wb.close();
		
	}

}
