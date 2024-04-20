Feature: LoggedIn User View

  @LoggedInUser
  Scenario: Validate user is able to view after log in
    Given User enters the login page with valid credential
    When User clicks button on login page
    Then User successfully logged in on website