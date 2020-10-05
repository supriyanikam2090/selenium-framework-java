package com.dhaynyog.test;

import org.testng.annotations.Test;

import com.dhaynyog.common.BaseSelenium;
import com.dhaynyog.page.LoginPage;

public class AddUserTest extends BaseSelenium {
	
	@Test
	public void verifyAddUserAdminEnabled() {
		
		LoginPage lp = new LoginPage();
		lp.login("admin", "admin123")
		   .varifyWelcomeText("Welcome Linda")
		     .navigateToAdminPage()
		       .naviagtetoAddUserPage()
		         .addUser("Supriya", "Sup", "qwerty@12345678", "qwerty@12345678");
		       
		   
	
		
	}

}
