package sukmawan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumPart6Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// variable
		String text = "Sukmawan";
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		chromedriver.findElement(By.id("name")).sendKeys(text);
		chromedriver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(1000);
		System.out.println(chromedriver.switchTo().alert().getText());
		chromedriver.switchTo().alert().accept();
		chromedriver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		Thread.sleep(1000);
		System.out.println(chromedriver.switchTo().alert().getText());
		chromedriver.switchTo().alert().dismiss();

		Thread.sleep(5000);
		chromedriver.quit();
	}
}
