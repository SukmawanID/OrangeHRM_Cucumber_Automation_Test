package Automation.Selenium.sukmawan;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.Arrays;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SeleniumSeason1Part1Episode3Scrolling {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable
		ChromeOptions operation = new ChromeOptions();
		operation.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver(operation);
		chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		chromeDriver.manage().window().maximize();
		JavascriptExecutor jsScroll = (JavascriptExecutor) chromeDriver;
		jsScroll.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		jsScroll.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> values = chromeDriver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int totalValues = 0;
		for (int i=0;i<values.size();i++) {
			Integer.parseInt(values.get(i).getText());
			System.out.println(Integer.parseInt(values.get(i).getText()));
			totalValues = totalValues + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(totalValues);
		int currentValues = Integer.parseInt(chromeDriver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim());
		Assert.assertEquals(currentValues, totalValues);
		
		Thread.sleep(10000);
		chromeDriver.quit();
		

	}
}
