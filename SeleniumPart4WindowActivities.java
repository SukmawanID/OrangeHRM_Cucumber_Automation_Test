package sukmawan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SeleniumPart4WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// variable
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.manage().window().maximize();
		chromedriver.get("https://shopee.co.id");
		Thread.sleep(5000);
		chromedriver.navigate().to("https://www.tokopedia.com");
		Thread.sleep(5000);
		chromedriver.navigate().back();
		Thread.sleep(5000);
		chromedriver.navigate().forward();
		Thread.sleep(5000);
		chromedriver.close();
	}
}
