package com.TestNGpracticeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hms.hospice.GenericUtils.IpathConstants;

public class DataProviderExcelTest {
	
	@DataProvider
	public Object[][] data() throws Throwable
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestDataHospice.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		int cellcount=sh.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[rowcount][cellcount];
		

		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		
		}
		return obj;
	}
	
	@Test(dataProvider = "data")
	public void getData(String org, String loc)
	{
		System.out.println(org+"--->"+loc);
	}


}
