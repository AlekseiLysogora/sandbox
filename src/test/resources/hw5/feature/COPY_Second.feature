Feature: Selenium

  Background:
    Given I open JDI GitHub site
    Then 'Home Page' page should be opened
    When I login as user 'Roman Iovlev' with password 'Jdi1234'
    Then User name should be displayed and equals to expected result

  Scenario: User Table Page test
    And I click on "User Table" button in Service dropdown
    Then "User Table" page should be opened
    And '6' Number Type Dropdowns should be displayed on Users Table on User Table Page
    And '6' Usernames should be displayed on Users Table on User Table Page
    And '6' Description texts under images should be displayed on Users Table on User Table Page
    And '6' checkboxes should be displayed on Users Table on User Table Page
    And User table should contain following values:
      | Number | User             | Description                      |
      | 1      | Roman            | Wolverine                        |
      | 2      | Sergey Ivan      | Spider Man                       |
      | 3      | Vladzimir        | Punisher                         |
      | 4      | Helen Bennett    | Captain America some description |
      | 5      | Yoshi Tannamuri  | Cyclope some description         |
      | 6      | Giovanni Rovelli | Hulksome description             |
    And droplist should contain values in column Type for user Roman
      | Dropdown Values |
      | Admin           |
      | User            |
      | Manager         |