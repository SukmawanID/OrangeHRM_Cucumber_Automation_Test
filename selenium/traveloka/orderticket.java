package Automation.Selenium.traveloka;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.Arrays;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
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



public class orderticket {

	
	@Test
	public static void orderTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		// variable
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver(options);
		chromeDriver.get("https://www.traveloka.com/id-id");
		chromeDriver.manage().window().maximize();
		String fromDate = "25";
		String toDate = "14";
		String month = "Januari 2024";
		int totalMonth = 12;
		WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
		setCalender(chromeDriver, explicitWait, fromDate, toDate, month, totalMonth);
		Thread.sleep(10000);
		chromeDriver.quit();
		

	}
	
	public static void setCalender(WebDriver chromeDriver, WebDriverWait explicitWait, String fromDate ,String toDate,String month, int totalMonth) throws InterruptedException {
	
	chromeDriver.findElement(By.cssSelector("input[aria-labelledby='depatureDate']")).click();
	
	List<WebElement> currentMonths = chromeDriver.findElements(By.cssSelector("div[class='css-1dbjc4n r-18u37iz'] h3[class='css-4rbku5 css-901oao r-cwxd7f r-t1w4ow r-ubezar r-b88u0q r-rjixqe r-fdjqy7']"));
	int totalMonthInColumn = currentMonths.size();

			
	
	
		for (int i=0; i <= totalMonth; i++) {
			Thread.sleep(2000L);
			explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='css-1dbjc4n r-18u37iz'] h3[class='css-4rbku5 css-901oao r-cwxd7f r-t1w4ow r-ubezar r-b88u0q r-rjixqe r-fdjqy7']")));
			System.out.println(currentMonths.get(i).getText());
			String validateMonth = currentMonths.get(i).getText();
			if(month.equalsIgnoreCase(validateMonth)) {
				break;
			}
			else if(i == 2) {
			chromeDriver.findElement(By.cssSelector("svg[data-id='IcSystemChevronRight16']")).click();
				}
			else if(i==4) {
			chromeDriver.findElement(By.cssSelector("svg[data-id='IcSystemChevronRight16']")).click();	
			}
			else if(i==6) {
				chromeDriver.findElement(By.cssSelector("svg[data-id='IcSystemChevronRight16']")).click();	
				}
			else if(i==8) {
				chromeDriver.findElement(By.cssSelector("svg[data-id='IcSystemChevronRight16']")).click();	
				}
			else {
				chromeDriver.findElement(By.cssSelector("svg[data-id='IcSystemChevronRight16']")).click();	
				}
			
		}
	Thread.sleep(2000);
	explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='css-1dbjc4n r-18u37iz r-1472mwg r-13qz1uu'] div div")));
	List <WebElement> Dates = chromeDriver.findElements(By.cssSelector("div[class='css-1dbjc4n r-18u37iz r-1472mwg r-13qz1uu'] div div"));
	
		int countDates = Dates.size();
		for(int i=0; i<countDates; i++) {
			String findDates = Dates.get(i).getText();
				System.out.println(findDates);
					if(findDates.equalsIgnoreCase(fromDate)) {
						Dates.get(i).click();
						break;
					}
		}			
	}
}