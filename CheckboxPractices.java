package sukmawan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CheckboxPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());

		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[id*='checkBoxOption']")).size());
		
		
		driver.close();
//		driver.findElement(By.cssSelector("input[id*='checkBoxOption']"))).click();
//		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption']")).isSelected());
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption']")).isSelected());
;
		

		
	
	}

}
