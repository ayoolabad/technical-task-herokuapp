@DynamicLoading
  Feature: Dynamic Loading
    Scenario: Dynamic Loading
      Given user is on the Welcome to the-internet page
      When user clicks on Dynamic Loading
      And user  clicks on Example: Element rendered  after the fact
      And user clicks on Start
      Then Hello World! message appears.