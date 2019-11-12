package com.ParallelTesting;

import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void TC1() {
		// Printing class name and Id of the thread on using which test method got executed
		System.out.println("TC1 in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

	@Test
	public void TC2() {
		 //Printing class name and Id of the thread on using which test method got executed
		System.out.println("TC2 in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}
	
	@Test
	public void TC3() {
		// Printing class name and Id of the thread on using which test method got executed
		System.out.println("TC3 in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

	@Test
	public void TC4() {
		 //Printing class name and Id of the thread on using which test method got executed
		System.out.println("TC4 in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}
	
}
