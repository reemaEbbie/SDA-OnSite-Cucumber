Feature: Data Tables Feature

  Scenario: Data Tables Test
    When I search for String on google
      |amazon|
      |SDA   |
    Then I should see String on the results
      | amazon |
      |SDA     |
    Then I close the browser