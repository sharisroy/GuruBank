/**
 * 
 */
package com.guruBank.testCases;

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
		System.out.println("\nLogin Done :)"); 
		
		EditCustomerPage editCostomer = new EditCustomerPage(driver);
		editCostomer.clickEditCoustomer();
		
		closeAdvertisement();
		Thread.sleep(3000);
		
		System.out.println("Try Edit customer");
		
		editCostomer.customerId("29731");
		logger.info("Entered Customer Id");
		
		editCostomer.clickSubmitButton();
		logger.info("Click Submit Button");
		System.out.println("Click Submit Button");		
		Thread.sleep(3000);
		
		
		
		
	}

}
