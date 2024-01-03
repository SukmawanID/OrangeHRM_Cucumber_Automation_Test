package sukmawan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SeleniumPart3Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// variable
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver-win32/chromedriver.exe");
		//C:\Users\zephyrush\SeleniumTraining\drivers\chromedriver-win32
		//System.setProperty("webdriver.firefox.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/geckodriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/edge/msedgedriver.exe");
		//sibling - child to parent traverse
		//header/div/button[1]/following-sibling::button[1]
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(chromedriver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(chromedriver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		Thread.sleep(5000);
		chromedriver.close();
	}
}
