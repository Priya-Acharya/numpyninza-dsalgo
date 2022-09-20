package com.DSAlgo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtility {
	
	
	   public FileInputStream fis = null;
	   public XSSFWorkbook workbook = null;
	   public XSSFSheet sheet = null;
	   public XSSFRow row = null;
	   public XSSFCell cell = null;
	   String xlFilePath;
	 
	   public ExcelReadUtility(String xlFilePath) throws Exception
	   {
	       this.xlFilePath = xlFilePath;
	       
	    
	   }
	 
	   public int getRowCount(String sheetName) throws IOException
	   {
			fis = new FileInputStream(xlFilePath);
	       workbook = new XSSFWorkbook(fis);
	       sheet = workbook.getSheet(sheetName);
	       int rowCount = sheet.getLastRowNum();
		   workbook.close();
		    fis.close();
	       return rowCount;
	   }
	 
	   public int getColumnCount(String sheetName,int rownum)throws IOException
	   {
			fis = new FileInputStream(xlFilePath);
	       workbook = new XSSFWorkbook(fis);
	       sheet = workbook.getSheet(sheetName);
	       row = sheet.getRow(rownum);
	       int colCount = row.getLastCellNum();
		   workbook.close();
		    fis.close();
	       return colCount;
	   }
	   
		public String getCellData(String sheetName, int rownum, int colnum) throws IOException {
			fis = new FileInputStream(xlFilePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(rownum);
			cell = row.getCell(colnum);
			String data = (cell == null || cell.getStringCellValue().length() == 0) ? 
					null : cell.getStringCellValue();
			workbook.close();
			fis.close();
			return data;
		}

}
