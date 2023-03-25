Feature: feature to test homepage functionality
  Scenario: Check login is successful with credentials

    Given user is on home page
    When user click on login
    And clicks on submitt
    Then user is authorized
