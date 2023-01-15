Feature: Subject Categories Function

  Scenario:Add Subject Categories
    Given  Admin User is  on homepage
    When Admin User navigate to Subject Categories Section
    When  Admin User Add Subject Categories by entering Subject Category Name "Computer Programming", Code "CP101"
    Then  Admin User should be able receive the success message


  Scenario:Edit Subject Categories
    Given  Admin User is  on homepage
    When Admin User navigate to Subject Categories Section
    When  Admin User Edit Subject Categories by changing Code to "CP102"
    Then  Admin User should be able receive the success message


  Scenario:Delete Subject Categories
    Given  Admin User is  on homepage
    When Admin User navigate to Subject Categories Section
    When  Admin User Delete Subject Categories
    Then  Admin User should be able receive the success message