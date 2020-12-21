package hw4.baseclass;

import hw4.baseclass.commonsteps.CommonActionStep;
import hw4.baseclass.commonsteps.CommonAssertSteps;
import hw4.ex1.steps.FirstExerciseActionStep;
import hw4.ex1.steps.FirstExerciseAssertionStep;
import hw4.ex2.steps.SecondExerciseActionStep;
import hw4.ex2.steps.SecondExerciseAssertionStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public abstract class CoreTest {

    public WebDriver driver;
    public SoftAssert softAssertion;
    public WebDriverWait wait;
    public BaseClass baseClass;

    public CommonActionStep commonActionStep;
    public CommonAssertSteps commonAssertSteps;

    public FirstExerciseActionStep firstExeFirstExerciseActionStep;
    public FirstExerciseAssertionStep firstExeFirstExerciseAssertionStep;

    public SecondExerciseActionStep secondExeActionStep;
    public SecondExerciseAssertionStep secondExeAssertionStep;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(ITestContext testContext) {
        driver =  new DriverManager().setupDriver();
        wait = new WebDriverWait(driver, 5);
        softAssertion = new SoftAssert();

        baseClass = new BaseClass(driver, softAssertion, wait);

        commonActionStep = new CommonActionStep(driver, softAssertion, wait);
        commonAssertSteps = new CommonAssertSteps(driver, softAssertion, wait);

        firstExeFirstExerciseActionStep = new FirstExerciseActionStep(driver, softAssertion);
        firstExeFirstExerciseAssertionStep = new FirstExerciseAssertionStep(driver, softAssertion);

        secondExeActionStep = new SecondExerciseActionStep(driver, softAssertion);
        secondExeAssertionStep = new SecondExerciseAssertionStep(driver, softAssertion);

        testContext.setAttribute("driver", driver);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}