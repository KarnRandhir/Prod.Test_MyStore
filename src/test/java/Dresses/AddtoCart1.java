package Dresses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart1 {
	


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
					
		WebElement PwdBtn = driver.findElement(By.id("passwd"));
		PwdBtn.click();
		PwdBtn.sendKeys("automation");
		Thread.sleep(1000);
					
		WebElement SignBttn = driver.findElement(By.id("SubmitLogin"));
		SignBttn.click();
		Thread.sleep(1000);
		
		WebElement LdBtn = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
		LdBtn.click();
		Thread.sleep(2000);
		
		WebElement DrssBtn = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		DrssBtn.click();
		Thread.sleep(2000);
		
		WebElement CslDrss = driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[2]/h5/a"));
		CslDrss.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,700)");
		
		WebElement Review = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		Review.click();
		Thread.sleep(2000);
		
		
		WebElement Pink = driver.findElement(By.id("color_24"));
		Pink.click();
		Thread.sleep(2000);
		
		WebElement AdCrt = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		AdCrt.click();
		Thread.sleep(5000);
		
		
		
	}	
}
	
	
