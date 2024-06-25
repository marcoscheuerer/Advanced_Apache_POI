package com.marcoscheuerer.app;

import com.marcoscheuerer.read.ReadExcel;

public class App {

	public static void main(String[] args) {
		ReadExcel readExcel = new ReadExcel();
		
		readExcel.readExcelFile();
	}
	
}
