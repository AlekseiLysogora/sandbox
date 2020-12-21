package hw4.ex1.steps;

import hw4.ex1.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import io.qameta.allure.Step;

public class FirstExerciseActionStep {

    HomePage homePage;

    public FirstExerciseActionStep(WebDriver driver, SoftAssert softAssertion) {
        homePage = new HomePage(driver, softAssertion);
    }

    //STEP #10: Switch to original window back
    //DATA: -
    //EXPECTED RESULT: Driver has focus on the original window
    @Step("STEP #10: Switch to original window back")
    public void switchHomePage() {
        homePage.switchHomePage();
    }

    //STEP #11: Assert that there are 5 items in the Left Section
    //          are displayed and they have proper text
    //DATA:  “Home”, “Contact form”, “Service”, “Metals & Colors”, “Elements packs”
    //EXPECTED RESULT: Left section menu items are displayed and have proper text
    @Step("STEP #11: Assert that there are 5 items in the Left Section")
    public void assertLeftSectionItems() {
        homePage.assertLeftSectionItems();
    }
}