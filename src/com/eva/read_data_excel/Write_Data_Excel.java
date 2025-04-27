package com.eva.read_data_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_Excel {
	public static void main(String[] args) throws IOException {
		usingMap();
//		renameFile();
//		using2DArray();
//		updateExcel();
	}

	public static void usingMap() throws IOException {
//		File file=new File("Data");
//		if(!file.exists()) {
//			System.out.println(file.mkdir());
//		}
		Workbook wBook = new XSSFWorkbook();
		Sheet sheet = wBook.createSheet("A");
		Map<String, Object[]> map = new TreeMap();
		map.put("1", new Object[] { "ID", "Name", "Grade" });
		map.put("2", new Object[] { "1", "Shailesh", "A" });
		map.put("3", new Object[] { "2", "Ayush", "B" });
		map.put("4", new Object[] { "3", "Akash", "C" });
		map.put("5", new Object[] { "4", "Anil", "D" });

		Set<String> setKey = map.keySet();
		int rowNum = 0;
		for (String get : setKey) {
			Row row = sheet.createRow(rowNum++);
			Object[] objArr = map.get(get);
			int cellNum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellNum++);
				if (obj instanceof String) {
					cell.setCellValue((String) obj);
				} else if (obj instanceof Integer) {
					cell.setCellValue((Integer) obj);
				}
			}
		}

		try {
			FileOutputStream io = new FileOutputStream("Data\\Java.xlsx");
			wBook.write(io);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void renameFile() {
		Path yourFile = Paths.get("Java.xlsx");
		try {
			Files.move(yourFile, yourFile.resolveSibling("newname.xlsx"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void using2DArray() {
		File file = new File("Data");
		if (!file.exists()) {
			System.out.println(file.mkdir());
		}
		try (Workbook wBook = new XSSFWorkbook()) {
			Sheet sheet = wBook.createSheet("My Data");

			String[][] data = { { "SN", "Name", "JOb" }, { "01", "Shailesh", "Worker" },
					{ "02", "Akash Varun", "Engineer" }, { "03", "Devesh", "Engineer" } };

			for (int i = 0; i < data.length; i++) {
				Row r = sheet.createRow(i);

				for (int j = 0; j < data[i].length; j++) {
					Cell c = r.createCell(j);
					c.setCellValue(String.valueOf(data[i][j]));
				}
			}

			try {
				FileOutputStream io = new FileOutputStream(file + "\\Student.xlsx");
				wBook.write(io);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void updateExcel() {
		InputStream is = null;
		try {
			is = new FileInputStream("Data\\Java.xlsx");
			Workbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheet("A");
			int countRow = sheet.getLastRowNum();
			for (int i = 0; i < countRow; i++) {
				Row row = sheet.getRow(i);
				int countCell = row.getLastCellNum();
				for (int j = 0; j < countCell; j++) {
					Cell cell = row.getCell(j);
					if (cell.equals("Anil")) {
						System.out.println("Anil Found");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
