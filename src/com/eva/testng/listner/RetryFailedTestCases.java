package com.eva.testng.listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {
	private int count = 0;
	private static final int MAX_RETRY_COUNT = 1;

	@Override
	public boolean retry(ITestResult result) {
		if (count < MAX_RETRY_COUNT) {
			count++;
			return true; // Retry the test
		}
		return false; // Do not retry after max attempts
	}

}
