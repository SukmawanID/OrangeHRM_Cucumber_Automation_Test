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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SeleniumPart9Season1FluentWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable

		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
//		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromeDriver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		chromeDriver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		Wait<WebDriver> waitFluentWait = new FluentWait <WebDriver>(chromeDriver)
				.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		WebElement getData = waitFluentWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver chromeDriver) {
				if (chromeDriver.findElement(By.cssSelector("div[id=finish] h4")).isDisplayed()) {
					return chromeDriver.findElement(By.cssSelector("div[id=finish] h4"));
				}
				else {
				return null;
				}
			}
		}
				
				);
		System.out.println(chromeDriver.findElement(By.cssSelector("div[id=finish] h4")).getText());
		Thread.sleep(4000);
		chromeDriver.quit();
	}
}
