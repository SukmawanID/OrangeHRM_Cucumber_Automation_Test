package sukmawan;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.Arrays;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SeleniumSeason1Part1Episode1WindowsHandles {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable

		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
//		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromeDriver.get("http://rahulshettyacademy.com/loginpagePractise/#");
		chromeDriver.manage().window().maximize();
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='blinkingText']")));
		chromeDriver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		// Move mouse //act.moveToElement(chromeDriver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		Set<String> windows = chromeDriver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
//		go to new tab		
		chromeDriver.switchTo().window(childId);
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class='im-para red']")));
		System.out.println(chromeDriver.findElement(By.cssSelector("p[class='im-para red']")).getText());
		String emailId = chromeDriver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailId);
//		comeback to first tab
		chromeDriver.switchTo().window(parentId);
		chromeDriver.findElement(By.id("username")).sendKeys(emailId);
		Thread.sleep(10000);
		chromeDriver.quit();
	}
}
