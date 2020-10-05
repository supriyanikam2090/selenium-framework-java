package com.dhaynyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dhaynyog.common.WebdriverFactory;

public class AddEmployeePage {

	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="middleName")
	WebElement middleName;
	
	@FindBy(id="lastName")
	WebElement lastElement;
	
	@FindBy(id ="employeeId")
	WebElement employeeId;
	
	@FindBy(id="chkLogin")
	WebElement checkCheckbox;
	
	@FindBy(id="user_name")
	WebElement empUserName;
	
	@FindBy(id="user_password")
	WebElement empPassword;
	
	@FindBy(id="re_password")
	WebElement empRePassword;
	
	@FindBy(id="status")
	WebElement empStatus;
	
	@FindBy(id="btnSave")
	WebElement buttonSave;
	
	public AddEmployeePage() {
		
		PageFactory.initElements(WebdriverFactory.getDriver(), this);
	}
	
	public void addEmployee(String strfirstName,String strMiddleName,String strLastName,
			String strUserName,String strPassword,String strConfirmPasswrd) {
		
		firstName.sendKeys(strfirstName);
		middleName.sendKeys(strMiddleName);
		lastElement.sendKeys(strLastName);
		checkCheckbox.click();
		empUserName.sendKeys(strUserName);
		empPassword.sendKeys(strPassword);
		empRePassword.sendKeys(strConfirmPasswrd);
		
		Select status = new Select(empStatus);
		status.selectByVisibleText("Enabled");
		
		buttonSave.click();	
	}
}
