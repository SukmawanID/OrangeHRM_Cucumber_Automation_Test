package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.java.PendingException;

import static pages.HomePage.*;

public class BasePage {
    @Then("^User successfully logged in on website$")
    public void user_navigates_to_the_Login_page_on_website() throws Throwable {
        get_title_page();
    }
}
