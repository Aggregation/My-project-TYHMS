package com.TestNGpracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void equalAssert()
	{
		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		String expe="Hospital Management System";
		String title = driver.getTitle();
		
		sa.assertEquals(title, expe);
		System.out.println(title);
		System.out.println("Done");
		driver.quit();
		sa.assertAll();
	}

}
