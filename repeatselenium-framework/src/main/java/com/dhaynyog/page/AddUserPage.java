package com.dhaynyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dhaynyog.common.WebdriverFactory;

public class AddUserPage {
	
	@FindBy(id="systemUser_userType")
	WebElement userRole;
	
	@FindBy(id ="systemUser_employeeName_empName")
	WebElement empName;
	
	@FindBy(id ="systemUser_userName")
	WebElement userName;
	
	@FindBy(id ="systemUser_status")
	WebElement userStatus;
	
	@FindBy(id="systemUser_password")
	WebElement userPassword;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id="btnSave")
	WebElement saveButton;
	
	public AddUserPage() {
		
		PageFactory.initElements(WebdriverFactory.getDriver(), this);
	}
	
	public AdminPage addUser(String strEmpName,String strUserName,String strPassword,String strConfrimPassword) {
		Select role = new Select(userRole);
		role.selectByVisibleText("ESS");
		
		empName.sendKeys(strEmpName);
		userName.sendKeys(strUserName);
		
		Select status = new Select(userStatus);
		status.selectByVisibleText("Enabled");
		
		userPassword.sendKeys(strPassword);
		confirmPassword.sendKeys(strConfrimPassword);
		
		saveButton.click();
		
	    return new AdminPage();
			
	
	}

}
