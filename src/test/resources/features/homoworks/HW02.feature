Feature: dynamic buttons
  Scenario: TC01
    Given user goes to url
    When user click on start
    Then  one button raised to clicked
    And two button raised to clicked
    And three button raised to clicked
    And see message 'All Buttons Clicked!