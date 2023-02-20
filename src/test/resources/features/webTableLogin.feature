Feature: User should be able to login with correct credentials

  @wip
  Scenario: Positive login scenario
    Given User is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user click to login button
    Then user should see url contains folder
