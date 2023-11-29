package PracticeDatabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbk=new XSSFWorkbook();
	    XSSFSheet sheetxssf=wbk.createSheet("sheet1");
	    XSSFRow rowxssf = sheetxssf.createRow(0);
	    XSSFCell cellxssf = rowxssf.createCell(0);
	   
		cellxssf.setCellValue("browser");
		
		File path=new File(".\\src\\test\\resources\\create.xlsx");
		
		//FileOutputStream fout=new FileOutputStream(path);
		//wbk.write(fout);
		//wbk.close();
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\create.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		sh.createRow(7).createCell(0).setCellValue("Hello");
	    sh.getRow(7).createCell(1).setCellValue("dummy");
	    
	    FileOutputStream fout=new FileOutputStream(path);
	    wb.write(fout);
	    wb.close();
	    
	   
	}

}
