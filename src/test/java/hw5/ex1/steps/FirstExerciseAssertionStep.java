package hw5.ex1.steps;

import hw5.baseclass.unit.GetProperties;
import hw5.ex1.pages.DifferentElementsPage;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;
import static hw5.baseclass.unit.GetProperties.NameOfProperty.EXERCISE_DATA;

public class FirstExerciseAssertionStep {

    private DifferentElementsPage differentElementsPage;
    private WebDriver driver;
    private SoftAssert softAssertion;
    private GetProperties getExerciseDataProperties = new GetProperties(EXERCISE_DATA);

    public FirstExerciseAssertionStep(WebDriver driver, SoftAssert softAssertion) {
        differentElementsPage = new DifferentElementsPage(driver);
        this.softAssertion = softAssertion;
        this.driver = driver;
    }

    public void assertCheckboxesActions() {
        //for each checkbox there is an individual log row and value
        // is corresponded to the status of checkbox
        //for Water
        String actualWater = differentElementsPage.getAssertCheckBoxWater().getText();
        softAssertion.assertTrue(actualWater.contains("Water") && actualWater.endsWith("true"),
                "Log row and (or) value isn't corresponded to the status of Water's checkbox");

        //for Wind
        String actualWind = differentElementsPage.getAssertCheckBoxWind().getText();
        softAssertion.assertTrue(actualWind.contains("Wind") && actualWind.endsWith("true"),
                "Log row and (or) value isn't corresponded to the status of Wind's checkbox");
    }

    public void assertRadiobuttonActions() {
        //for radio button there is a log row and value
        //is corresponded to the status of radio button
        String actualRadioBtn = differentElementsPage.getAssertRadioBtn().getText();
        softAssertion.assertTrue(
                actualRadioBtn.contains("metal") && actualRadioBtn.endsWith("Selen"),
                "Log row and (or) value isn't corresponded to the status of Selen's radio button"
        );
    }

    public void assertDropdownActions() {
        //for dropdown there is a log row and value is corresponded to the selected value
        String actualDropdown = differentElementsPage.getAssertDropdown().getText();
        softAssertion.assertTrue(
                actualDropdown.contains("Colors") && actualDropdown.endsWith("Yellow"),
                "Log row and (or) value isn't corresponded to the status of selected value"
        );
    }
}