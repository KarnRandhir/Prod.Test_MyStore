package Dresses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
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

		// Search Functionality

		WebElement Scr = driver.findElement(By.id("search_query_top"));
		Scr.click();
		Scr.sendKeys("T-Shirts");
		Thread.sleep(1000);
		WebElement ScrBtn = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
		ScrBtn.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		WebElement Blouse = driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/div/h5/a"));
		Blouse.click();
		js.executeScript("window.scrollBy(0,300)");

		// Selecting Item
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Qty = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i"));
		Qty.click();
		Thread.sleep(1000);
		WebElement Sz = driver.findElement(By.id("group_1"));
		Sz.click();
		Thread.sleep(1000);
		WebElement SltSz = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[3]"));
		SltSz.click();
		Thread.sleep(1000);
		WebElement AddCt = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		AddCt.click();
		Thread.sleep(1000);
		WebElement ChkOut = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		ChkOut.click();
		Thread.sleep(1000);
		WebElement ChkOut1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		ChkOut1.click();
		Thread.sleep(1000);
		WebElement ChkOut2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
		ChkOut2.click();
		WebElement CkBox = driver.findElement(By.id("cgv"));
		CkBox.click();
		Thread.sleep(1000);
		WebElement ChkOut3 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
		ChkOut3.click();
		Thread.sleep(1000);
		WebElement Bnk = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		Bnk.click();
		Thread.sleep(1000);
		WebElement Cfm = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		Cfm.click();
		js.executeScript("window.scrollBy(0,300)");
	}

}
