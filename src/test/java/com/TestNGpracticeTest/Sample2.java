package com.TestNGpracticeTest;

import org.testng.annotations.Test;

import com.hms.hospice.GenericUtils.BaseClass;

public class Sample2 extends BaseClass {
	
	@Test(groups = "system")
	public void s2test1()
	{
		System.out.println("--S2-T1");
	}
	
	@Test(groups = "smoke")
	public void s2test2()
	{
		System.out.println("--S2-T2");
	}
	

}
