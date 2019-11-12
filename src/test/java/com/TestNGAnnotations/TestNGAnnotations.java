package com.TestNGAnnotations;
/*
 * Author: @Uma maheswararao
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotations {
	//-----------------------------------Global Variables-----------------------------------
	public WebDriver driver;
	public String testURL = "http://www.swtestacademy.com/";

	//-----------------------------------Suite Suite-----------------------------------
	//You can set suite level setup such as test environment, Database connection string etc.
	@BeforeSuite
	public void setupSuit() {
		System.out.println("@BeforeSuite started.");
	}

	//-----------------------------------All Tests Setup-----------------------------------
	//All Tests setup
	@BeforeTest
	public void setupTests () {
		System.out.println("@BeforeTest started.");
	}

	//-----------------------------------Class Setup-----------------------------------
	//All Tests setup
	@BeforeClass
	public void setupClass () {
		System.out.println("@BeforeClass started.");
	}

	//-----------------------------------Test Setup-----------------------------------
	@BeforeMethod
	public void setupTest (){
		System.out.println("@BeforeMethod has started.");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	//-----------------------------------Tests-----------------------------------
	@Test
	public void firstTest () {
		System.out.println("First Test is Started.");

		driver.navigate().to(testURL);
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
	}

	@Test
	public void secondTest () {
		System.out.println("Second Test is Started.");
		
		driver.navigate().to("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
	}

	//-----------------------------------Test TearDown-----------------------------------
	@AfterMethod
	public void teardownTest (){
		System.out.println("@AfterMethod has started.");
		
		driver.quit();
	}

	//-----------------------------------Class TearDown-----------------------------------
	@AfterClass
	public void teardownClass (){
		System.out.println("@AfterClass has started.");
	}

	//-----------------------------------All Tests TearDown-----------------------------------
	@AfterTest
	public void teardownTests (){
		System.out.println("@AfterTest has started.");
	}

	//-----------------------------------Suite TearDown-----------------------------------
	@AfterSuite
	public void teardownSuite (){
		System.out.println("@AfterSuite has started.");
	}
	
	
	
}
