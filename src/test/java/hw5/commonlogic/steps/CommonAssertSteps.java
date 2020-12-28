package hw5.commonlogic.steps;

import hw5.commonlogic.utility.GetProperties;
import hw5.entity.User;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import static hw5.commonlogic.utility.GetProperties.NameOfProperty.EXERCISE;
import static hw5.commonlogic.utility.GetProperties.NameOfProperty.EXERCISE_DATA;

public class CommonAssertSteps {

    private WebDriver driver;
    private SoftAssert softAssertion;
    private GetProperties getExerciseProperties;
    private GetProperties getExerciseDataProperties;

    public CommonAssertSteps(WebDriver driver, SoftAssert softAssertion) {
        this.softAssertion = softAssertion;
        this.driver = driver;

        getExerciseProperties = new GetProperties(EXERCISE);
        getExerciseDataProperties = new GetProperties(EXERCISE_DATA);
    }

    @Step("STEP #2: Assert Browser title")
    public void assertBrowserTitle() {
        String expected = getExerciseDataProperties.getResource("titleName");
        softAssertion.assertEquals(driver.getTitle(), expected,
                "Incorrect page title");
    }

    @Step("STEP #4: Assert Username is logged")
    public void assertUserName() {
        String assertUserName = getExerciseProperties.getResource("assertUserName");
        WebElement userName = driver.findElement(By.cssSelector(assertUserName));
        String actual = userName.getText();
        String expected = User.getName().toUpperCase();
        softAssertion.assertEquals(actual, expected,
                "Incorrect username");
    }

    public void checkAll() {
        softAssertion.assertAll();
    }
}