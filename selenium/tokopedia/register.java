package tokopedia;

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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class register {
	public WebDriver chromeDriver;
	public WebDriverWait explicitWait;
	
	@BeforeTest
	public void openHome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");

		chromeDriver = new ChromeDriver(options);
		explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
		chromeDriver.get("https://www.tokopedia.com/");
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}	
	
	@Test
	public void registerMenu() {
		String failedFormatNotif = "Format email salah";
		WebElement registerButton = chromeDriver.findElement(By.xpath("//div[@class='css-vlg5ix']//button[@data-testid='btnHeaderRegister']"));
		String nameRegister = registerButton.getText();
		System.out.println(nameRegister);
		registerButton.click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='regis-input']")));
		WebElement inputPhone = chromeDriver.findElement(By.cssSelector("input[id='regis-input']"));
		inputPhone.sendKeys("sukmawan");
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='css-t9c9fq erj7th78']")));
		WebElement notifFailed = chromeDriver.findElement(By.xpath("//p[@class='css-t9c9fq erj7th78']"));
		String notifFormat = notifFailed.getText();
		
		System.out.println("notification Failed Text : " + notifFormat);
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(notifFormat.contains(failedFormatNotif));
		softAssert.assertAll();
		
	}
	
	
	@AfterTest
	public void closeBrowser(){
		try {
	        Thread.sleep(4000);
	    } catch (InterruptedException e) {
	        e.printStackTrace(); // Or log the exception as needed
	    }
	    if (chromeDriver != null) {
	        chromeDriver.quit();
	    }
	
	
	}
}
