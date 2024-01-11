package Automation.Selenium.sukmawan;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
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
import org.testng.asserts.SoftAssert;


public class SeleniumSeason1Part1Episode4OpenConnection {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		//proxy
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		options.addArguments("--disable-notifications");
		options.setAcceptInsecureCerts(true);
		//download
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver(options);
		chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice//");
		chromeDriver.manage().window().maximize();
		System.out.println(chromeDriver.getTitle());

		String url = chromeDriver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int getResponseCode = connection.getResponseCode();
		System.out.println(getResponseCode);
		getAllLink(chromeDriver);
		Thread.sleep(10000);
		chromeDriver.quit();
	}
	
	public static void getAllLink(WebDriver chromeDriver) throws IOException {
	
	List<WebElement> links = chromeDriver.findElements(By.cssSelector("li[class='gf-li'] a"));
	SoftAssert softAssert = new SoftAssert();
	for (WebElement link : links) {
		String url = link.getAttribute("href");
		HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int getResponseCode = connection.getResponseCode();
		System.out.println(getResponseCode);
		softAssert.assertTrue(getResponseCode<400, "The link from "+link.getText()+" is broken and Response Code is "+getResponseCode);
//		if(getResponseCode>400) {
//			System.out.println("The link from "+link.getText()+" is broken and Response Code is "+getResponseCode);
//			Assert.assertTrue(false);
//		}
	}
	softAssert.assertAll();
	
	
	
	
	
	}
}
