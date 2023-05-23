Feature: Renault.com
  Scenario: Find Authorized Dealer
    Given User opens homepage
    When Click find authorized dealer button
    When Check authorized dealer page
    When Enter location
    When Click the first location
    When Click filter button
    When Filter for new car and accept
    When Click first branch
    When Click online service appointment
    Then User access the appointment page