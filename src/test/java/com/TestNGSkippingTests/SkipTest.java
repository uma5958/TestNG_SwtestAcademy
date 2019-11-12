package com.TestNGSkippingTests;

import org.testng.annotations.Test;

public class SkipTest {

	@Test(priority = 0)
	public void firstTest () {
		System.out.println("1st Test is Started.");
	}

	@Test (priority = 1, enabled = false) // enabled = true => will executed
	public void secondTest () {
		System.out.println("2nd Test is Started.");
	}

	@Test (priority = 2)
	public void thirdTest () {
		System.out.println("3rd Test is Started.");
	}

}
