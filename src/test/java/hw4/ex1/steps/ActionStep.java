package hw4.ex1.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import io.qameta.allure.Step;

public class ActionStep extends AbstractStep {

    public ActionStep(WebDriver driver, SoftAssert softAssertion, WebDriverWait wait) {
        super(driver, softAssertion, wait);
    }


}