package Dresses;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	
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
			
			
	}

}
