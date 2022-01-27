/**
 * 
 */
package com.guruBank.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author haris
 *
 */
public class LoginPage {
	
	WebDriver loadDriver;
	
	public LoginPage(WebDriver rDriver){
		
		this.loadDriver= rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	By id = By.name("uid");
	By password = By.name("password");
	By loginButton = By.name("btnLogin");
	 
	
	
	public void setUserName(String userName) {
		loadDriver.findElement(id).sendKeys(userName);
	}
	
	public void setPassword(String pass) {
		loadDriver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginButton() {
		loadDriver.findElement(loginButton).click();;
	}
	
	

}
