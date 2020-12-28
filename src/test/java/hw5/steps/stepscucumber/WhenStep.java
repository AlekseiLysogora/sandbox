package hw5.steps.stepscucumber;

import io.cucumber.java.en.When;

public class WhenStep extends AbstractStep {

    @When("I login as user {string} with password {string}")
    public void i_login_as_user(String userName, String password) {
        commonActionStep.performLogin(userName, password);
    }

    @When("I click on {string} button in Header")
    public void i_click_on_button_in_header(String buttonName) {
        actionStep.clickBtnHeader(buttonName);
    }

    @When("I click on {string} button in Service dropdown")
    public void i_click_on_button_in_service_dropdown(String dropdownName) {
        actionStep.openDifferentElementsPage(dropdownName);
    }

    @When("I select {string} and {string} checkboxes")
    public void i_select_and_checkboxes(String checkBoxWater, String checkBoxWind) {
        actionStep.selectCheckboxes(checkBoxWater, checkBoxWind);
    }

    @When("I select {string} radiobutton")
    public void i_select_radiobutton(String radioBtnName) {
        actionStep.selectRadio(radioBtnName);
    }

    @When("I select {string} in dropdown")
    public void i_select_in_dropdown(String colorName) {
        actionStep.selectInDropdown(colorName);
    }

    @When("I click on {string} in Service dropdown")
    public void i_click_on_in_service_dropdown(String userTable) {
        actionStep.clickService(userTable);
    }

    @When("I select {string} checkbox for {string}")
    public void i_select_checkbox_for(String typeOfCheckbox, String user) {
        actionStep.selectCheckbox(typeOfCheckbox, user);
    }

}