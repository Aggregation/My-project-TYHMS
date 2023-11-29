package com.TestNGpracticeTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidertest {
	

		
		@DataProvider
		public Object[][] data()
		{
			Object[][] obj=new Object[2][3];
			obj[0][0]="Banga";
			obj[0][1]="mysore";
			obj[0][2]=2000;
			
			obj[1][0]="Chennai";
			obj[1][1]="Madurai";
			obj[1][2]=500;
			
			return obj;
		}
		
	    @Test(dataProvider = "data")
		public void getdata(String org,String dest, int price)
		{
			System.out.println(org+"-->"+dest+"-->"+price);
			
		}
		
		

	}



