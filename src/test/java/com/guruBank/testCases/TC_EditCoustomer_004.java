/**
 * 
 */
package com.guruBank.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.guruBank.pageObjects.EditCustomerPage;
import com.guruBank.pageObjects.LoginPage;

/**
 * @author haris
 *
 */
public class TC_EditCoustomer_004 extends BaseClass{
	
	@Test
	public void editCoustomer() throws InterruptedException {
		LoginPage  loginPage = new LoginPage(driver);
		loginPage.setUserName(userId);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		logger.info("Login Done");
		
		EditCustomerPage editCostomer = new EditCustomerPage(driver);
		editCostomer.clickEditCoustomer();
		
		closeAdvertisement();
		Thread.sleep(3000);	
		editCostomer.customerId("29731");
		logger.info("Entered Customer Id");
		
		editCostomer.clickSubmitButton();
		logger.info("Click Submit Button");	
		Thread.sleep(3000);
		driver.findElement(By.name("addr")).clear();
		logger.info("Clear Address Field");
		Thread.sleep(3000);
		driver.findElement(By.name("addr")).sendKeys("Dhaka Bangladesh");
		logger.info("Enter New Address");

		driver.findElement(By.name("sub")).click();
		logger.info( "Customer Address have changed");
		
		
		
		
		
		
		
		
		
		
	}

}
