Feature: Find Flight

  Scenario Outline: Find flights for choosen departure and destination city
    Given I am on Blaze Flight booking
    Then I am on Blaze Flight Welcome Page
    When I choose departure <depCity>
    And I choose destination <destCity>
    And I click find flight button
    Then I verify choose the flight page is displayed

    Examples:
    |depCity|destCity|
    |  Boston     |   Rome     |


