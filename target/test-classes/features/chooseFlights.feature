Feature: Choose Relevant flights

  Scenario Outline: Choose the Relevant flights
    When I choose flight <Flightnumber>
    Then I am on purchase Page

    Examples:
     |Flightnumber|
      |234        |

    Scenario: Validate the Total cost of the Flight
     # Then I validate Total Cost is displayed correctly


    Scenario Outline: Purchase the Flight
      When I enter passenger <name>
      When I enter address <address>
      And I enter card <cardNumber>
      And I click Purchase Flight
      Then I validate that I am navigated to confirmation page

      Examples:
      |name| address | cardNumber|
      |John| 401, A street  | 1111111111|

      Scenario: Validate the Purchase Order
        Given I am on Purchase Order page
        Then I validate the PO ID
        Then I validate amount


