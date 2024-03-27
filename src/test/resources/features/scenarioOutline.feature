Feature: Search for Desired Words on Amazon

  @SO
  Scenario Outline: Search for Keywords on Ebay
    Given the user navigates to the Ebay homepage
    * I open the browser
    When the user searches for "<value>"
    Then the user verifies that the search results contain "<value>"
    * I close the browser
    Examples:
      | value   |  |
      | mac     |  |
      | windows |  |
      | linux   |  |