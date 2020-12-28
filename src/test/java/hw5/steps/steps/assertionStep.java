package hw5.steps.steps;

import hw5.commonlogic.utility.GetProperties;
import hw5.pages.DifferentElementsPage;
import hw5.pages.UserTablePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import static hw5.commonlogic.utility.GetProperties.NameOfProperty.EXERCISE_DATA;

public class assertionStep {

    private DifferentElementsPage differentElementsPage;
    private UserTablePage userTablePage;

    private WebDriver driver;
    private SoftAssert softAssertion;
    private GetProperties getExerciseDataProperties = new GetProperties(EXERCISE_DATA);

    public assertionStep(WebDriver driver, SoftAssert softAssertion) {
        differentElementsPage = new DifferentElementsPage(driver);
        userTablePage = new UserTablePage(driver);

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

    @Step("STEP #7:Log row has should contain certain text")
    public void assertFirstRow(Integer rowNumber, String expectedText) {
        String actual = userTablePage.getUserTableRow().getText();
        softAssertion.assertTrue(
                actual.contains(rowNumber.toString()) && actual.endsWith(expectedText),
                "Log row and (or) value isn't corresponded to the status of Checkbox Sergey"
        );
    }
}