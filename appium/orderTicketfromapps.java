package appium.automation;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orderTicketfromapps {
	@Test
	public void orderTicket() throws MalformedURLException, InterruptedException{
		
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.APP, "");
		
		
		//name='com.traveloka.android.appentry.splash.SplashActivity'
		//name='com.traveloka.android.appentry.splash.SplashActivity'
		// Set 'automationName' capability
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		//Apps
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.traveloka.android");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.traveloka.android.user.onboarding.OnBoardingActivity");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.traveloka.android.user.onboarding.OnBoardingActivity");
		capabilities.setCapability("appActivity", "com.traveloka.android.appentry.splash.SplashActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://192.168.1.9:4723/"), capabilities);
		
		WebDriverWait ExplicitWait = new WebDriverWait(driver,Duration.ofSeconds(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String firstCity = "Jakarta";
		String lastCity = "Padang";
		String month = "Sep 2024";
		int totalMonth = 12;
		String date = "7";
		int totalDate = 31;
		
		// Get the current date
		LocalDate currentDate = LocalDate.now();
		// add 1 day
		LocalDate nextDate = currentDate.plusDays(1);
		
		// Format Date
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy", new Locale("id"));
		String formatcurrentDate = currentDate.format(formatDate);
		String formatnextDate = nextDate.format(formatDate);
		
		//Start Welcome Page
		welcomePage(ExplicitWait, driver);
		
		//Home Page
		homePage(ExplicitWait, driver);
		
		//Plane Order Ticket Menu
		planeOrderTicket(driver);
		
		//Choose Your City
		city(ExplicitWait, driver, firstCity, lastCity);
		
		//Choose and Set Calender
		setCalender(ExplicitWait, driver, month, totalMonth, date, totalDate, formatnextDate);
		
		//Choose Total Passenger
		passenger(ExplicitWait, driver);
		
		//Choose Class Seat
		classSeat(ExplicitWait, driver);
		
		//Find Ticket
		findTicket(driver);

		Thread.sleep(5000);
		driver.quit();
	
	}
	
	public void welcomePage(WebDriverWait ExplicitWait, AndroidDriver driver) {
		ExplicitWait.until(ExpectedConditions.elementToBeClickable((By.id("com.traveloka.android:id/on_board_button_continue"))));
		WebElement continueButton = driver.findElement(By.id("com.traveloka.android:id/on_board_button_continue"));
		continueButton.click();
		
		ExplicitWait.until(ExpectedConditions.elementToBeClickable((By.id("com.traveloka.android:id/close_button"))));
		WebElement closeButton = driver.findElement(By.id("com.traveloka.android:id/close_button"));
		closeButton.click();
		
		ExplicitWait.until(ExpectedConditions.elementToBeClickable((By.id("com.traveloka.android:id/imageClose"))));
		WebElement imageClose = driver.findElement(By.id("com.traveloka.android:id/imageClose"));
		imageClose.click();
		
	}
	
	public void homePage(WebDriverWait ExplicitWait, AndroidDriver driver) {
		ExplicitWait.until(ExpectedConditions.elementToBeClickable((By.id("com.traveloka.android:id/button_tooltip"))));
		WebElement buttonTooltip = driver.findElement(By.id("com.traveloka.android:id/button_tooltip"));
		buttonTooltip.click();		
		
		ExplicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.ImageView[@resource-id='com.traveloka.android:id/image_view_product_icon'])[1]")));
		WebElement planeIcon = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.traveloka.android:id/image_view_product_icon'])[1]"));
		planeIcon.click();	
	}
	
	public void planeOrderTicket(AndroidDriver driver) {
		WebElement oneWayOrRoundTrip = driver.findElement(By.id("com.traveloka.android.flight:id/text_owrt"));
		oneWayOrRoundTrip.click();
	}
	
	public void city(WebDriverWait ExplicitWait, AndroidDriver driver, String firstCity, String lastCity) {
		ExplicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='com.traveloka.android:id/edit_text_field' and @text='Jakarta (JKTA)']")));
		WebElement fromCity = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.traveloka.android:id/edit_text_field' and @text='Jakarta (JKTA)']"));
		fromCity.click();	
		
		ExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
		WebElement editTextfromCity = driver.findElement(By.className("android.widget.EditText"));
		editTextfromCity.sendKeys(firstCity);
		
		ExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.TextView[@resource-id='com.traveloka.android.flight:id/text_view_location'])[1]")));
		WebElement chooseFromCity = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.traveloka.android.flight:id/text_view_location'])[1]"));
		chooseFromCity.click();
		
		ExplicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='com.traveloka.android:id/edit_text_field' and @text='Bali / Denpasar (DPS)']")));
		WebElement toCity = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.traveloka.android:id/edit_text_field' and @text='Bali / Denpasar (DPS)']"));
		toCity.click();	
		
		ExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
		WebElement editTextToCity = driver.findElement(By.className("android.widget.EditText"));
		editTextToCity.sendKeys(lastCity);
		
		ExplicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='com.traveloka.android.flight:id/text_view_location' and @text='Padang, Indonesia']")));
		WebElement chooseToCity = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.traveloka.android.flight:id/text_view_location' and @text='Padang, Indonesia']"));
		chooseToCity.click();

	}
	
	public void setCalender(WebDriverWait ExplicitWait, AndroidDriver driver, String month, int totalMonth, String date, int totalDate, String formatnextDate) {
		WebElement chooseStartDate = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.traveloka.android:id/edit_text_field' and @text='"+ formatnextDate +"']"));
		chooseStartDate.click();
		
		for (int i=1; i<totalMonth; i++) {
			String chooseMonth = driver.findElement(By.id("com.traveloka.android:id/tv_header_title")).getText();
			if(chooseMonth.equalsIgnoreCase(month)) {
				break;
			}
			else {
				WebElement clickNextMonth = driver.findElement(By.id("com.traveloka.android:id/iv_icon_end"));
				clickNextMonth.click();
			}
		}																	

		for (int i=1; i<totalDate;i++) {
			ExplicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.View[@content-desc='"+ i +"'])[1]")));
			WebElement chooseDate = driver.findElement(By.xpath("(//android.view.View[@content-desc='"+ i +"'])[1]"));
			chooseDate.getText();
			if(i==Integer.parseInt(date)) {
				WebElement clickNextDate = driver.findElement(By.xpath("(//android.view.View[@content-desc='"+ i +"'])[1]"));
				clickNextDate.click();
				break;
			}
		}
	}
	
	public void passenger (WebDriverWait ExplicitWait, AndroidDriver driver) {
		WebElement passenger = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.traveloka.android:id/edit_text_field' and @text='1 penumpang']"));
		passenger.click();
		
		WebElement chooseAdultpassenger = driver.findElement(By.id("com.traveloka.android.flight:id/wheel_passenger_adult"));
		chooseAdultpassenger.click();
		
		WebElement chooseButtonpassenger = driver.findElement(By.xpath("//android.widget.Button[@text='Pilih']"));
		chooseButtonpassenger.click();
	}
	
	public void classSeat (WebDriverWait ExplicitWait, AndroidDriver driver) {
		WebElement classSeat = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.traveloka.android:id/edit_text_field' and @text='Economy']"));
		classSeat.click();


		WebElement chooseRadioButtonSeat = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.traveloka.android:id/title' and @text='Economy']"));
		chooseRadioButtonSeat.click();
		
		
		WebElement chooseButtonSeat = driver.findElement(By.xpath("//android.widget.Button[@text='SELESAI']"));
		chooseButtonSeat.click();
	}
	
	public void findTicket(AndroidDriver driver) {
		WebElement findTicket = driver.findElement(By.id("com.traveloka.android.flight:id/btn_search"));
		findTicket.click();
	}
}
