/**
 * 
 */
package com.guruBank.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guruBank.pageObjects.AddCustomerPage;
import com.guruBank.pageObjects.LoginPage;

/**
 * @author haris
 *
 */
public class TC_AddCustomer_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage  loginPage = new LoginPage(driver);
		loginPage.setUserName(userId);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();		
		System.out.println("Login Done :)");
		
		AddCustomerPage addCustomer = new AddCustomerPage(driver);		
		addCustomer.clickAddCustomerLink();
		
		closeAdvertisement();
		Thread.sleep(3000);
		
		System.out.println("Try add customer");
		addCustomer.customerName("Haric");			
		addCustomer.customerGender("f");
		addCustomer.customerDob("12", "24", "1994");
		addCustomer.customerAddress("Dhaka");	
		addCustomer.customerCity("Mirpur");
		
		addCustomer.customerState("Block H");
		addCustomer.customerPin("123456");
		addCustomer.customerMobile("01700000001");
		addCustomer.customerEmail(randomEmail());
		addCustomer.customerPassword("12345");	
		logger.info("Provide all data");
		addCustomer.clickSubmi();
		Thread.sleep(8000);
		
		String cid = driver.findElement(By.xpath("//tbody/tr[4]/td[2]")).getText();
		
		System.out.println("New Costomer Id is: "+ cid);
		
		
		System.out.println("All Data Added");

		
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
		
	}
	
	public String randomEmail() {
		String email = RandomStringUtils.randomAlphabetic(8)+"@gmail.com";
		System.out.println(email);
		return email;
	}
	
	

}
