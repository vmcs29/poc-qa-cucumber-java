Feature: Google Search
 
 
  Scenario: Validate google search text field
    Given I open a browser
    When I navigate to google page
    Then I validate search text field
