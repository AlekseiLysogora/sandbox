package hw5.steps;

import hw5.services.entity.User;
import io.cucumber.java.en.Then;

public class ThenGherkin extends AbstractGherkin {

    //Background:

    @Then("User name should be displayed and equals to expected result")
    public void assertUsername() {
        softAssert.assertEquals(
                homePage.getUserName(),
                User.getName().toUpperCase(),
                "\nIncorrect username\n"
        );
    }

    //Scenario: Exercise 1

    @Then("{string} page should be opened")
    public void assertPageOpen(String expectedText) {
        softAssert.assertEquals(driver.getTitle(), expectedText,
                "\nIncorrect " + expectedText + " title\n"
        );
    }

    @Then("Each element should be corresponds to itself with positive status on Different Elements Page")
    public void assertElementsOnDifferentElementsPage() {
        softAssert.assertTrue(
                differentElementsPage.getAssertCheckBoxWater().getText().contains("Water") &&
                        differentElementsPage.getAssertCheckBoxWater().getText().endsWith("true"),
                "\nLog row and (or) value isn't corresponded to the status of Water's checkbox\n"
        );
        softAssert.assertTrue(
                differentElementsPage.getAssertCheckBoxWind().getText().contains("Wind") &&
                        differentElementsPage.getAssertCheckBoxWind().getText().endsWith("true"),
                "\nLog row and (or) value isn't corresponded to the status of Wind's checkbox\n"
        );
        softAssert.assertTrue(
                differentElementsPage.getAssertRadioBtn().getText().contains("metal") &&
                        differentElementsPage.getAssertRadioBtn().getText().endsWith("Selen"),
                "\nLog row and (or) value isn't corresponded to the status of Selen's radio button\n"
        );
        softAssert.assertTrue(
                differentElementsPage.getAssertDropdown().getText().contains("Colors") &&
                        differentElementsPage.getAssertDropdown().getText().endsWith("Yellow"),
                "\nLog row and (or) value isn't corresponded to the status of selected value\n"
        );

        softAssert.assertAll("\nFailed assertAll\n");

        driver.quit();
        driver = null;
    }

    //Scenario: Exercise 2

    @Then("6 {string} Type Dropdowns should be displayed on Users Table on User Table Page")
    public void assertDropdowns(String dropdowns) {
        softAssert.assertEquals(
                userTablePage.getNumber(), dropdowns,
                "\nIncorrect \'" + dropdowns + "\' number on User Table Page\n"
        );


    }

    @Then("6 {string}names should be displayed on Users Table on User Table Page")
    public void assertUsernames(String usernames) {
        softAssert.assertEquals(
                userTablePage.getUser(), usernames,
                "\nIncorrect \'" + usernames + "\' username on User Table Page\n"
        );
    }



    @Then("6 {string} texts under images should be displayed on Users Table on User Table Page")
    public void assertDescription(String description) {
        softAssert.assertEquals(
                userTablePage.getDescription(), description,
                "\nIncorrect \'" + description + "\' description on User Table Page\n"
        );

    }

    @Then("6 checkboxes should be displayed on Users Table on User Table Page")
    public void assertCheckboxes() {
        softAssert.assertAll("\nFailed assertAll\n");
    }

    @Then("{string} should contain values in column Type for user Roman")
    public void assertDroplist(String droplist) {
        softAssert.assertEquals(
                userTablePage.assertDroplist(droplist), droplist,
                "\nIncorrect \'" + droplist + "\' droplist on User Table Page\n"
        );
    }

    //Scenario: Exercise 3

    @Then("1 log row has {string} text in log section")
    public void assertVipCheckbox(String vip) {
        softAssert.assertTrue(userTablePage.getAssertRow().equals(vip),
                "\nLog row value isn't corresponded to the status of selected value\n" + vip
        );

        softAssert.assertAll("\nFailed assertAll\n");
    }
}
