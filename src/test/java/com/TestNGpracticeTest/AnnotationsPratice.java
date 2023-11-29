package com.TestNGpracticeTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class AnnotationsPratice {
	
	@BeforeSuite
	public void bs()
	{
		 System.out.println("--before suite--");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("--before class");
	}
	
	@BeforeMethod
	public void bm2()
	{
		System.out.println("--before method 2--");
	}
	@Test
	public void test()
	{
		System.out.println("---execute");
	}
	@AfterMethod
	public void afm()
	{
		System.out.println("----Done method");
	}
	@AfterClass
	public void afc()
	{
		System.out.println("---after class");
	}
	
	
	@AfterSuite
	public void as()
	{
		System.out.println("--after suite--");
	}
	
	
	
	

}
