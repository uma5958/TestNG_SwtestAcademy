package com.TestNGDependencies;

import org.testng.annotations.Test;

public class DependsOnGroups {
	//------------------------ Depends on Groups ------------------------
	
		@Test(groups = {"Smoke"})
		public void firstTest () {
			System.out.println("Smoke group Test");
		}

		@Test(groups = {"Regression"}, dependsOnGroups = {"Smoke"})
		public void secondTest () {
			System.out.println("Regressions group Test");
		}

		@Test(groups = {"Regression"}, dependsOnGroups = {"Smoke"})
		public void thirdTest () {
			System.out.println("Regressions group Test");
		}

		@Test(groups = {"Medium"}, dependsOnGroups = {"Smoke", "Regression"})
		public void fourthTest () {
			System.out.println("Medium group Test");
		}

		@Test(groups = {"Critical"}, dependsOnGroups= {"Medium"})
		public void fifthTest () {
			System.out.println("Critical group Test");
		}

		@Test(groups = {"Medium"}, dependsOnGroups= {"Smoke", "Regression"})
		public void sixthTest () {
			System.out.println("Medium group Test");
		}
		
		
		
		
}
