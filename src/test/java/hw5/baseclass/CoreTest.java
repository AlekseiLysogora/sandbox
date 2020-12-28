package hw5.baseclass;

import hw5.baseclass.commonsteps.CommonActionStep;
import hw5.baseclass.commonsteps.CommonAssertSteps;
import hw5.baseclass.drivermanager.DriverManager;
import hw5.baseclass.unit.AllureListener;
import hw5.ex1.steps.FirstExerciseActionStep;
import hw5.ex1.steps.FirstExerciseAssertionStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

@Listeners({AllureListener.class})
public abstract class CoreTest {

    protected WebDriver driver;
    protected SoftAssert softAssertion;
    protected WebDriverWait wait;
    protected BaseClass commonSteps;

    protected FirstExerciseAssertionStep firstExerciseAssertionStep;
    protected FirstExerciseActionStep firstExerciseActionStep;

    protected CommonActionStep commonActionStep;
    protected CommonAssertSteps commonAssertSteps;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(ITestContext testContext) {
        driver =  DriverManager.setupDriver();
        wait = new WebDriverWait(driver, 5);
        softAssertion = new SoftAssert();
        commonSteps = new BaseClass(driver, wait);

        commonActionStep = new CommonActionStep(driver, wait);
        commonAssertSteps = new CommonAssertSteps(driver, softAssertion);

        firstExerciseActionStep = new FirstExerciseActionStep(driver);
        firstExerciseAssertionStep = new FirstExerciseAssertionStep(driver, softAssertion);
        testContext.setAttribute("driver", driver);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}