package com.TestNGpracticeTest;

import org.testng.annotations.Test;

public class PraticeTest {
	
	@Test()
	public void mreate()
	{
		System.out.println("********** Method is create");
	}
	
	@Test(dependsOnMethods = "delete" )
	public void edit()
	{
		System.out.println("**********Edit the method");
	}
	
	@Test( dependsOnMethods = "mreate")
	public void delete()
	{
		System.out.println("***********Delete the method");
	}
	
	@Test(dependsOnMethods = "edit")
	public void create()
	{
		System.out.println("====create====");
	}

}
