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


public class SeleniumPart9LoginAndOrderFromEcommerce {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable

		String[] allProducts = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
//		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
		//Get URL
		chromeDriver.get("http://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		login(chromeDriver, explicitWait);
		getAllData(chromeDriver, explicitWait, allProducts);
		
		
		Thread.sleep(20000);
		chromeDriver.quit();
	}
	
	public static void login(WebDriver chromeDriver, WebDriverWait explicitWait) {
		
//		System.out.println(chromeDriver.findElement(By.cssSelector(".text-center.text-white")).getText());
		String getDataUserName = chromeDriver.findElement(By.xpath("//i[text()='rahulshettyacademy']")).getText();
//      or String getDataUserName = chromeDriver.findElement(By.xpath("//i[contains(text(),'rahulshettyacademy')]")).getText();
		String getDataPassWord = chromeDriver.findElement(By.xpath("//i[text()='learning']")).getText();
		
		chromeDriver.findElement(By.name("username")).sendKeys(getDataUserName);
		chromeDriver.findElement(By.id("password")).sendKeys(getDataPassWord);
		
		
		chromeDriver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
//		or driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		//chromeDriver.switchTo().alert().accept();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
		chromeDriver.findElement(By.cssSelector("#okayBtn")).click();
		WebElement options = chromeDriver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("consult");	
//		or chromeDriver.findElement((By.cssSelector("select[class='form-control'] option[value='consult']"))).click();
		chromeDriver.findElement(By.cssSelector("#terms")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signInBtn']")));
		chromeDriver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		
		
		
	}
	
	public static void getAllData (WebDriver chromeDriver, WebDriverWait explicitWait, String[] allProducts) {
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4[class='card-title']")));
		List<WebElement> totalProducts = chromeDriver.findElements(By.cssSelector("h4[class='card-title']"));		
		int j = 0;
		for (int i=0; i<totalProducts.size();i++) {
			String nameProducts = totalProducts.get(i).getText();
			System.out.println(nameProducts);
			List <String> allProductNames = Arrays.asList(allProducts);
			if(allProductNames.contains(nameProducts)) {
				explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-info']")));
				chromeDriver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
				j++;
				if(j==nameProducts.length()) {
					break;
				}
			}
		}
	}
}
