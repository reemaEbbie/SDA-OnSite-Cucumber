Feature: first task

  This is the description that i am adding to the feature file

  Scenario: user searches for samsung
    Given I open the browser
    And I am on the google homepage
    When I search for "samsung" on google
    Then I should see "samsung" on the results
    Then I close the browser

  Scenario: The name of second scenario
    Given I open the browser
    And I am on the google homepage
    When I search for "cucumber" on google
    Then I should see "cucumber" on the results
    Then I close the browser