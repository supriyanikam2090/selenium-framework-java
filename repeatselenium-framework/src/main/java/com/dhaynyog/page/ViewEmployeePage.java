package com.dhaynyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dhaynyog.common.WebdriverFactory;

public class ViewEmployeePage {

	@FindBy(id ="btnAdd")
	WebElement addButton;
	
	public ViewEmployeePage() {
		
		PageFactory.initElements(WebdriverFactory.getDriver(), this);
	}
	
	public AddEmployeePage navigateToAddEmployeePage() {
		
		addButton.click();
	
		return new AddEmployeePage();
		
	}
}
