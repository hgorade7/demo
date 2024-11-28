Feature: product

  Scenario: verify product link is click able or not
    Given lounch chrome browser
    And open flipkart side
    When search the product
    And click on the search product
    Then verify the product has been open or not by title
