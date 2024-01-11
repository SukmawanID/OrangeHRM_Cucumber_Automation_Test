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


public class SeleniumSeason1Part1Episode2DroppableNestedFrame {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable

		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://the-internet.herokuapp.com/");
		chromeDriver.manage().window().maximize();
		chromeDriver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		chromeDriver.switchTo().frame(chromeDriver.findElement(By.cssSelector("frame[name='frame-top']")));
		chromeDriver.switchTo().frame(chromeDriver.findElement(By.cssSelector("frame[name='frame-middle']")));
		chromeDriver.findElement(By.cssSelector("div[id='content']")).getText();
		System.out.println(chromeDriver.findElement(By.cssSelector("div[id='content']")).getText());
		chromeDriver.switchTo().defaultContent();
		Thread.sleep(10000);
		chromeDriver.quit();

		
	}
}
