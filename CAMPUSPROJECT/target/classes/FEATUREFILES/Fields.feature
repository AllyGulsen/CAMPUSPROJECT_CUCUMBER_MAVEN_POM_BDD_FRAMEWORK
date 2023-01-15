
Feature: Fields Function

  Scenario:Add Fields
    Given  Admin User is  on homepage
    When Admin User navigate to Fields Section
    When  Admin User Add Fields by entering Field Name "Class Dates", Code "CLDT001"
    Then  Admin User should be able receive the success message


  Scenario:Edit Fields
    Given  Admin User is  on homepage
    When Admin User navigate to Fields Section
    When  Admin User Edit Fields by changing Code to "CLDT002"
    Then  Admin User should be able receive the success message


  Scenario:Delete Fields
    Given  Admin User is  on homepage
    When Admin User navigate to Fields Section
    When  Admin User Delete Fields
    Then  Admin User should be able receive the success message