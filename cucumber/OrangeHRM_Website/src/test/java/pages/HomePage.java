package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static utility.BrowserDriver.driver;

public class HomePage {

    public static String title_page_xpath = "//h6[text()='Dashboard']";



    public static void get_title_page() {
       driver.findElement(By.xpath(title_page_xpath)).getText();
    }

}