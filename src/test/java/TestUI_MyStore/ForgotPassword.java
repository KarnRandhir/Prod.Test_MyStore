package TestUI_MyStore;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Browserdriver\\chromedriver.exe");
		  
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		// Login
		
		WebElement SignBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		SignBtn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement EmlBtn = driver.findElement(By.id("email"));
		EmlBtn.click();
		Thread.sleep(1000);
		EmlBtn.sendKeys("randhirall20@gmail.com");
		Thread.sleep(1000);
	
		WebElement FgotBtn = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
		FgotBtn.click();
		Thread.sleep(1000);
		WebElement EmlBtn1 = driver.findElement(By.id("email"));
		EmlBtn1.click();
		Thread.sleep(1000);
		EmlBtn1.sendKeys("randhirall20@gmail.com");
		Thread.sleep(1000);
		WebElement RtvBtn = driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button"));
		RtvBtn.click();
		
	}	
}