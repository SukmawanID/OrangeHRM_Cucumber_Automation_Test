package sukmawan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntroduction {
	public static void main(String [] args) {
		
		//invoke browser chromedriver.exe
//		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.rahulshettyacademy.com");
//		driver.getTitle();
//		String title = driver.getTitle();
//		System.out.println("Title Website : " + title);
//		String URL = driver.getCurrentUrl();
//		System.out.println("Your URL : " + URL);
//		driver.close();
//		driver.quit();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.getTitle();
		String title = driver.getTitle();
		System.out.println("Title Website : " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL Website : " + url);
		driver.close();
		driver.quit();
		
//		Firefox		
//		System.setProperty("webdriver.gecko.driver","C:/Users/zephyrush/SeleniumTraining/drivers/geckodriver.exe");
//				
//		WebDriver driverfirefox = new FirefoxDriver();
//		driverfirefox.get("https://www.rahulshettyacademy.com");
//		driverfirefox.getTitle();
//		String title2 = driverfirefox.getTitle();
//		System.out.println("Title Website : " + title2);
//		String URL2 = driverfirefox.getCurrentUrl();
//		System.out.println("Your URL : " + URL2);
//		driverfirefox.close();
		
//		Edge
//		System.setProperty("webdriver.edge.driver","C:/Users/zephyrush/SeleniumTraining/drivers/msedgedriver.exe");
//		WebDriver driveredge = new EdgeDriver();
//		driveredge.get("https://www.rahulshettyacademy.com");
//		
//		driveredge.getTitle();
//		String title3 = driveredge.getTitle();
//		System.out.println("Title Website : " + title3);
//		String URL3 = driveredge.getCurrentUrl();
//		System.out.println("Your URL : " + URL3);
//		driveredge.close();
		
		
		
	}

}
