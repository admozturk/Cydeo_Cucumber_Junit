Feature: Google search functionality
  Agile story: As a user, When I am on the google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search title verification
    When user is on Google search page
    Then User should see title is Google


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple and clicks enter
    Then user sees apple in the Google title


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the Google title


