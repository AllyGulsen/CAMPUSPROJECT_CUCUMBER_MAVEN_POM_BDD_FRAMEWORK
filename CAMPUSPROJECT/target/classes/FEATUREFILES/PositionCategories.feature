


Feature: Position Categories Function

  Scenario:Add Position Categories
    Given  Admin User is  on homepage
    When Admin User navigate to Position Categories
    When  Admin User add Position Categories by entering Position Category Name "Computer Sciences"
    Then  Admin User should be able receive the success message


  Scenario:Edit Position Categories
    Given  Admin User is  on homepage
    When Admin User navigate to Position Categories
    When  Admin User Edit Position Categories named "Computer Sciences" by changing Name to "Computer Programmers"
    Then  Admin User should be able receive the success message


  Scenario:Delete Position Categories
    Given  Admin User is  on homepage
    When Admin User navigate to Position Categories
    When  Admin User Position Categories named "Computer Programmers"
    Then  Admin User should be able receive the success message