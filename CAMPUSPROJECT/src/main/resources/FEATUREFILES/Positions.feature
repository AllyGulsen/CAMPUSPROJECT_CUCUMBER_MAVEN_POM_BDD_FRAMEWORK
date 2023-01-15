
Feature: Positions Function
    @Regression

  Scenario:Add Positions
    Given  Admin User is  on homepage
    When Admin User navigate to Positions Section
    When  Admin User Add Positions by entering Position Name "Professor", Short Name "PROF"
    Then  Admin User should be able receive the success message


  Scenario:Edit Positions
    Given  Admin User is  on homepage
    When Admin User navigate to Positions Section
    When  Admin User Edit Positions from "Professor" by changing Position Name to "Assistant Professor", Short Name to "ASSPROF"
    Then  Admin User should be able receive the success message


  Scenario:Delete Positions
    Given  Admin User is  on homepage
    When Admin User navigate to Positions Section
    When  Admin User Delete Positions
    Then  Admin User should be able receive the success message