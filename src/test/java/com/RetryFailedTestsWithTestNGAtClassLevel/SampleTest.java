package com.RetryFailedTestsWithTestNGAtClassLevel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(retryAnalyzer = Retry.class)
	public void test1() {
		//Fail Scenario
		Assert.assertEquals(2+2,5,"Addition Problem! 2+2 must be 4!\n");
	}

	@Test(retryAnalyzer = Retry.class)
	public void test2() {
		//Pass Scenario
		Assert.assertEquals(2+2,4,"Addition Problem! 2+2 must be 4!\n");
	}


}
