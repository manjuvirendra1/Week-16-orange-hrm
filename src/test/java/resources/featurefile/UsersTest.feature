Feature: Users Test
  As a user I should verify employee successfully

  Background: I am on homepage

 @sanity @regression
  Scenario: I should add user successfully
    When I enter username
    And I enter password
    And I click on login button
    Then I should navigate to login page successfully
    And I click on Admin Tab
    And I verify System Users text
    And I click on add button
    And I verify Add User text
    Then I select User Role Admin
    And I enter employee name "Goutam Ganesh"
    And  I enter username "Mehek"
    And I select status Disable
    And I enter password "Prime12345*"
    And I enter confirm password "Prime12345*"
    Then I click on save button

 @smoke @regression
  Scenario: I should see the user in the result list
    When I enter username
    And I enter password
    And I click on login button
    Then I should navigate to login page successfully
    And I click on Admin Tab
    And I verify System Users text
    And I enter System Users Username "Mahi Thakur"
    And I select User Role
    And I select Disable status
    And I click on Search button
    Then I verify the user is in the result list

    @regression
    Scenario: I should able to delete the user successfully
      When I enter username
      And I enter password
      And I click on login button
      Then I should navigate to login page successfully
      And I click on Admin Tab
      And I verify System Users text
      And I enter System Users Username "Mahi Thakur"
      And I select User Role
      And I enter employee name "Goutam Ganesh"
      And I select Disable status
      And I click on Search button
      And I verify the user is in the result list
      Then I click on checkbox
      Then I click on Delete button
      And I click on popup button
      Then I should be able to verify user Successfully Deleted

    @regression
      Scenario: I should be able to search deleted user and verify No Records Found Text
        When I enter username
        And I enter password
        And I click on login button
        Then I should navigate to login page successfully
        And I click on Admin Tab
        And I verify System Users text
        And I enter System Users Username "Mehek Thakur"
        And I select User Role
        And I enter employee name "Goutam Ganesh"
        And I select Disable status
        And I click on Search button
        Then I verify No Records Found Text









