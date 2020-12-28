package hw5.ex1.cucumbersteps;

import io.cucumber.java.en.When;

public class WhenStep extends AbstractStep {

    @When("I login as user {string} with password {string}")
    public void i_login_as_user(String userName, String password) {
        commonActionStep.performLogin(userName, password);
    }

    @When("I click on {string} button in Header")
    public void i_click_on_button_in_header(String buttonName) {
        firstExerciseActionStep.clickBtnHeader(buttonName);
    }

    @When("I click on {string} button in Service dropdown")
    public void i_click_on_button_in_service_dropdown(String dropdownName) {
        firstExerciseActionStep.openDifferentElementsPage(dropdownName);
    }

    @When("I select {string} and {string} checkboxes")
    public void i_select_and_checkboxes(String checkBoxWater, String checkBoxWind) {
        firstExerciseActionStep.selectCheckboxes(checkBoxWater, checkBoxWind);
    }

    @When("I select {string} radiobutton")
    public void i_select_radiobutton(String radioBtnName) {
        firstExerciseActionStep.selectRadio(radioBtnName);
    }

    @When("I select {string} in dropdown")
    public void i_select_in_dropdown(String colorName) {
        firstExerciseActionStep.selectInDropdown(colorName);
    }

}