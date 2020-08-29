package com.goavega.test.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getCellData(String excelPath, String sheet,int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		String excelVal=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return excelVal;
	}
	
	public int getRowCount(String excelPath, String sheet) throws Throwable
	{
		FileInputStream fis= new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		int rowNum=wb.getSheet(sheet).getLastRowNum();
		return rowNum;
	}

	public void setCellData(String excelPath,String sheet, int row, int cell, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fos= new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
	}
	
	public String getPropValue(String propPath, String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop= new Properties();
		prop.load(fis);
		String propValue=prop.getProperty(key,"Incorrect Key");
		return propValue;
	}
	

}
