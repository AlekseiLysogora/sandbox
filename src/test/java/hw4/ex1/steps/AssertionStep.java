package hw4.ex1.steps;

import hw4.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AssertionStep extends AbstractStep {


    public AssertionStep(WebDriver driver, SoftAssert softAssertion, WebDriverWait wait) {
        super(driver, softAssertion, wait);
    }

    //STEP #2: Assert Browser title
    //DATA: "Home Page"
    //EXPECTED RESULT: Browser title equals "Home Page"
    @Step("STEP #2: Assert Browser title")
    public void assertBrowserTitle() {
        baseClass.checkTitle();
    }

    //STEP #4: Assert Username is logged
    //DATA: "ROMAN IOVLEV"
    //EXPECTED RESULT: Name is displayed and equals to expected result
    @Step("STEP #4: Assert Username is logged")
    public void assertUserName() {
        baseClass.assertUserName();
    }
}
