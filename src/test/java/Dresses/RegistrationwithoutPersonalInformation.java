package Dresses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationwithoutPersonalInformation {

	
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
		
		
		// Entering Address Information
		
		WebElement CmpNm = driver.findElement(By.id("company"));
		CmpNm.click();
		CmpNm.sendKeys("Seva Development");
		Thread.sleep(1000);
		
		WebElement Adres = driver.findElement(By.id("address1"));
		Adres.click();
		Adres.sendKeys("Lalitpur - 1");
		Thread.sleep(1000);
		
		
		WebElement CtNm = driver.findElement(By.id("city"));
		CtNm.click();
		CtNm.sendKeys("Kathmandu");
		Thread.sleep(1000);
		
		
		WebElement StNm = driver.findElement(By.id("id_state"));
		StNm.click();
		WebElement SltSt = driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[4]\r\n"));
		SltSt.click();
		Thread.sleep(1000);
		
		WebElement ZpCd = driver.findElement(By.id("postcode"));
		ZpCd.click();
		ZpCd.sendKeys("44600");
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement CntNm = driver.findElement(By.id("id_country"));
		CntNm.click();
		WebElement SltCnt = driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
		SltCnt.click();
		Thread.sleep(1000);
		
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
