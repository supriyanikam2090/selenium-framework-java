package com.dhaynyog.test;

import org.testng.annotations.Test;

import com.dhaynyog.common.BaseSelenium;
import com.dhaynyog.page.LoginPage;

public class LoginTest extends BaseSelenium{

	@Test(dataProvider= "loginDataFromExcel")
	public void verifyLoginUserSucessfully(String struserName, String strPassword){
		
		LoginPage lp = new LoginPage();
		lp.printFont()
		   .printLinks()
		    .login(struserName,strPassword)
		     .varifyWelcomeText("Welcome Linda");
		   
	}
}
