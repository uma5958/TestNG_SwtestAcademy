package com.ParallelTesting3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass3 {
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		System.out.println("Setup");
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("teardown");
		driver.quit();
	}

}
