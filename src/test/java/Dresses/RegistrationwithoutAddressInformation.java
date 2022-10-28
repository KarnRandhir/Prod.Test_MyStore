package Dresses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationwithoutAddressInformation {


		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
				
				
				System.setProperty("webdriver.chrome.driver","C:\\Browserdriver\\chromedriver.exe");
				  
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://automationpractice.com/");
				driver.manage().window().maximize();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				Thread.sleep(2000);
				
				// Creating Account
				
				WebElement SignBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
				SignBtn.click();
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,300)");
				
				WebElement EmlBtn = driver.findElement(By.id("email_create"));
				EmlBtn.click();
				Thread.sleep(1000);
				EmlBtn.sendKeys("randhirall21@gmail.com");
				Thread.sleep(1000);
				
				WebElement SubBtn = driver.findElement(By.id("SubmitCreate"));
				SubBtn.click();
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				
				//Entering Personal Information
				
				
				WebElement TtlBtn = driver.findElement(By.id("id_gender1")); 
				TtlBtn.click();
				Thread.sleep(2000);
				 
				WebElement FnmBtn = driver.findElement(By.id("customer_firstname"));
				FnmBtn.click();
				FnmBtn.sendKeys("Randhir");
				Thread.sleep(1000);
				
				WebElement LnmBtn = driver.findElement(By.id("customer_lastname"));
				LnmBtn.click();
				LnmBtn.sendKeys("Karn");
				Thread.sleep(1000);
				
				WebElement PwdBtn = driver.findElement(By.id("passwd"));
				PwdBtn.click();
				PwdBtn.sendKeys("automation");
				Thread.sleep(1000);
				
				WebElement YrBtn = driver.findElement(By.id("years"));
				YrBtn.click();
				Thread.sleep(1000);
				
				WebElement SltYr = driver.findElement(By.xpath("//*[@id=\"years\"]/option[27]"));
				SltYr.click();
				YrBtn.click();
				Thread.sleep(1000);
				WebElement MntBtn = driver.findElement(By.id("months"));
				MntBtn.click();
				WebElement SltMnt = driver.findElement(By.xpath("//*[@id=\"months\"]/option[8]"));
				SltMnt.click();
				MntBtn.click();
				Thread.sleep(1000);
				
				WebElement DtBtn = driver.findElement(By.id("days"));
				DtBtn.click();
				WebElement SltDt = driver.findElement(By.xpath("//*[@id=\"days\"]/option[24]"));
				SltDt.click();
				DtBtn.click();
				Thread.sleep(1000);
			
				
				WebElement ChkBtn = driver.findElement(By.id("optin"));
				ChkBtn.click();
				
				

				WebElement AdInfo = driver.findElement(By.id("other"));
				AdInfo.click();
				AdInfo.sendKeys("Change World with Automation");
				Thread.sleep(1000);
				
				
				WebElement PhNm = driver.findElement(By.id("phone_mobile"));
				PhNm.click();
				PhNm.sendKeys("123456789");
				Thread.sleep(1000);
				

				WebElement RefInfo = driver.findElement(By.id("alias"));
				RefInfo.click();
				RefInfo.sendKeys(" is Nepal");
				Thread.sleep(1000);
				
				WebElement RegBtn = driver.findElement(By.id("submitAccount"));
				RegBtn.click();
				

	}

}
