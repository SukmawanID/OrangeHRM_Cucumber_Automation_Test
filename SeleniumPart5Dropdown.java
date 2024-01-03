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

public class SeleniumPart5Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// variable
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag
// Step 1
		//First way
		WebElement StaticDropdown = chromedriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(3);
//Second way
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
//Third way
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
//Next Step 2
		System.out.println(chromedriver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Assert.assertFalse(chromedriver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		chromedriver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(chromedriver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(chromedriver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		int familyandfriendcheckbox = chromedriver.findElements(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).size();
		int totalcheckbox = chromedriver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("Total Family and Friend checkbox is " + familyandfriendcheckbox);
		System.out.println("Total Family and Friend checkbox is " + totalcheckbox);
//Next Step 3		
		chromedriver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		for (int i=1; i < 5; i++) {
			chromedriver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(500);
		}
		System.out.println(chromedriver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(chromedriver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		chromedriver.findElement(By.id("btnclosepaxoption")).click();
//Next Step 4
		Thread.sleep(2000);
		chromedriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		chromedriver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(3000);
		chromedriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//Next Step 5
		Thread.sleep(3000);
		chromedriver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//Next Step 6 		
		Thread.sleep(2000);
		String country = "India";
		chromedriver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = chromedriver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for ( WebElement option : options) {
			if (option.getText().equals(country)) {
				option.click();
				break;
			}
//			if (option.getText().equalsIgnoreCase("India")) {
//				option.click();
//				break;
//			}
		}
//Next Step 7
		Thread.sleep(2000);
		System.out.println(chromedriver.findElement(By.id("Div1")).getAttribute("style"));
		chromedriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(chromedriver.findElement(By.id("Div1")).getAttribute("style"));
		if (chromedriver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
//Next Step 8
		Thread.sleep(2000);
		chromedriver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		Thread.sleep(10000);
		chromedriver.quit();
	}
}
