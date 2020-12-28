Feature: Selenium

  Background:
    #STEP #1: Open test site by URL
    Given I open JDI GitHub site

    #STEP #2: Assert Browser title
    Then Check that I'm on certain site

    #STEP #3: Perform login
    When I login as user 'Roman' with password 'Jdi1234'

    #STEP #4: Assert Username is logged
    Then Check that I'm logged as user



  Scenario: Exercise 1
    #STEP #5: Open through the header menu Service -> Different Elements Page
    When I click on 'Service' button in Header
    And  I click on 'Different Elements Page' button in Service dropdown

    #STEP #6: Select checkboxes
    When I select 'Water' and 'Wind' checkboxes

    #STEP #7: Select radio
    When I select 'Selen' radiobutton

    #STEP #8: Select in dropdown
    When I select 'Yellow' in dropdown

    #STEP #9: Assert that each element corresponds to itself with positive status
    Then Each element should be corresponds to itself with positive status on Different Elements Page