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


public class SeleniumSeason1Part1Episode2LimitSizeAndOpenLinkTab {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable

		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		chromeDriver.manage().window().maximize();
		// Entire Website
		chromeDriver.findElements(By.tagName("a")).size();
		System.out.println(chromeDriver.findElements(By.tagName("a")).size());
		// Child Website (Footer)
		WebElement footerDriver = chromeDriver.findElement(By.id("gf-BIG"));
		footerDriver.findElements(By.tagName("a")).size();
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		// Column in Footer
		WebElement columnFooterDriver = chromeDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		columnFooterDriver.findElements(By.tagName("a")).size();
		System.out.println(columnFooterDriver.findElements(By.tagName("a")).size());
		// Click link in first column on footer
		for (int i=1;i<columnFooterDriver.findElements(By.tagName("a")).size();i++) {
			String openLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnFooterDriver.findElements(By.tagName("a")).get(i).sendKeys(openLinkTab);
			Thread.sleep(5000L);
		}
		
		Set<String> windows = chromeDriver.getWindowHandles();
		Iterator<String> iterations = windows.iterator();
		
		while(iterations.hasNext()) {
			chromeDriver.switchTo().window(iterations.next());
			System.out.println(chromeDriver.getTitle());
		}
		
		
		Thread.sleep(10000);
		chromeDriver.quit();

		
		
	}
}
