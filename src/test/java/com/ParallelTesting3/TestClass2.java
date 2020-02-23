package com.ParallelTesting3;

import org.testng.annotations.Test;

public class TestClass2 extends BaseClass4 {

	@Test
	public void TC1() {
		System.out.println("Class 2 - TC1: "+tDriver.get().getTitle());
	}

	@Test
	public void TC2() {
		System.out.println("Class 2 - TC2: "+tDriver.get().getTitle());
	}
	
	@Test
	public void TC3() {
		System.out.println("Class 2 - TC3: "+tDriver.get().getTitle());
	}

	@Test
	public void TC4() {
		System.out.println("Class 2 - TC4: "+tDriver.get().getTitle());
	}
	
	
}
