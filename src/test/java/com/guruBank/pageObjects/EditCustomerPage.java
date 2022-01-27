/**
 * 
 */
package com.guruBank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author haris
 *
 */
public class EditCustomerPage {
	
	WebDriver driver;
	
	public EditCustomerPage(WebDriver rdriver) {
		this.driver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[3]/a")
	@CacheLookup
	WebElement clickEditCoustomer;
	
	@FindBy(how = How.NAME, using = "cusid")
	@CacheLookup
	WebElement customerId;
	
	@FindBy(how = How.NAME, using ="AccSubmit")
	@CacheLookup
	WebElement clickSubmitButton;
	
	
	public void clickEditCoustomer() {
		clickEditCoustomer.click();
	}
	public void customerId(String id) {	
		customerId.sendKeys(id);		
	}
	
	public void clickSubmitButton() {
		clickSubmitButton.click();
	}
	

}
