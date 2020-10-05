package com.dhaynyog.common;

import org.openqa.selenium.WebDriver;

public class WebdriverFactory {
	
	public static ThreadLocal <WebDriver> tl = new ThreadLocal<>();
	
	public static WebDriver getDriver() 
	
	{
		return tl.get();
	}
     
	public static void setDriver(WebDriver dr)
	
	{
		tl.set(dr);
	}
}
