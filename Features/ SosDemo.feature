Feature: check login feature

  @tag1
  Scenario: verify the user login functionality
    Given Open browser
    And Open saurcedemo web
    When when login valid credentials
    And verify the url
    Then logout
