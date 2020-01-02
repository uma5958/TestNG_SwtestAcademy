package com.TestNGGrouping;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGroupingAndDependenciesMix {
	//-----------------------------------Test Setup-----------------------------------
	@BeforeMethod(groups = {"Regression"})
	public void setupTest (){
		//Print console that code is in @BeforeMethod!
		System.out.println("@BeforeMethod has started.");
	}

	//-----------------------------------Tests-----------------------------------
	@Test(groups = {"Regression"})
	public void firstTest () {
		System.out.println("1st Test is Started.");
	}

	@Test(groups = {"Regression"}, dependsOnMethods="firstTest")
	public void secondTest () {
		System.out.println("2nd Test is Started.");
	}

	@Test(groups = {"Regression"}, dependsOnMethods="firstTest")
	public void thirdTest () {
		System.out.println("3rd Test is Started.");
	}

	@Test(groups = {"Regression"}, dependsOnMethods="firstTest")
	public void fourthTest () {
		System.out.println("4th Test is Started.");
	}

	@Test(groups = {"Regression"}, dependsOnMethods="firstTest")
	public void fifthTest () {
		System.out.println("5th Test is Started.");
	}

	@Test(groups = {"Regression"}, dependsOnMethods="firstTest")
	public void sixthTest () {
		System.out.println("6th Test is Started.");
	}

	//-----------------------------------Test TearDown-----------------------------------
	@AfterMethod(groups = {"Regression"})
	public void teardownTest (){
		System.out.println("@AfterMethod has started.");
	}
}
