package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;

public class testetst {

	public static void main(String[] args) throws ParseException, IOException {

		File src = new File("C:\\Users\\C.NAVAL\\Desktop\\Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		Row row = sheet1.getRow(8);
		Cell cell = row.createCell(1);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("Hiiii");
		// sheet1.getRow(1).createCell(2).setCellValue("Hellooooo");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
	}
	
	

}
