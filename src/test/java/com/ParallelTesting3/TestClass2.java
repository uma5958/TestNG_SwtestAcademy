package com.ParallelTesting3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass2 {
	WebDriver driver=null; 
	
	@BeforeMethod
	public void setup() {
		System.out.println("Class 2 setup");
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Class 2 teardown");
		driver.quit();
	}

	@Test
	public void TC1() {
		System.out.println("Class 2 - TC1: "+driver.getTitle());
	}

	@Test
	public void TC2() {
		System.out.println("Class 2 - TC2: "+driver.getTitle());
	}
	
	@Test
	public void TC3() {
		System.out.println("Class 2 - TC3: "+driver.getTitle());
	}

	@Test
	public void TC4() {
		System.out.println("Class 2 - TC4: "+driver.getTitle());
	}
	
	
}
