package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static pages.SignInPage.*;

public class SignInPage {

    @Given("^User enters the login page with valid credential$")
    public void user_enters_the_login_page_with_valid_credential() throws InterruptedException {
        Thread.sleep(2000);
        sendkeys_username();
        sendkeys_password();
    }
    @When("^User clicks button on login page$")
    public void user_clicks_button_on_login_page(){
        click_login_btn();
    }
}
