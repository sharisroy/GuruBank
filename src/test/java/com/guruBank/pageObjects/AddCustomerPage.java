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
public class AddCustomerPage {
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver rdriver) {
		this.driver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//WebElement clickAddCustomerLink= driver.findElement(By.xpath("//a[contains(text(),'New Customer')]"));
	
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement clickAddCustomerLink;
	
	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement customerName;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement customerGender;

	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement customerDob;

	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement customerAddress;

	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement customerCity;

	@CacheLookup
	@FindBy(how = How.NAME, using = "state")
	WebElement customerState;

	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement customerPin;

	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement customerMobile;

	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement customerEmail;

	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement customerPassword;

	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement clickSubmi;
	

	
	public void clickAddCustomerLink() {
		clickAddCustomerLink.click();
	}
	public void customerName(String name) {	
		customerName.sendKeys(name);		
	}
	public void customerDob(String mm, String dd, String yy) {
		customerDob.sendKeys(mm);
		customerDob.sendKeys(dd);
		customerDob.sendKeys(yy);
	}
	public void customerGender(String name) { 
		customerGender.click();
	}
	public void customerAddress(String add) {
		customerAddress.sendKeys(add);
	}
	public void customerCity(String city) {
		customerCity.sendKeys(city);
	}
	public void customerState(String st) {
		((WebElement) customerState).sendKeys(st);
	}
	public void customerPin(String pin) {
		customerPin.sendKeys(String.valueOf(pin));
	}
	public void customerMobile(String mo) {
		customerMobile.sendKeys(mo);
	}
	public void customerEmail(String email) {
		customerEmail.sendKeys(email);
	}
	public void customerPassword(String pass) {
		customerPassword.sendKeys(pass);
	}
	public void clickSubmi() {
		clickSubmi.click();
	}
	
	

}
