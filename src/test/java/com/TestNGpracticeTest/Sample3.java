package com.TestNGpracticeTest;

import org.testng.annotations.Test;

import com.hms.hospice.GenericUtils.BaseClass;

public class Sample3 extends BaseClass {

	@Test(groups = "regression")
	public void s3Test1()
	{
		System.out.println("--S3-T1--");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void s3Test2()
	{
		System.out.println("--S3-T2--");
	}
}
