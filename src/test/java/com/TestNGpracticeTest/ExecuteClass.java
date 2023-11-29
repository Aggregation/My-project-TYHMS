package com.TestNGpracticeTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hms.hospice.GenericUtils.ExcelUtils;

public class ExecuteClass {
	
	@Test(dataProvider = "getDatafromExcel")
	public void getData(String org, String loc)
	{
		
		System.out.println(org+"--->"+loc);
	}
	
	@DataProvider
	public Object[][] getDatafromExcel() throws Throwable
	{
		ExcelUtils eu=new ExcelUtils();
		Object[][] value=eu.readmultipleDatafromDataProvider("Sheet1");
		return value;
	}
//	@Test(dataProviderClass = "DataProvidertest.class" , dataProvider = "data")
//	public void exeOtherClass()
//	{
//		
//	}

}
