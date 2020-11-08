@Login
Feature: Log In

  Scenario Outline: Log into Account
    Given user is on Login page
    When user inputs the "<Username>"
    And user enters the "<Password>" given
    Then user then clicks on Login

    Examples:
      | Username | Password             |
      | tomsmith | SuperSecretPassword! |