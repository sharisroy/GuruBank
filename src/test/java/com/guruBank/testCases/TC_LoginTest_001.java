package com.guruBank.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.guruBank.pageObjects.LoginPage;

/**
 * @author haris
 *
 */
public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		
		//driver.get(baseUrl);		
		logger.info("Url is Open");
		
		LoginPage loginPage = new LoginPage(driver);		
		loginPage.setUserName(userId);
		logger.info("Enter User Id");
		
		loginPage.setPassword(password);
		logger.info("Enter Password");		
	
		loginPage.clickLoginButton();
		logger.info("Click Login Button");
		captureScreen( driver, "loginPage");
		
		if(driver.getTitle().equals(pageTitle)) {
			Assert.assertTrue(true);
			logger.info("logged in successfully");
		}else {
			
			Assert.assertFalse(false);
			logger.info("Failed to Login");
		}
		
		
	}

}
