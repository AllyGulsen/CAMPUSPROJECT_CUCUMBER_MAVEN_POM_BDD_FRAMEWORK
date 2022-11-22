
Feature: Bank Account Function

  Scenario:Add Bank Account
    Given  Admin User is  on homepage
    When Admin User navigate to Bank Account section
    When  Admin User Add Bank Account by entering User Name "UserNameForBankAccount", IBAN "TR76543210", Currency and Integration Code "111"
    Then  Admin User should be able receive the success message


  Scenario:Edit Bank Account
    Given  Admin User is  on homepage
    When Admin User navigate to Bank Account section
    When  Admin User Edit Bank Account of User "UserNameForBankAccount" by changing name to "UpdatedUserNameForBankAccount"
    Then  Admin User should be able receive the success message


  Scenario:Delete Bank Account
    Given  Admin User is  on homepage
    When Admin User navigate to Bank Account section
    When  Admin User Delete Bank Account of UpdatedUserNameForBankAccount
    Then  Admin User should be able receive the success message