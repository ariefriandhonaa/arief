Feature: post photo instagram

  @instagram
  Scenario: Login instagram
    Given I open instagram browser
    When I navigate to instagram page
    Then I input email instagram "trainingbcad2023"
    Then I input email password "BCATraining@2023"
    Then I click log in
    Then I click button create
    Then I click select from computer
    Then I change format picture
    Then I change to 169
    Then I click next
    Then I click next2
    Then I input caption "Tolong!"
    Then I click share
    Then I click close
    Then I click button home

