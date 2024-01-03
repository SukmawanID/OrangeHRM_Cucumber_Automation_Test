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


public class SeleniumSeason1Part1Episode1MoveMouse {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable

		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
//		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromeDriver.get("https://www.tokopedia.com/");
		chromeDriver.manage().window().maximize();
		Actions act = new Actions(chromeDriver);
		// Move mouse //act.moveToElement(chromeDriver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		WebElement moveMouse = chromeDriver.findElement(By.cssSelector("div[class='css-xml5xq']"));
		act.moveToElement(moveMouse).build().perform();
		act.moveToElement(chromeDriver.findElement(By.cssSelector("input[type='search']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// right clicj which has appear new tab menu
		act.moveToElement(moveMouse).contextClick().build().perform();
		Thread.sleep(10000);
		chromeDriver.quit();
	}
}
