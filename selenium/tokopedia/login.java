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

public class login {
	public WebDriver chromeDriver;
	public WebDriverWait explicitWait;
	
	@BeforeTest
	public void openHome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");

		chromeDriver = new ChromeDriver(options);
		explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromeDriver.get("https://www.tokopedia.com/");
		chromeDriver.manage().window().maximize();
	}
	
	@Test
	public void loginMenu() throws InterruptedException {
		WebElement loginButton = chromeDriver.findElement(By.xpath("//div[@class='css-vlg5ix']//button[@data-testid='btnHeaderLogin']"));
		String nameLogin = loginButton.getText();
		System.out.println(nameLogin);
		loginButton.click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-testid='modal-close']")));
		WebElement exitButton = chromeDriver.findElement(By.cssSelector("button[data-testid='modal-close']"));
		exitButton.click();
		Thread.sleep(2000);
	}	
	
	@Test
	public void loginwithEmail() throws InterruptedException {
		WebElement loginButton = chromeDriver.findElement(By.xpath("//div[@class='css-vlg5ix']//button[@data-testid='btnHeaderLogin']"));
		String nameLogin = loginButton.getText();
		System.out.println(nameLogin);
		loginButton.click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='email-phone']")));
		WebElement email = chromeDriver.findElement(By.cssSelector("input[id='email-phone']"));
		email.sendKeys("test@gmail.com");
		
		
		WebElement selanjutnyaButton = chromeDriver.findElement(By.cssSelector("button[id='email-phone-submit']"));
		selanjutnyaButton.click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-x1sij0 erj7th77']")));
		WebElement failedNotif = chromeDriver.findElement(By.xpath("//div[@class='css-x1sij0 erj7th77']"));
		String failedNotification = failedNotif.getText();
		System.out.println(failedNotification);
		Thread.sleep(2000);
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-testid='modal-close']")));
		WebElement exitButton = chromeDriver.findElement(By.cssSelector("button[data-testid='modal-close']"));
		exitButton.click();
		Thread.sleep(2000);
	}
	
	@Test
	public void loginwithScan() throws InterruptedException {
		WebElement loginButton = chromeDriver.findElement(By.xpath("//div[@class='css-vlg5ix']//button[@data-testid='btnHeaderLogin']"));
		String nameLogin = loginButton.getText();
		System.out.println(nameLogin);
		loginButton.click();
		
		WebElement scanQRButton = chromeDriver.findElement(By.xpath("//button[@class='css-1qq6n7g-unf-btn eg8apji0']"));
		scanQRButton.click();
		Thread.sleep(2000);
		
		WebElement backButton = chromeDriver.findElement(By.xpath("//a[@aria-label='back']"));
		backButton.click();
		Thread.sleep(2000);

		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-testid='modal-close']")));
		WebElement exitButton = chromeDriver.findElement(By.cssSelector("button[data-testid='modal-close']"));
		exitButton.click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void loginwithMetodeLain() throws InterruptedException {
		WebElement loginButton = chromeDriver.findElement(By.xpath("//div[@class='css-vlg5ix']//button[@data-testid='btnHeaderLogin']"));
		String nameLogin = loginButton.getText();
		System.out.println(nameLogin);
		loginButton.click();
		
		
		WebElement metodeLainButton = chromeDriver.findElement(By.xpath("//button[@id='social-login']"));
		metodeLainButton.click();
		Thread.sleep(2000);
		
		WebElement backButton = chromeDriver.findElement(By.xpath("//a[@class='css-1j6vzxm-unf-link e1u528jj0']"));
		backButton.click();
		Thread.sleep(2000);
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-testid='modal-close']")));
		WebElement exitButton = chromeDriver.findElement(By.cssSelector("button[data-testid='modal-close']"));
		exitButton.click();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void closeBrowser() {
		 if (chromeDriver != null) {
	            chromeDriver.quit();
	        }
	}
	
	
	
	
}
