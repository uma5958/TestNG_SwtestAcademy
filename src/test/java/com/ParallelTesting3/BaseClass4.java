package com.ParallelTesting3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass4 {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.out.println("Setup");
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("teardown");
		driver.quit();
	}

}
