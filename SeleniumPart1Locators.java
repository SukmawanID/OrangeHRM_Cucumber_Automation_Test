package sukmawan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SeleniumPart1Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// variable
		
		String name = "Sukmawan";
		System.setProperty("webdriver.chrome.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/chromedriver-win32/chromedriver.exe");
		
//		WebDriver chromedriver = new ChromeDriver();
//		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		chromedriver.get("https://rahulshettyacademy.com/locatorspractice/");
//		chromedriver.findElement(By.id("inputUsername")).sendKeys("Sukmawan");
//		chromedriver.findElement(By.name("inputPassword")).sendKeys("Sukmawan123");
//		chromedriver.findElement(By.className("signInBtn")).click();
//		System.out.println(chromedriver.findElement(By.cssSelector("p.error")).getText());
//		chromedriver.findElement(By.linkText("Forgot your password?")).click();
//		chromedriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sukmawan");
		
//		chromedriver.close();
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		chromedriver.get("https://rahulshettyacademy.com/locatorspractice/");
		chromedriver.findElement(By.id("inputUsername")).sendKeys(name);
		chromedriver.findElement(By.name("inputPassword")).sendKeys("Sukmawan123");
		chromedriver.findElement(By.className("signInBtn")).click();
		System.out.println(chromedriver.findElement(By.cssSelector("p.error")).getText());
		chromedriver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		chromedriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sukmawan");
		chromedriver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Sukmawan@gmail.com");
		chromedriver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		chromedriver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sukmawan321@gmail.com");
		chromedriver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("082182828282");
		chromedriver.findElement(By.xpath("//input[@type='text'][3]")).clear();
		chromedriver.findElement(By.xpath("//form/input[3]")).sendKeys("082192929292");
		chromedriver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(chromedriver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		chromedriver.findElement(By.cssSelector(".go-to-login-btn")).click();
		chromedriver.findElement(By.cssSelector("#inputUsername")).sendKeys("Sukmawan");
		chromedriver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		chromedriver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		chromedriver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		chromedriver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		System.out.println(chromedriver.findElement(By.tagName("h2")).getText());
		System.out.println(chromedriver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(chromedriver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		Assert.assertEquals(chromedriver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		chromedriver.findElement(By.cssSelector(".logout-btn")).click();
		//chromedriver.findElement(By.xpath("//*[text()='Log Out']")).click();
		Thread.sleep(10000);
		chromedriver.close();
		//System.setProperty("webdriver.firefox.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/geckodriver.exe");

        //System.setProperty("webdriver.edge.driver", "C:/Users/zephyrush/SeleniumTraining/drivers/edge/msedgedriver.exe");

	}

}
