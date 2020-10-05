package com.dhaynyog.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dhaynyog.common.WebdriverFactory;

public class HomePage {

	@FindBy(id="welcome")
	WebElement welcomeText;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminTab;
	
	@FindBy(id= "menu_pim_viewPimModule")
	WebElement navigtetoPIM;
	
	
	public HomePage() {
		
		PageFactory.initElements(WebdriverFactory.getDriver(), this);
	}
	
	public HomePage varifyWelcomeText(String strExpectedWelcomeText) {
		
		Assert.assertEquals(welcomeText.getText(), strExpectedWelcomeText);
		return this;
	}
	
	public AdminPage navigateToAdminPage()
	{
		adminTab.click();
		return new AdminPage();
	}
    
	public ViewEmployeePage navigateToPIMModule() {
		
		navigtetoPIM.click();
		return new ViewEmployeePage();
		
	}
	
}
