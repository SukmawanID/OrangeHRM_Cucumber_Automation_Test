package Automation.Selenium.sukmawan;

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


public class SeleniumSeason1Part1Episode2DroppableFrame {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable

		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://jqueryui.com/droppable/");
		chromeDriver.manage().window().maximize();
		chromeDriver.switchTo().frame(chromeDriver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		chromeDriver.findElement(By.cssSelector("div[id='draggable']")).click();
		Actions drag = new Actions(chromeDriver);
		WebElement source = chromeDriver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target = chromeDriver.findElement(By.cssSelector("div[id='droppable']"));
		drag.dragAndDrop(source, target).build().perform();
		chromeDriver.switchTo().defaultContent();
		Thread.sleep(10000);
		chromeDriver.quit();
		secondWays();
		
	}
	
	public static void secondWays () throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.findElements(By.tagName("iframe")).size();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		Actions drag = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));
		drag.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.quit();
	}
}
