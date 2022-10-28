package TestUI_MyStore;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddtoCart {
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
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		// Entering Email & Password
		driver.findElement(By.id("email")).sendKeys("randhirall20@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("automation");
		Thread.sleep(1000);
		driver.findElement(By.id("SubmitLogin")).click();
		// Search Functionality
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/div/h5/a")).click();
		js.executeScript("window.scrollBy(0,300)");
		// Selecting Item
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
		driver.findElement(By.id("group_1")).click();
		driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		js.executeScript("window.scrollBy(0,300)");
	}

}

