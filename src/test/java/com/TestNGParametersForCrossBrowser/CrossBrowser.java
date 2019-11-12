package com.TestNGParametersForCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void setupTest (String browser){
	    System.out.println("@BeforeMethod has started.");
	 
	    //Browser Selection based on browser parameter
	    if(browser.equals("chrome")){
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    } else if (browser.equals("firefox")) {
	    	WebDriverManager.firefoxdriver().setup();
	        driver = new FirefoxDriver();
	    } else {
	        System.out.println("You set a wrong browser parameter!");
	    }
	}
	
	
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
