

Feature: checking the events for this week of march 16

  Scenario: To check the Events for March 16 on the PBC portal
    Given Login to parsippany baptist church url
    When I click on events tab
    And I click on the calendar
    And I click on the list
    And I click on AM worship service
    Then I validate the outcomes
   

