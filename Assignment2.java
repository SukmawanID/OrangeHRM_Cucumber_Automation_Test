package sukmawan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		String name = "Sukmawan";
		String password = "test";

		
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys("sukmawan@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(password);
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement DropdownStatic = driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
		Select dropdowngender = new Select(DropdownStatic);
		dropdowngender.selectByVisibleText("Male");
		System.out.println(dropdowngender.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input[id='inlineRadio2']")).click();
		driver.findElement(By.name("bday")).sendKeys("04111994");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
				
		
	}
	
}
