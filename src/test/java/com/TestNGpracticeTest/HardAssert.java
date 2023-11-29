package com.TestNGpracticeTest;

import static org.testng.Assert.*;
import static org.testng.Assert.assertNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void asserEqual()
	{
		String exp="--5";
		System.out.println("--1");
		System.out.println("--2");
		System.out.println("--3");
		System.out.println("--4");
		assertEquals("--6", exp);
		System.out.println("--7");
	}
	
	@Test
	public void assertNotEqual()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain");
		String exp="TYSS RMG Applications";
		String title = driver.getTitle();
	//	System.out.println(title);
		assertEquals(title, exp);
		System.out.println(title);
		System.out.println("done");
		driver.quit();
		 
	}
	
	@Test
	public void nullAssert()
	{
		int j=10;
		System.out.println("--10");
		assertNull(j);
	}
	


}
