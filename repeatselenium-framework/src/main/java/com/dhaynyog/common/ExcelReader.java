package com.dhaynyog.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private static XSSFSheet ExcelWSheet; //Extended Spread Format sheet
	private static XSSFWorkbook ExcelWBook;
    //private static HSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;

	public static String[][] getExcelTableArray(String FilePath, String SheetName) throws Exception {
		String[][] tabArray = null;
		try {
			System.out.println("*************** getExcelTableArray - File path - " + FilePath);
			FileInputStream ExcelFile = new FileInputStream(FilePath);
			// Access the required test
            ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			int totalRows = ExcelWSheet.getLastRowNum()+1;
			int totalCols = ExcelWSheet.getRow(0).getLastCellNum();
			tabArray = new String[totalRows][totalCols];
			for (int intRowCounter = 0; intRowCounter < totalRows; intRowCounter++) {
				for (int intColCounter = 0; intColCounter < totalCols; intColCounter++) {
					tabArray[intRowCounter][intColCounter] = getCellData(intRowCounter, intColCounter);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(
					"!!!!!!!!!!!!!!! Excel File with class name not found, probably you have mentioned excel data provider to TestMethod but excel file not provided or incorrectly provided");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		return (tabArray);
	}

	public static String getCellData(int RowNum, int CellNum) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(CellNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			return " ";
		}
		
	}
}
