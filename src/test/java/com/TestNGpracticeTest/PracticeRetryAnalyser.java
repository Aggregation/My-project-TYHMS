package com.TestNGpracticeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeRetryAnalyser {
	
	@Test(retryAnalyzer = com.hms.hospice.GenericUtils.IRetryAnalyser.class)
	public void practiceRetry()
	{
		System.out.println("--Execute starts---");
		Assert.fail();
	}

}
