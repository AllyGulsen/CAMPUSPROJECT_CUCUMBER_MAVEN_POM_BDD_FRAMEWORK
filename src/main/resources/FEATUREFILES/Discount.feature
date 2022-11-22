Feature: Discount Function

  Scenario:Add Discount
    Given  Admin User is  on homepage
    When Admin User navigate to Discount Section
    When  Admin User Add Discount by entering Description Code "free", Integration Code "000", Priority "00001"
    Then  Admin User should be able receive the success message


  Scenario:Edit Discount
    Given  Admin User is  on homepage
    When Admin User navigate to Discount Section
    When  Admin User Edit Discount by Entering Description Code from "free" to "halfprice"
    Then  Admin User should be able receive the success message


  Scenario:Delete Discount
    Given  Admin User is  on homepage
    When Admin User navigate to Discount Section
    When  Admin User Delete Discount with "halfprice" Description
    Then  Admin User should be able receive the success message