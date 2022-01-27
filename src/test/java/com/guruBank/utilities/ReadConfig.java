/**
 * 
 */
package com.guruBank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author haris
 *
 */
public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		
		try {
			
			FileInputStream file = new FileInputStream(src);
			pro = new Properties();
			pro.load(file);
			
		} catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationUrl() {
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUserId() {
		String userId = pro.getProperty("userId");
		return userId;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getPageTitle() {
		String pageTitle = pro.getProperty("pageTitle");
		return pageTitle;
	}
	
//	public String getBrowserName() {
//		String browser = pro.getProperty("browser");
//		return browser;
//	}


}
