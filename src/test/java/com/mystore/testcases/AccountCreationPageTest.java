package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccountCreationPageTest extends BaseClass {
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	AccountCreationPage accountcreationPage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyCreationAccountPageTest() throws Throwable {
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnsignIn();
		accountcreationPage = loginPage.createNewAccount("randhirall202@gmail.com");
		boolean result = accountcreationPage.validationAccountCreatePage();
		Assert.assertTrue(result);
	}
}
