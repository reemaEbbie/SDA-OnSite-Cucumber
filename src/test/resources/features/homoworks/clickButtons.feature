Feature: Fill Form and submit with scenario outline
  Background: User will open browser and go to Simple Dynamic Buttons page
    Given go to Simple Dynamic Buttons page

  @Click_Buttons
  Scenario:
    When Click on "start" Button
    And Click on "One" Button
    And Click on "Two" Button
    And Click on "Three" Button
    Then verify message will appear