package TestUI_MyStore;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationwithoutPersonalInfo{
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL = "http://automationpractice.com/index.php";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);	
		// Creating Account
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("email_create")).sendKeys("randhirall250@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		// Entering Address Information
		driver.findElement(By.id("company")).sendKeys("Seva Development");
		driver.findElement(By.id("address1")).sendKeys("Lalitpur - 1");
		driver.findElement(By.id("city")).sendKeys("Kathmandu");
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[4]\r\n")).click();
		driver.findElement(By.id("postcode")).sendKeys("44600");
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("id_country")).click();
		driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]")).click();
		driver.findElement(By.id("other")).sendKeys("Change World with Automation");
		driver.findElement(By.id("phone_mobile")).sendKeys("123456789");
		driver.findElement(By.id("alias")).sendKeys(" is Nepal");
		driver.findElement(By.id("submitAccount")).click();
	}
}

