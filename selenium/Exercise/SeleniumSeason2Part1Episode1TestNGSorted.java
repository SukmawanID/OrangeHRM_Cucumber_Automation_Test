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


public class SeleniumSeason2Part1Episode1TestNGSorted {
	@Test
	public void Sorted() {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
	
	WebDriver chromeDriver = new ChromeDriver();
	chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	//click to sorted
	WebElement fruitNameTable = chromeDriver.findElement(By.xpath("//tr//th[1]"));
	fruitNameTable.click();
	//choose element data table
	List<WebElement> allfruitNameTable = chromeDriver.findElements(By.xpath("//tr//td[1]"));
	// get data table
	List<String> getListAllFruitNameTable = allfruitNameTable.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(getListAllFruitNameTable);
	// sorted data table
	List<String> shortListAllFruitNameTable = getListAllFruitNameTable.stream().sorted().collect(Collectors.toList());
	System.out.println(shortListAllFruitNameTable);
	// compare data
	Assert.assertTrue(getListAllFruitNameTable.equals(shortListAllFruitNameTable));
	
	
	List<String> fruitPrice;
	do {
		List<WebElement> nextRowsFruit = chromeDriver.findElements(By.xpath("//tr//td[1]"));
		fruitPrice = nextRowsFruit.stream().filter(s->s.getText().contains("Rice")).
		map(s->getfruitPrice(s)).collect(Collectors.toList());
		fruitPrice.forEach(a->System.out.println(a));
		if(fruitPrice.size()<1) {
			chromeDriver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
	}
		
	while(fruitPrice.size()<1);
	}

	private static String getfruitPrice(WebElement s) {
		// TODO Auto-generated method stub
		String getfruitPrice= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return getfruitPrice;
	}
}
