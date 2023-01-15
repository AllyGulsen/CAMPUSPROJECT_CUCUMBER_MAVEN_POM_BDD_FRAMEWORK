

Feature: Attestations Function

  Scenario:Add Attestations
    Given  Admin User is  on homepage
    When Admin User navigate to Attestations Section
    When  Admin User add Attestations by entering Attestations Name "SDET Certificate"
    Then  Admin User should be able receive the success message


  Scenario:Edit Attestations
    Given  Admin User is  on homepage
    When Admin User navigate to Attestations Section
    When  Admin User Edit Attestations named "SDET Certificate" by changing Name to "SDET Certificate Attestation"
    Then  Admin User should be able receive the success message


  Scenario:Delete Attestations
    Given  Admin User is  on homepage
    When Admin User navigate to Attestations Section
    When  Admin User Delete Attestations named "SDET Certificate Attestation"
    Then  Admin User should be able receive the success message