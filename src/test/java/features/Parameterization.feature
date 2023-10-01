Feature: Google Search

  Scenario: Validate search feature
    Given I open a browser
    When I navigate to google page
    And I enter "cucumber" in search keyword
    And I enter "youtube" in search keyword
    Then I validated searched text field
