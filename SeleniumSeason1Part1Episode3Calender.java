package sukmawan;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.Arrays;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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


public class SeleniumSeason1Part1Episode3Calender {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.tiket.com/");
//		chromeDriver.manage().window().maximize();
		JavascriptExecutor jsScroll = (JavascriptExecutor) chromeDriver;
//		jsScroll.executeScript("window.scrollBy(0,1000)");
//		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait explicitWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
//		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='form-field-travel_comp_date']")));
		String fromDates = "25";
		String month = "Mei 2024";
		int totalMonth = 12;
		chromeDriver.findElement(By.cssSelector("a[aria-label='Pesawat'] div[class='VerticalIcons_icon__M26iM']")).click();
		WebElement datesInput = chromeDriver.findElement(By.cssSelector("div[class='SearchForm_date_input__xPYSQ SearchForm_date_flex__yHqn9'] div span[class='Text_text__DSnue Text_variant_highEmphasis__ubq3k Text_size_b1__bsanT Text_weight_bold__m4BAY']"));
		datesInput.click();
		List<WebElement> currentMonths = chromeDriver.findElements(By.cssSelector("h2[class='Text_text__DSnue Text_variant_highEmphasis__ubq3k Text_size_b1__bsanT']"));
		int totalMonthInColumn = chromeDriver.findElements(By.cssSelector("h2[class='Text_text__DSnue Text_variant_highEmphasis__ubq3k Text_size_b1__bsanT']")).size();

				
		for (int i=0; i <= totalMonth; i++) {
			Thread.sleep(500);
			List<String> months = new ArrayList<String>();
			months.add(chromeDriver.findElements(By.cssSelector("h2[class='Text_text__DSnue Text_variant_highEmphasis__ubq3k Text_size_b1__bsanT']")).get(0).getText());
			months.add(chromeDriver.findElements(By.cssSelector("h2[class='Text_text__DSnue Text_variant_highEmphasis__ubq3k Text_size_b1__bsanT']")).get(1).getText());
			System.out.println(months.get(0));
			String validateMonth = months.get(1);
			chromeDriver.findElement(By.cssSelector("button[class='CalendarDesktop_next_button__T6rGr']")).click();
			if(month.equals(validateMonth)) {
				break;
			}
 		}
			
		Thread.sleep(5000);
		List<WebElement> dates = chromeDriver.findElements(By.cssSelector("button[class='Day_day__PNTH9']"));
		int countDates = chromeDriver.findElements(By.cssSelector("button[class='Day_day__PNTH9']")).size();
		for(int i=0; i<countDates; i++) {
			String findDates = chromeDriver.findElements(By.cssSelector("button[class='Day_day__PNTH9']")).get(i).getText();
			System.out.println(findDates);
			if(findDates.equalsIgnoreCase(fromDates)) {
				chromeDriver.findElements(By.cssSelector("button[class='Day_day__PNTH9']")).get(i).click();
				break;
			}
		}
		
		
		Thread.sleep(10000);
		chromeDriver.quit();
		

	}
}
