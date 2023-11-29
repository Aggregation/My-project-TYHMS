package com.TestNGpracticeTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Practice2TestNg {
	
	@BeforeSuite
	public void bs()
	{
	 	System.out.println("Befoew suire");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");
	}
	@Test
	public void test()
	{
		System.out.println("Test");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("Aftermethod");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class");
	}
	
	@AfterClass
	public void as()
	{
		System.out.println("after suite");
	}

}
