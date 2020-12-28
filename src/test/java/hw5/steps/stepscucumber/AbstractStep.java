package hw5.steps.stepscucumber;

import hw5.commonlogic.steps.CommonActionStep;
import hw5.commonlogic.steps.CommonAssertSteps;
import hw5.commonlogic.driver.WebDriverSingleton;
import hw5.steps.steps.actionStep;
import hw5.steps.steps.assertionStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public abstract class AbstractStep {

    protected WebDriverWait wait;
    protected SoftAssert softAssertion;

    protected CommonActionStep commonActionStep;
    protected CommonAssertSteps commonAssertSteps;

    protected assertionStep assertionStep;
    protected actionStep actionStep;


    protected AbstractStep() {
        WebDriver driver = WebDriverSingleton.getDriver();
        wait = new WebDriverWait(driver, 5);
        softAssertion = new SoftAssert();

        commonActionStep = new CommonActionStep(driver, wait);
        commonAssertSteps = new CommonAssertSteps(driver, softAssertion);

        actionStep = new actionStep(driver);
        assertionStep = new assertionStep(driver, softAssertion);
    }
}
