$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BlazeWelcome.feature");
formatter.feature({
  "line": 1,
  "name": "Find Flight",
  "description": "",
  "id": "find-flight",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Find flights for choosen departure and destination city",
  "description": "",
  "id": "find-flight;find-flights-for-choosen-departure-and-destination-city",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on Blaze Flight booking",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am on Blaze Flight Welcome Page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I choose departure \u003cdepCity\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I choose destination \u003cdestCity\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click find flight button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify choose the flight page is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "find-flight;find-flights-for-choosen-departure-and-destination-city;",
  "rows": [
    {
      "cells": [
        "depCity",
        "destCity"
      ],
      "line": 12,
      "id": "find-flight;find-flights-for-choosen-departure-and-destination-city;;1"
    },
    {
      "cells": [
        "Boston",
        "Rome"
      ],
      "line": 13,
      "id": "find-flight;find-flights-for-choosen-departure-and-destination-city;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Find flights for choosen departure and destination city",
  "description": "",
  "id": "find-flight;find-flights-for-choosen-departure-and-destination-city;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on Blaze Flight booking",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am on Blaze Flight Welcome Page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I choose departure Boston",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I choose destination Rome",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click find flight button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify choose the flight page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BlazeWelcomeSteps.i_Am_On_Blaze_Flight_Booking()"
});
formatter.result({
  "duration": 11199351900,
  "status": "passed"
});
formatter.match({
  "location": "BlazeWelcomeSteps.i_Am_On_Blaze_Flight_Welcome_Booking()"
});
formatter.result({
  "duration": 168803200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Boston",
      "offset": 19
    }
  ],
  "location": "BlazeWelcomeSteps.i_choose_departure(String)"
});
formatter.result({
  "duration": 103881000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rome",
      "offset": 21
    }
  ],
  "location": "BlazeWelcomeSteps.i_choose_destination(String)"
});
formatter.result({
  "duration": 102790700,
  "status": "passed"
});
formatter.match({
  "location": "BlazeWelcomeSteps.i_click_find_flight_button()"
});
formatter.result({
  "duration": 726110100,
  "status": "passed"
});
formatter.match({
  "location": "BlazeWelcomeSteps.i_verify_choose_the_flight_page_is_displayed()"
});
formatter.result({
  "duration": 76917300,
  "status": "passed"
});
formatter.uri("chooseFlights.feature");
formatter.feature({
  "line": 1,
  "name": "Choose Relevant flights",
  "description": "",
  "id": "choose-relevant-flights",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Choose the Relevant flights",
  "description": "",
  "id": "choose-relevant-flights;choose-the-relevant-flights",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I choose flight \u003cFlightnumber\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I am on purchase Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "choose-relevant-flights;choose-the-relevant-flights;",
  "rows": [
    {
      "cells": [
        "Flightnumber"
      ],
      "line": 8,
      "id": "choose-relevant-flights;choose-the-relevant-flights;;1"
    },
    {
      "cells": [
        "234"
      ],
      "line": 9,
      "id": "choose-relevant-flights;choose-the-relevant-flights;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "Choose the Relevant flights",
  "description": "",
  "id": "choose-relevant-flights;choose-the-relevant-flights;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I choose flight 234",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I am on purchase Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "234",
      "offset": 16
    }
  ],
  "location": "ChooseFlightsSteps.i_choose_flight(String)"
});
formatter.result({
  "duration": 868982800,
  "status": "passed"
});
formatter.match({
  "location": "ChooseFlightsSteps.i_am_on_purchase_page()"
});
formatter.result({
  "duration": 72944000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validate the Total cost of the Flight",
  "description": "",
  "id": "choose-relevant-flights;validate-the-total-cost-of-the-flight",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 12,
      "value": "# Then I validate Total Cost is displayed correctly"
    }
  ],
  "line": 15,
  "name": "Purchase the Flight",
  "description": "",
  "id": "choose-relevant-flights;purchase-the-flight",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I enter passenger \u003cname\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter address \u003caddress\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I enter card \u003ccardNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click Purchase Flight",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I validate that I am navigated to confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "choose-relevant-flights;purchase-the-flight;",
  "rows": [
    {
      "cells": [
        "name",
        "address",
        "cardNumber"
      ],
      "line": 23,
      "id": "choose-relevant-flights;purchase-the-flight;;1"
    },
    {
      "cells": [
        "John",
        "401, A street",
        "1111111111"
      ],
      "line": 24,
      "id": "choose-relevant-flights;purchase-the-flight;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Purchase the Flight",
  "description": "",
  "id": "choose-relevant-flights;purchase-the-flight;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I enter passenger John",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter address 401, A street",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I enter card 1111111111",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click Purchase Flight",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I validate that I am navigated to confirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 18
    }
  ],
  "location": "ChooseFlightsSteps.i_enter_passenger_name(String)"
});
formatter.result({
  "duration": 206980100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "401, A street",
      "offset": 16
    }
  ],
  "location": "ChooseFlightsSteps.i_enter_address(String)"
});
formatter.result({
  "duration": 277981000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1111111111",
      "offset": 13
    }
  ],
  "location": "ChooseFlightsSteps.i_enter_card(String)"
});
formatter.result({
  "duration": 159153800,
  "status": "passed"
});
formatter.match({
  "location": "ChooseFlightsSteps.i_click_purchase_flight()"
});
formatter.result({
  "duration": 664233700,
  "status": "passed"
});
formatter.match({
  "location": "ChooseFlightsSteps.i_Validate_Confirmation_Page_Url()"
});
formatter.result({
  "duration": 21464900,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Validate the Purchase Order",
  "description": "",
  "id": "choose-relevant-flights;validate-the-purchase-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "I am on Purchase Order page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I validate the PO ID",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I validate amount",
  "keyword": "Then "
});
formatter.match({
  "location": "ChooseFlightsSteps.i_am_on_Purchase_order_page()"
});
formatter.result({
  "duration": 51771500,
  "status": "passed"
});
formatter.match({
  "location": "ChooseFlightsSteps.i_validate_the_PO_ID()"
});
formatter.result({
  "duration": 96974300,
  "status": "passed"
});
formatter.match({
  "location": "ChooseFlightsSteps.i_validate_amount()"
});
formatter.result({
  "duration": 54671400,
  "status": "passed"
});
});