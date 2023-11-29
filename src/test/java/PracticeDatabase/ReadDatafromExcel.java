package PracticeDatabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.mysql.cj.result.Row;

public class ReadDatafromExcel {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\TyHospice.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet1");
		org.apache.poi.ss.usermodel.Row row1 = sh.getRow(3);
		Cell cell1 = row1.getCell(1);
		String value = cell1.getStringCellValue();
		
		System.out.println(value);
		
	}

}
