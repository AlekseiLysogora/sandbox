package hw4.baseclass;

import hw4.ex1.steps.ActionStep;
import hw4.ex1.steps.AssertionStep;
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
    public BaseClass commonSteps;
    public ActionStep actionStep;
    public AssertionStep assertionStep;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup(ITestContext testContext) {
        driver =  new DriverManager().setupDriver();
        wait = new WebDriverWait(driver, 5);
        softAssertion = new SoftAssert();
        commonSteps = new BaseClass(driver, softAssertion, wait);
        actionStep = new ActionStep(driver, softAssertion, wait);
        assertionStep = new AssertionStep(driver, softAssertion, wait);
        testContext.setAttribute("driver", driver);
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}