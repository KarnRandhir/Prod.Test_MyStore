package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import com.mystore.actiondriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected static ThreadLocal<ChromeDriver> driver1 = new ThreadLocal<>();
	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void launchApp() {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		Action.implicitWait(driver, 10);
		Action.pageLoadTimeOut(driver, 30);
		driver.get(prop.getProperty("url"));
	}
	
	public WebDriver getDriver() {
		return driver1.get();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	
}
