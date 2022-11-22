
Feature: Departments Function

  Scenario:Add Departments
    Given  Admin User is  on homepage
    When Admin User navigate to Departments Section
    When  Admin User Add Department by entering Department Name "SDET", Departmant Code "101"
    Then  Admin User should be able receive the success message


  Scenario:Edit Departments
    Given  Admin User is  on homepage
    When Admin User navigate to Departments Section
    When  Admin User Edit Department by changing Department Code to "102"
    Then  Admin User should be able receive the success message


  Scenario:Delete Departments
    Given  Admin User is  on homepage
    When Admin User navigate to Departments Section
    When  Admin User Delete Department
    Then  Admin User should be able receive the success message