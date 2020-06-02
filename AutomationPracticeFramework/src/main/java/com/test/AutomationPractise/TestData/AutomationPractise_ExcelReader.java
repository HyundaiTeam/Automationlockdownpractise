package com.test.AutomationPractise.TestData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AutomationPractise_ExcelReader {

	public static Object[][] exceldata(String fileName) throws IOException {

		// locate work book using the XSSworkbook class.It will contain all the methods
		// related to work book

		XSSFWorkbook wbook = new XSSFWorkbook("./data/" + fileName + ".xlsx");

		// from workbook we are moving to sheet
		XSSFSheet sheet = wbook.getSheetAt(0);

		// Getting the value of number of row
		int lastRowNum = sheet.getLastRowNum();

		// Getting the last cell number

		int lastCellNum = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[lastRowNum][lastCellNum];

		// Excel row will start from 1 because 0 is a header

		for (int i = 1; i <= lastRowNum; i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {
				// Getting the first cell details
				XSSFCell cell = row.getCell(j);
				// Getting the value form the excel
				String stringCellValue = cell.getStringCellValue();

				// Assigning the value for an array
				data[i - 1][j] = stringCellValue;
				// It will print the first row and first column details
				System.out.println(stringCellValue);

			}
			wbook.close();
		}
		return data;

	}

	/*
	 * public static void readExcelValue(String fileName) throws IOException {
	 * //fileinputstream //application real time
	 * 
	 * XSSFWorkbook wbook = new XSSFWorkbook("./data/"+ fileName +".xlsx");
	 * 
	 * //from workbook we are moving to sheet XSSFSheet sheet = wbook.getSheetAt(0);
	 * 
	 * 
	 * //Find number of rows in excel file
	 * 
	 * int rowCount = sheet.getLastRowNum();
	 * System.out.println("Rowcount"+rowCount); for (int i = 0; i <=rowCount; i++)
	 * {//0,1
	 * 
	 * XSSFRow row = sheet.getRow(i);
	 * 
	 * short lastCellNum = row.getLastCellNum();
	 * System.out.println("ccell value"+lastCellNum);
	 * 
	 * //Create a loop to print cell values in a row
	 * 
	 * for (int j = 0; j < row.getLastCellNum(); j++) {//1.0,1.1
	 * 
	 * 
	 * 
	 * //Print Excel data in console
	 * 
	 * System.out.print(row.getCell(j).getStringCellValue()+"|| ");//(0.0)(0.1)(1,0)
	 * (1,1)
	 * 
	 * String str1=row.getCell(j).getStringCellValue();
	 * 
	 * }
	 * 
	 * System.out.println(); }
	 * 
	 * }
	 */

}
