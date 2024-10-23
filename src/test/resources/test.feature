Feature: All test cases for positive & negative scenarios

 Background:
   Given User goes to saucedemo website

@smoke1
  Scenario: Login with positive/correct credentials
    Given User goes to saucedemo website
    When User enters username "standard_user"
    And User enters  password "secret_sauce"
    Then User should be able to login

 @smoke2
  Scenario Outline : Login with positive/correct credentials
      Given user goes to saucedemo website
      When User enters username "<Username>"
      And User enters  password "<Password>"
      Then User should be able to login

     Examples:
    |Username| Password|
    |standard_user|secret_sauce|
    |visual_user|secret_sauce|