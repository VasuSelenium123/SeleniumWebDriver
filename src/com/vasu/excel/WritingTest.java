package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTest
{
	public static void main(String[] args) throws Exception
	{
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		ws.getRow(0).createCell(2).setCellValue("Results");
		ws.getRow(1).createCell(2).setCellValue("Vasu");
		ws.getRow(2).createCell(2).setCellValue("Selenium");
		
		FileOutputStream fos=new FileOutputStream(srcFile);
		wb.write(fos);
		wb.close();

	}

}
