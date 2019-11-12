package com.RunTestNGTestsInRandomOrder;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class TestOrderRandomizer implements IMethodInterceptor {

	@Override
	public List intercept(List methods, ITestContext context) {
		long seed = System.nanoTime();
		Collections.shuffle(methods, new Random(seed));
		return methods;
	}
	
	
}
