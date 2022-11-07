package com.mystore.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class MultiUserLoginTest extends BaseClass {
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;

	@BeforeMethod
	public void setup() {
		launchApp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(dataProvider = "create")
	public void MultipleLoginTest(String username, String password) throws Throwable {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnsignIn();
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();
	}
	@DataProvider(name = "create")
	public Object[][] dataSet1() {

		return new Object[][] {

				{ "randhirall20@gmail.com", "automation" },
				{ "randhirall21@gmail.com", "automation" },
				{ "randhirall22@gmail.com", "automation" },
				{ "randhirall23@gmail.com", "automation" },
				{ "randhirall24@gmail.com", "automation" },
				{ "randhirall25@gmail.com", "automation" },
				{ "admin@xyz.com", "admin@123" }};
	}
}
