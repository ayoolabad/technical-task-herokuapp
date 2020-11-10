@JavaScriptAlerts
  Feature: JavaScriptAlerts
    Scenario: Relevant message appears
      Given user is on that Welcome to the-internet page
      When user clicks the JavaScript Alerts
      And user clicks on Click for JS Confirm
      And user clicks ok
      Then relevant message appears

