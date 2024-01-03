package sukmawan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		System.setProperty("webdriver.firefox.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/geckodriver.exe");
		WebDriver driverfirefox = new FirefoxDriver();
        driverfirefox.get("https://www.shopee.co.id");
        System.out.println(driverfirefox.getTitle());
        System.out.println(driverfirefox.getCurrentUrl());
        driverfirefox.close();
        
        System.setProperty("webdriver.edge.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/edge/msedgedriver.exe");
        WebDriver driveredge = new EdgeDriver();
        driveredge.get("https://www.tokopedia.com");
        System.out.println(driveredge.getTitle());
        System.out.println(driveredge.getCurrentUrl());
        driveredge.close();
        

        
		
	}

}
