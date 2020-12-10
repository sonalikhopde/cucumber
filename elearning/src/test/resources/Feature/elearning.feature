@tag
Feature: Validating Login screen

  Scenario: Validate sucessful Login with valid data
    Given User should hv launched application
    When logged in as teacher and course created
    Then To verify whether application allows teacher to add project details
