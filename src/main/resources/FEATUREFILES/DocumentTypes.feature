

Feature: Document Types Function

  Scenario:Add Document Types
    Given  Admin User is  on homepage
    When Admin User navigate to Document Types Section
    When  Admin User add Document Types by entering Document Name "Salary Information", Description "Very Confidential"
    Then  Admin User should be able receive the success message


  Scenario:Edit Document Types
    Given  Admin User is  on homepage
    When Admin User navigate to Document Types Section
    When  Admin User Edit Document Types named "Salary Information" by changing Description to "Confidential except Human Resources"
    Then  Admin User should be able receive the success message


  Scenario:Delete Document Types
    Given  Admin User is  on homepage
    When Admin User navigate to Document Types Section
    When  Admin User Delete Document Types named "Salary Information"
    Then  Admin User should be able receive the success message