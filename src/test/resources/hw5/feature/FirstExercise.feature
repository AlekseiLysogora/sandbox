Feature: Selenium

  Background:
    Given I open JDI GitHub site
    Then Check that I'm on certain site
    When I login as user 'Roman Iovlev' with password 'Jdi1234'
    Then Check that I'm logged as user
    When I click on 'Service' button in Header

  Scenario: Exercise 1
    When  I click on 'Different Elements Page' button in Service dropdown
    When I select 'Water' and 'Wind' checkboxes
    When I select 'Selen' radiobutton
    When I select 'Yellow' in dropdown
    Then Each element should be corresponds to itself with positive status on Different Elements Page

#  Scenario Outline: Exercise 2
#    When I click on "User Table" button in Service dropdown
#    Then "User Table" page should be opened
#    And 6 Number Type Dropdowns should be displayed on Users Table on User Table Page
#    And 6 Usernames should be displayed on Users Table on User Table Page
#    And 6 Description texts under images should be displayed on Users Table on User Table Page
#    And 6 checkboxes should be displayed on Users Table on User Table Page
#    And User table should contain following values:
#
#    Examples:
#      | Number | User             | Description                      |
#      | 1      | Roman            | Wolverine                        |
#      | 2      | Sergey Ivan      | Spider Man                       |
#      | 3      | Vladzimir        | Punisher                         |
#      | 4      | Helen Bennett    | Captain America some description |
#      | 5      | Yoshi Tannamuri  | Cyclope some description         |
#      | 6      | Giovanni Rovelli | Hulksome description             |
#
#    And Droplist should contain values in column Type for user Roman
#      | Dropdown Values |
#      | Admin           |
#      | User            |
#      | Manager         |

  Scenario: Exercise 3
    And I click on 'User Table' in Service dropdown
    When I select 'vip' checkbox for 'Sergey Ivan'
    Then 1 log row has 'Vip: condition changed to true' text in log section