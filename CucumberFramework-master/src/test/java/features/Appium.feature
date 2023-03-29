#Author: freeautomationlearning@gmail.com
Feature: Validate Different Options

  @appium
 Scenario: Validate Custom View
    Given I close backup

    When I click on library
    And  I click on folder
    And I click on checkmark
    Then I validate dialer view
