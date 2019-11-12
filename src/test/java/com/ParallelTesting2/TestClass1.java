package com.ParallelTesting2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeMethod
	public void setup() {
		System.out.println("Class 1 Launch Browser");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Class 1 close Browser");
	}

	@Test
	public void TC1() {
		System.out.println("Class 1 - TC1");
	}

	@Test
	public void TC2() {
		System.out.println("Class 1 - TC2");
	}
	
	@Test
	public void TC3() {
		System.out.println("Class 1 - TC3");
	}

	@Test
	public void TC4() {
		System.out.println("Class 1 - TC4");
	}
	
}
