package com.ParallelTesting3;

import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {
	
	@Test
	public void TC1() {
		System.out.println("Class 1 - TC1: "+driver.getTitle());
	}

	@Test(dependsOnMethods="TC1")
	public void TC2() {
		System.out.println("Class 1 - TC2: "+driver.getTitle());
	}
	
	@Test
	public void TC3() {
		System.out.println("Class 1 - TC3: "+driver.getTitle());
	}

	@Test(dependsOnMethods="TC1")
	public void TC4() {
		System.out.println("Class 1 - TC4: "+driver.getTitle());
	}
	
}
