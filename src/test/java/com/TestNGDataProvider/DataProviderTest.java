package com.TestNGDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider
	public Object[][] loginTestData() {
		return new Object[][] {{"user1", "pass1"}, {"user2", "pass2"}};
	}

	@Test(dataProvider = "loginTestData")
	public void dataProviderTest(String username, String password) {
		System.out.println("Test is started...");
		
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
	}


}
