package com.ParallelTesting3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass4 {
WebDriver driver;
	ThreadLocal<WebDriver> tDriver = new ThreadLocal<>();
	@BeforeMethod
	public void setup() {
		System.out.println("Setup");
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        tDriver.set(driver);
        tDriver.get().manage().window().maximize();
        tDriver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        tDriver.get().get("https://www.google.com");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("teardown");
		tDriver.get().quit();
	}
}
