@FormAuthentication
Feature: Form Authentication

  Scenario Outline: Login
    Given user is on Welcome to the-internet page
    When  user clicks on Form Authentication
    And  user enters the "<Username>"
    And user enters directed "<Password>"
    And user clicks on Login
    Then user SecureArea page is displayed.


    Examples:
      | Username | Password             |
      | tomsmith | SuperSecretPassword! |