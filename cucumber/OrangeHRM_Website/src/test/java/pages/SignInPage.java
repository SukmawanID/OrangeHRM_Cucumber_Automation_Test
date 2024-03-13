package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SignInPage extends BrowserDriver {

    public static String username_text_xpath ="//input[@name='username']";
    public static String password_text_xpath ="//input[@name='password']";
    public static String login_btn_xpath ="//button[@type='submit']";
    public static String forgot_password_link_xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']";


    public static void sendkeys_username()
    {
     driver.findElement(By.xpath(username_text_xpath)).sendKeys("Admin");
    }

    public static void sendkeys_password()
    {
        driver.findElement(By.xpath(password_text_xpath)).sendKeys("admin123");
    }

    public static void click_login_btn()
    {
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

    public static void click_forgot_password_link() {
        driver.findElement(By.xpath(forgot_password_link_xpath)).click();
    }
}
