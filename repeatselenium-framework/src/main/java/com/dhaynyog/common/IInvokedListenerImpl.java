package com.dhaynyog.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedListenerImpl implements IInvokedMethodListener{

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ssb/Documents/Chromed/chromedriver"); 
		WebDriver dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/");
		dr.manage().window().maximize();
		
		WebdriverFactory.setDriver(dr);
			
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
		WebdriverFactory.getDriver().quit();
		
	}

}
