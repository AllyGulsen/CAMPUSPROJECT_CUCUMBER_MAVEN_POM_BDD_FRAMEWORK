Feature: Grade Level Function



  Scenario:Add Grade Level
    Given  Admin User is  on homepage
    When Admin User navigate to Grade Level section
    When  Admin User Add Grade Level by entering Course Name "LECTURE1", Short Name "LC1", Order "1"
    Then  Admin User should be able receive the success message


  Scenario:Edit Grade Level
    Given  Admin User is  on homepage
    When Admin User navigate to Grade Level section
    When  Admin User Edit Grade Level named "LECTURE1" by Entering Order from "1" to "2"
    Then  Admin User should be able receive the success message


  Scenario:Delete Grade Level
    Given  Admin User is  on homepage
    When Admin User navigate to Grade Level section
    When  Admin User Delete Grade Level named  LECTURE1
    Then  Admin User should be able receive the success message