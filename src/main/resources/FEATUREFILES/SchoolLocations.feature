Feature: School Locations Function
    @Regression

  Scenario:Add School Location
    Given  Admin User is  on homepage
    When Admin User navigate to School Location Section
    When  Admin User Add School Location by entering Location Name "School Location", Short Name "SCHL", Capacity "50"
    Then  Admin User should be able receive the success message


  Scenario:Edit School Location
    Given  Admin User is  on homepage
    When Admin User navigate to School Location Section
    When  Admin User Edit School Location by changing Capacity to "100"
    Then  Admin User should be able receive the success message


  Scenario:Delete School Location
    Given  Admin User is  on homepage
    When Admin User navigate to School Location Section
    When  Admin User Delete School Location
    Then  Admin User should be able receive the success message