package com.dhaynyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dhaynyog.common.WebdriverFactory;

public class AdminPage {

	@FindBy(id= "btnAdd")
	WebElement buttonAdd;
	
	public AdminPage() {
		
		PageFactory.initElements(WebdriverFactory.getDriver(), this);
	}
	
	public AddUserPage naviagtetoAddUserPage() {
		
		buttonAdd.click();
		 
		return new AddUserPage();
		
	}
}
