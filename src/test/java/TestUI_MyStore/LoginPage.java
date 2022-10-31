package TestUI_MyStore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
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
		// Login
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("email")).sendKeys("randhirall20@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("passwd")).sendKeys("automation");
		driver.findElement(By.id("SubmitLogin")).click();
	}
}
