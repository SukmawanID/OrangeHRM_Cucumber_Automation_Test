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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class homepage {	
	@Test
	public void footerHomePage() throws InterruptedException {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
	
	WebDriver chromeDriver = new ChromeDriver(options);
	chromeDriver.get("https://www.tokopedia.com/");
	chromeDriver.manage().window().maximize();
	JavascriptExecutor jsScroll = (JavascriptExecutor) chromeDriver;
	Thread.sleep(2000);
	long lastHeight;
    long currentHeight = (Long) jsScroll.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight);");
	
    do {
        lastHeight = currentHeight;
        jsScroll.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        try {
            Thread.sleep(1000); // Add a wait to allow content to load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        currentHeight = (Long) jsScroll.executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight);");
    } while (lastHeight < currentHeight);

    chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));	
	//WebElement footer = explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[role='contentinfo']")));
	explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[1]//ul[1]")));
	WebElement footer = chromeDriver.findElement(By.xpath("//nav[1]//ul[1]"));
	List<WebElement> linkFooter = footer.findElements(By.tagName("a"));
	
	int allLinkFooter = linkFooter.size();
	System.out.println(allLinkFooter);
	
	for(WebElement link : linkFooter) {
		String getLink = link.getText();
		System.out.println(getLink);
	}
	

	Thread.sleep(10000);
	chromeDriver.quit();
			
	}
}
