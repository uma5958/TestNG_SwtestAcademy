package com.ParallelTesting3;

import org.testng.annotations.Test;

public class TestClass3 extends BaseClass {
	
	@Test
	public void TC1() {
		System.out.println("Class 3 - TC1: "+driver.getTitle());
	}

	@Test
	public void TC2() {
		System.out.println("Class 3 - TC2: "+driver.getTitle());
	}
	
	@Test
	public void TC3() {
		System.out.println("Class 3 - TC3: "+driver.getTitle());
	}

	@Test
	public void TC4() {
		System.out.println("Class 3 - TC4: "+driver.getTitle());
	}
	
}
