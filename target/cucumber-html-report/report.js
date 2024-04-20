$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoggedInUser.feature");
formatter.feature({
  "line": 1,
  "name": "LoggedIn User View",
  "description": "",
  "id": "loggedin-user-view",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26566759600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate user is able to view after log in",
  "description": "",
  "id": "loggedin-user-view;validate-user-is-able-to-view-after-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@LoggedInUser"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User enters the login page with valid credential",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks button on login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User successfully logged in on website",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInPage.user_enters_the_login_page_with_valid_credential()"
});
formatter.result({
  "duration": 2190155400,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_clicks_button_on_login_page()"
});
formatter.result({
  "duration": 33858500,
  "status": "passed"
});
formatter.match({
  "location": "BasePage.user_navigates_to_the_Login_page_on_website()"
});
formatter.result({
  "duration": 2563626700,
  "status": "passed"
});
formatter.after({
  "duration": 85001700,
  "status": "passed"
});
});