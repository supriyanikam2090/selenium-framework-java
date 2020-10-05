package com.dhaynyog.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dhaynyog.common.WebdriverFactory;

public class LoginPage {

	@FindBy(id ="txtUsername")
	private WebElement userName;
	
	@FindBy(name ="txtPassword")
	private WebElement password;
	
	@FindBy(className = "button")
	private WebElement loginBtn;
	
	@FindBy(xpath =("//span[text()='( Username : Admin | Password : admin123 )']"))
	private WebElement loginsHint;
	
	@FindBy(tagName ="a")
	List<WebElement> links;
	
	public LoginPage() {
		
	   PageFactory.initElements(WebdriverFactory.getDriver(), this);
	}
	
	public HomePage login(String struserName, String strPassword) {
		 userName.sendKeys(struserName);
		 password.sendKeys(strPassword);
		 loginBtn.click();
		 return new HomePage();	
	}
	
      public LoginPage printFont() {
		
		System.out.println(loginsHint.getCssValue("color"));
		System.out.println(loginsHint.getCssValue("font-size"));
		System.out.println(loginsHint.getCssValue("font-family"));
		 return this;
	}
      
      public LoginPage printLinks() {
    	 // List<WebElement> links = WebdriverFactory.dr.findElements(By.tagName("a"));
    	  links.forEach(link->System.out.println(link.getAttribute("href")));
    	  
    	  return new LoginPage();
      }
}
