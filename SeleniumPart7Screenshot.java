package sukmawan;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SeleniumPart7Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// variable
		String text = "Sukmawan";
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.tokopedia.com/");
		chromedriver.manage().window().maximize();
		chromedriver.manage().deleteAllCookies();
		
		takeScreenShot(chromedriver);
		Thread.sleep(10000);
		chromedriver.quit();
	}
	
	public static void takeScreenShot(WebDriver chromedriver) throws Exception {
		File src = ((TakesScreenshot)chromedriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("Z:/Screenshot/Screenshot.png"));
		
		
	}
}
