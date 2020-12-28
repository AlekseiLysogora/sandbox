package hw5.baseclass.commonsteps;

import hw5.baseclass.unit.GetProperties;
import hw5.ex1.entity.User;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import static hw5.baseclass.unit.GetProperties.NameOfProperty.EXERCISE;
import static hw5.baseclass.unit.GetProperties.NameOfProperty.EXERCISE_DATA;

public class CommonAssertSteps {

    private WebDriver driver;
    private SoftAssert softAssertion;
    private GetProperties getExerciseProperties = new GetProperties(EXERCISE);
    private GetProperties getExerciseDataProperties = new GetProperties(EXERCISE_DATA);

    public CommonAssertSteps(WebDriver driver, SoftAssert softAssertion) {
        this.softAssertion = softAssertion;
        this.driver = driver;
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
        String expected = User.getName().toUpperCase().substring(0,5) + " IOVLEV"; //todo something is wrong here
        softAssertion.assertEquals(actual, expected,
                "Incorrect username");
    }

    public void checkAll() {
        softAssertion.assertAll();
    }
}