package com.ParallelTesting2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeMethod
	public void setup() {
		System.out.println("Class 2 Launch Browser");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Class 2 close Browser");
	}

	@Test
	public void TC1() {
		System.out.println("Class 2 - TC1");
	}

	@Test
	public void TC2() {
		System.out.println("Class 2 - TC2");
	}
	
	@Test
	public void TC3() {
		System.out.println("Class 2 - TC3");
	}

	@Test
	public void TC4() {
		System.out.println("Class 2 - TC4");
	}
	
	
}
