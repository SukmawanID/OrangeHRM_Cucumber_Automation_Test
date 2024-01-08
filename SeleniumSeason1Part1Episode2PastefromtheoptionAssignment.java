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


public class SeleniumSeason1Part1Episode2PastefromtheoptionAssignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable

		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		chromeDriver.manage().window().maximize();
		//step 1
		WebElement optionBox = chromeDriver.findElement(By.cssSelector("input[id='checkBoxOption2']"));
		optionBox.click();
		//step 2
		String outputOption = chromeDriver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(outputOption);
		//step 3
		WebElement dropdownStatic = chromeDriver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
		Select dropdown = new Select(dropdownStatic);
		dropdown.selectByVisibleText(outputOption);
		chromeDriver.findElement(By.cssSelector("input[id='name']")).sendKeys(outputOption);
		//step 4
		chromeDriver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		chromeDriver.switchTo().alert().getText();
		System.out.println(chromeDriver.switchTo().alert().getText());
		String alertInformation = chromeDriver.switchTo().alert().getText().split("Hello")[1].trim().split(",")[0];
		System.out.println(alertInformation);
			if(alertInformation.contains(outputOption)) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Not Passed");
			}
		//step 5
		chromeDriver.switchTo().alert().accept();
		
		Thread.sleep(10000);
		chromeDriver.quit();
	}
	
	public static void secondWays() {
		WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
        Select s=new Select(dropdown);
        s.selectByVisibleText(opt);
        driver.findElement(By.name("enter-name")).sendKeys(opt);
        driver.findElement(By.id("alertbtn")).click();
		String text=  driver.switchTo().alert().getText();
		     if(text.contains(opt))
		     {
		    System.out.println("Alert message success");
		     }
		     else
		    System.out.println("Something wrong with execution");

	}
}
