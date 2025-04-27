package com.eva.read_data_excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_Excel {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("ExcelData\\Login.xlsx");
			Workbook wBook = new XSSFWorkbook(is);
			Sheet sheet = wBook.getSheet("Login");
			int countRow = sheet.getLastRowNum();
			for (int i = 0; i < countRow; i++) {
				Row row = sheet.getRow(i);
				int countCell = row.getLastCellNum();
				for (int j = 0; j < countCell; j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell.getStringCellValue());
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
