Feature: Google Search


  Scenario Outline: Validate Search Feature
    Given I open a browser
    When I navigate to google page
    And I enter "<searchText>" in search keyword
    Then I validated searched text field

    Examples: 
      | searchText |
      | cucumber   |
      | Youtube    |
