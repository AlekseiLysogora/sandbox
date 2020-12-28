package hw5.baseclass.commonsteps;

import hw5.baseclass.BaseClass;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActionStep {

    BaseClass baseClass;

    public CommonActionStep(WebDriver driver, WebDriverWait wait) {
        baseClass = new BaseClass(driver, wait);
    }

    @Step("STEP #1: Open test site by URL")
    public void openTestSite() {
        baseClass.openPage();
    }

    @Step("STEP #3: Perform login")
    public void performLogin(String userName, String password) {
        baseClass.login(userName, password);
    }
}