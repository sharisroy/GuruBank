/**
 *  DDT = Data Driven Test
 */
package com.guruBank.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.guruBank.pageObjects.LoginPage;
import com.guruBank.utilities.XlUtils;

/**
 * @author haris
 *
 */
public class TC_LoginTest_002_UsingExcel extends BaseClass{
	
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pass) throws InterruptedException, IOException {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(user);
		loginPage.setPassword(pass);
		logger.info("User name and password provided");
		loginPage.clickLoginButton();
		
		Thread.sleep(3000);
		
		if(isAlertPresnt()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
			System.out.println("Login Failed");
		}else {
			
			Assert.assertTrue(true);
			clickLogoutButton();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.info("logged in successfully");
			//System.out.println("Log out");			
			
		}
		
	}
	
	
	public void clickLogoutButton() {
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	}
	public boolean isAlertPresnt() throws IOException {
		try {
			driver.switchTo().alert();
			return true;
			
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	@DataProvider(name = "LoginData")
	String [][] getData() throws IOException{
		
		String path = System.getProperty("user.dir")+"/src/test/java/com/guruBank/testData/LoginData.xlsx";
		int rownum=XlUtils.getRowCount(path, "Sheet1");
		int colcount=XlUtils.getCellCount(path,"Sheet1",1);
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XlUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
		return logindata;
	}

}
