package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\maven\\Excel\\Jave example.xlsx");
		FileInputStream st = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(st);
		Sheet s = w.getSheet("details");
		for (int i = 1; i <s.getPhysicalNumberOfRows(); i++) {
		Row row = s.getRow(i);
		for (int j=0;j<row.getPhysicalNumberOfCells();j++) {
		Cell cell = row.getCell(j);
		int type = cell.getCellType();
		System.out.println(type);
		if(type==1) {
		String c1 = cell.getStringCellValue();
		System.out.println(c1);
		}
		else if(type==0) {
		if(DateUtil.isCellDateFormatted(cell)) {
		Date dt = cell.getDateCellValue();
		SimpleDateFormat st1 = new SimpleDateFormat("DD-MMM-YYYY");
		String date = st1.format(dt);
		System.out.println(date);
		System.out.println();
		}
		else {
		double nm = cell.getNumericCellValue();
		long l = (long)nm;
		String d1 = String.valueOf(l);
		System.out.println(d1);
		}
		}

		}
		}
		}
		}



