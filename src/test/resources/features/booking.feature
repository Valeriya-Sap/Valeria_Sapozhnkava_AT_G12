Feature: Search hotels on Booking

  Scenario: Check hotel rating in Paris
    Given I open a site
    When I fill the search form
    Then I verify that first hotel has rate 5

  Scenario: Check hotel rating in Prague
    Given I open a site Prague
    When I fill the search form Prague
    Then I verify that first hotel has rate 9+

  Scenario: Check hotel rating in London
    Given I open a site London
    When I fill the search form London
    Then I verify the screenshot

  Scenario: Check a tooltip for Currency
    Given I open a site Booking
    When I hover icon Currency
    Then I verify the tooltip Currency

  Scenario: Check a tooltip for Language
    Given I open a site Booking2
    When I hover icon Language
    Then I verify the tooltip Language