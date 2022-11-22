
  Feature: Nationality Function
    @Regression

    Scenario:Add Nationality
      Given  Admin User is  on homepage
      When Admin User navigate to Nationalities Section
      When  Admin User Add Nationality "Uvanda"
      Then  Admin User should be able receive the success message


    Scenario:Edit Nationality
      Given  Admin User is  on homepage
      When  Admin User navigate to Nationalities Section
      When  Admin User Edit Nationality from "Uvanda" to "Uganda"
      Then  Admin User should be able receive the success message


    Scenario:Delete Nationality
      Given  Admin User is  on homepage
      When  Admin User navigate to Nationalities Section
      When  Admin User Delete Nationality "Uganda"
      Then  Admin User should be able receive the success message