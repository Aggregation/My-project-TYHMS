package com.TestNGpracticeTest;

import org.testng.annotations.Test;

import com.hms.hospice.GenericUtils.BaseClass;

public class Sample1 extends BaseClass {
	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("-S1-T1--");
	}
	
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("-S1-T2");
	}
	@Test
	public void t3()
	{
		System.out.println("t3");
	}
	@Test
	public void t4()
	{
		System.out.println("t4");
	}
	
	

}
