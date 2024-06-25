package com.marcoscheuerer.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public void readExcelFile() {
		String excelFolder = "/home/marco/";
		
		DataFormatter dataFormatter = new DataFormatter();
		
		try (InputStream inputStream = new FileInputStream(excelFolder + "example.xlsx")) {
		
			Workbook wb = WorkbookFactory.create(inputStream);
			
			for (Sheet sheet : wb) {
				System.out.println(sheet.getSheetName());
			}
			
			wb.close();
			inputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
