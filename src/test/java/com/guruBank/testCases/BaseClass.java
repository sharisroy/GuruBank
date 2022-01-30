/**
 * 
 */
package com.guruBank.testCases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.guruBank.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author haris
 *
 */
public class BaseClass {

	public static WebDriver driver;
	public static Logger logger;

	ReadConfig readConfig = new ReadConfig();

	public String baseUrl = readConfig.getApplicationUrl();
	public String pageTitle = readConfig.getPageTitle();
	public String userId = readConfig.getUserId();
	public String password = readConfig.getPassword();
	// public String browser = readConfig.getBrowserName();

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (br.equals("chrome")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(baseUrl);

		// Log4j ...................................................................

		logger = Logger.getLogger("BankinProject");
		PropertyConfigurator.configure("Log4j.properties");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(file, target);
		System.out.println("Screenshots Taken !");

	}

	public void closeAdvertisement() throws InterruptedException {

		try {
			driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
			driver.switchTo().frame("ad_iframe");
			driver.findElement(By.xpath("//span[contains(text(), 'Close')]")).click();
			logger.info("Advertisement Found");

		} catch (Exception e) {
			logger.info("Advertisement Not Found");
		}

	}

}
