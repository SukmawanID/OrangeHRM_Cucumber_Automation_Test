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

		//Title
public class SeleniumPseudocode {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Declaration Variable
		int totalGrid = 50;
		// Description
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver(options);
		chromeDriver.get("https://zzzscore.com/1to50/en/");
		chromeDriver.manage().window().maximize();
		JavascriptExecutor jsScroll = (JavascriptExecutor) chromeDriver;
		jsScroll.executeScript("window.scrollBy(0,300)");
		WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
		
		for (int i = 1; i <= totalGrid; i++) {
			explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='" + i + "']")));
		    WebElement numberElement = chromeDriver.findElement(By.xpath("//div[text()='" + i + "']"));
		    numberElement.click();
		}
		
		Thread.sleep(10000);
		chromeDriver.quit();
	}
}
