package hw4.baseclass.commonsteps;

import hw4.baseclass.BaseClass;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonAssertSteps {

    BaseClass baseClass;

    public CommonAssertSteps(WebDriver driver, SoftAssert softAssertion, WebDriverWait wait) {
        baseClass = new BaseClass(driver, softAssertion, wait);
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

    public void assertAll() {
        baseClass.assertAll();
    }
}