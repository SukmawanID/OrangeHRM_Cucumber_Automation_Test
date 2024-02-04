package Automation.Selenium.sukmawan;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SeleniumSeason2Part1Episode2TestNGFindFruit {
	@Test
	public void Sorted() {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
	
	WebDriver chromeDriver = new ChromeDriver();
	chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	String valuesFind = "Strawberry";
	
	WebElement searchButton = chromeDriver.findElement(By.cssSelector("input[id='search-field']"));
	searchButton.sendKeys(valuesFind);
	//choose element data table
	List<WebElement> allfruitNameTable = chromeDriver.findElements(By.xpath("//tr//td[1]"));
	
	List<WebElement> findFruitName = allfruitNameTable.stream()
			.filter(fruit->fruit.getText().contains("Strawberry"))
			.collect(Collectors.toList());
	
	System.out.println(findFruitName);
	
	Assert.assertEquals(findFruitName.size(), allfruitNameTable.size());
	chromeDriver.close();
	}
	
	@Test
	public void SortedFruit() {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
	
	WebDriver chromeDriver = new ChromeDriver();
	chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	String valuesFind = "Strawberry";
	
	WebElement searchButton = chromeDriver.findElement(By.cssSelector("input[id='search-field']"));
	searchButton.sendKeys(valuesFind);
	//choose element data table
	List<WebElement> allfruitNameTable = chromeDriver.findElements(By.xpath("//tr//td[1]"));
	
	List<WebElement> findFruitName = allfruitNameTable.stream()
			.filter(fruit->fruit.getText().contains("Strawberry"))
			.collect(Collectors.toList());
	
	List<String> nameFruits = findFruitName.stream()
			.map(fruitNames->fruitNames.getText())
			.collect(Collectors.toList());
		
	System.out.println(nameFruits);
	Assert.assertEquals(nameFruits, valuesFind);
	chromeDriver.close();
	}
}
