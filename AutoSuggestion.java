package sukmawan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List <WebElement> ListCountry = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for ( WebElement Country  : ListCountry )
		{
			if ( Country.getText().equalsIgnoreCase("Indonesia"))
			{
				Country.click();
				break;
			}
		}
	}

}
