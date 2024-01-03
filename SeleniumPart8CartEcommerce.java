package sukmawan;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SeleniumPart8CartEcommerce {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable
		String[] names = {"Cucumber","Brocolli","Beetroot"};
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
		addItemProducts(chromeDriver, names);
		chromeDriver.findElement(By.cssSelector("img[alt='Cart']")).click();
		chromeDriver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		chromeDriver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		chromeDriver.findElement(By.cssSelector(".promoBtn")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(chromeDriver.findElement(By.cssSelector(".promoInfo")).getText());
		
		//takeScreenShot(chromeDriver);
		Thread.sleep(20000);
		chromeDriver.quit();
	}
	
	public static void addItemProducts(WebDriver chromeDriver, String[] names) throws Exception {
		int j = 0;
		List<WebElement> totalProducts = chromeDriver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i < totalProducts.size(); i++) {
			String[] nameProduct = totalProducts.get(i).getText().split("-");
			String pureItemName = nameProduct[0].trim();
			List<String> nameProductsList = Arrays.asList(names);
			
			if (nameProductsList.contains(pureItemName)) {
				chromeDriver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				Thread.sleep(500);
				j++;
				if(j==names.length) {
					break;
				}
			}
			
		}
	}
	
	public static void takeScreenShot(WebDriver chromeDriver) throws Exception {
		File src = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("Z:/Screenshot/Screenshot.png"));
		
		
	}
	public static void takeScreenShotMultiple(WebDriver chromeDriver) throws Exception {
		
		Date datenow = new Date();
		System.out.println(datenow.toString());
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd HH-mm-ss");
		
		File src = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("Z:/Screenshot/Screenshot"+dateformat.format(datenow)+".png"));
		
		
	}
}
