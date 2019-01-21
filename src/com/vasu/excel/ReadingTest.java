package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest
{
	public static void main(String[] args) throws IOException 
	{
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(srcFile);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rcnt=ws.getLastRowNum();
		for (int i = 0; i <=rcnt; i++) 
		{
			String branchName=ws.getRow(i).getCell(0).getStringCellValue();
			String address1=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(branchName+"---"+address1);
		}
		
		
	}

}
