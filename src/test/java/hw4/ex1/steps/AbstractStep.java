package hw4.ex1.steps;

import hw4.baseclass.BaseClass;
import hw4.ex1.pages.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AbstractStep {

    BaseClass baseClass;
    HomePage homePage;

    protected AbstractStep(WebDriver driver) {
    }

    protected AbstractStep(WebDriver driver, SoftAssert softAssertion, WebDriverWait wait) {
        homePage = new HomePage(driver, softAssertion);
        baseClass = new BaseClass(driver, softAssertion, wait);
    }

    @Step("Открыть домашнюю страницу")
    public void openIndexPage() {
        baseClass.openPage();
    }
}
