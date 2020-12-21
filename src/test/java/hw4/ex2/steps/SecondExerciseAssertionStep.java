package hw4.ex2.steps;

import hw4.ex2.pages.DifferentElementsPage;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

public class SecondExerciseAssertionStep {

    DifferentElementsPage differentElementsPage;

    public SecondExerciseAssertionStep(WebDriver driver, SoftAssert softAssertion) {
        differentElementsPage = new DifferentElementsPage(driver, softAssertion);
    }

    //STEP #9:
    //Assert that:
    //-for each checkbox there is an individual log row and value
    //  is corresponded to the status of checkbox
    //-for radio button there is a log row and value is corresponded to the status of radio button
    //-for dropdown there is a log row and value is corresponded to the selected value.
    //DATA: -
    //EXPECTED RESULT:
    //Log rows are displayed and
    //-checkbox name and its status are corresponding to selected
    //-radio button name and it status is corresponding to selected
    //-dropdown name and selected value is corresponding to selected
    @Step("STEP #9:\n"
            + "Assert that:\n"
            + "-for each checkbox there is an individual log row and value\n"
            + "  is corresponded to the status of checkbox\n"
            + "-for radio button there is a log row and value is"
            + "  corresponded to the status of radio button\n"
            + "-for dropdown there is a log row and value is corresponded to the selected value.")
    public void assertActions() {
        differentElementsPage.assertActions();
    }
}