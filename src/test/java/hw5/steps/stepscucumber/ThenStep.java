package hw5.steps.stepscucumber;

import io.cucumber.java.en.Then;

public class ThenStep extends AbstractStep {

    @Then("Check that I'm on certain site")
    public void check_that_i_m_on_certain_site() {
        commonAssertSteps.assertBrowserTitle();
    }

    @Then("Check that I'm logged as user")
    public void check_that_i_m_logged_as_user() {
        commonAssertSteps.assertUserName();
    }

    @Then("Each element should be corresponds to itself with positive status on Different Elements Page")
    public void each_element_should_be_corresponds_to_itself_with_positive_status_on_different_elements_page() {
        assertionStep.assertCheckboxesActions();
        assertionStep.assertRadiobuttonActions();
        assertionStep.assertDropdownActions();
        commonAssertSteps.checkAll();
    }

    @Then("{int} log row has {string} text in log section")
    public void log_row_has_text_in_log_section(Integer rowNumber, String expectedText) {
        assertionStep.assertFirstRow(rowNumber, expectedText);
    }

}