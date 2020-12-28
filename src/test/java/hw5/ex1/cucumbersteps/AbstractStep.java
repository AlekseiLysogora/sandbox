package hw5.ex1.cucumbersteps;

import hw5.baseclass.commonsteps.CommonActionStep;
import hw5.baseclass.commonsteps.CommonAssertSteps;
import hw5.baseclass.drivermanager.WebDriverSingleton;
import hw5.ex1.steps.FirstExerciseActionStep;
import hw5.ex1.steps.FirstExerciseAssertionStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public abstract class AbstractStep {

    protected WebDriverWait wait;
    protected SoftAssert softAssertion;

    protected CommonActionStep commonActionStep;
    protected CommonAssertSteps commonAssertSteps;

    protected FirstExerciseAssertionStep firstExerciseAssertionStep;
    protected FirstExerciseActionStep firstExerciseActionStep;


    protected AbstractStep() {
        WebDriver driver = WebDriverSingleton.getDriver();
        wait = new WebDriverWait(driver, 5);
        softAssertion = new SoftAssert();

        commonActionStep = new CommonActionStep(driver, wait);
        commonAssertSteps = new CommonAssertSteps(driver, softAssertion);

        firstExerciseActionStep = new FirstExerciseActionStep(driver);
        firstExerciseAssertionStep = new FirstExerciseAssertionStep(driver, softAssertion);
    }
}
