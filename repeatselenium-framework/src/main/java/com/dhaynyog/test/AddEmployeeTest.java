package com.dhaynyog.test;

import org.testng.annotations.Test;

import com.dhaynyog.common.BaseSelenium;
import com.dhaynyog.page.LoginPage;

public class AddEmployeeTest extends BaseSelenium {
	
	@Test
	public void verifyAddEmployee() {

      LoginPage lp = new LoginPage();
      lp.login("admin", "admin123")
         .varifyWelcomeText("Welcome Linda")
           .navigateToPIMModule()
              .navigateToAddEmployeePage()
                .addEmployee("Tejal", "Ramesh", "Nikam", "Tejal", "qwerty@1234567", "qwerty@1234567");
     
           
          
      
		
	}

}
