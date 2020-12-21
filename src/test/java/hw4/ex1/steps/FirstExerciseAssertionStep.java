package hw4.ex1.steps;

import hw4.ex1.pages.FramePage;
import hw4.ex1.pages.HomePage;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

public class FirstExerciseAssertionStep {

    HomePage homePage;
    FramePage framePage;

    public FirstExerciseAssertionStep(WebDriver driver, SoftAssert softAssertion) {
        homePage = new HomePage(driver, softAssertion);
        framePage = new FramePage(driver, softAssertion);
    }

    //STEP #5: Assert that there are 4 items on the header
    //section are displayed and they have proper texts
    //DATA: "HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS"
    //EXPECTED RESULT: Menu buttons are displayed and have proper texts
    @Step("STEP #5: Assert that there are 4 items on the header")
    public void assertHeaderItemsOnHomePage() {
        homePage.assertHeaderItems();
    }

    //STEP #6: Assert that there are 4 images on the Index Page and they are displayed
    //DATA: 4 images
    //EXPECTED RESULT: Images are displayed
    @Step("STEP #6: Assert that there are 4 images on the Index Page and they are displayed")
    public void assertImagesOnHomePage() {
        homePage.assertImages();
    }

    //STEP #7: Assert that there are 4 texts on the Index Page under icons and they have proper text
    //DATA: 4 texts below of each image
    //EXPECTED RESULT: Texts are displayed and equal to expected
    @Step("STEP #7: Assert that there are 4 texts on the Index"
            + "Page under icons and they have proper text")
    public void assertTextOnHomePage() {
        homePage.assertText();
    }

    //STEP #8: Assert that there is the iframe with “Frame Button” exist
    //DATA: -
    //EXPECTED RESULT: The iframe exists
    @Step("STEP #8: Assert that there is the iframe with “Frame Button” exist")
    public void iframeWithButtonExists() {
        homePage.iframeWithButtonExists();
    }

    //STEP #9: Switch to the iframe and check that there is “Frame Button” in the iframe
    //DATA: -
    //EXPECTED RESULT: The “Frame Button” exists
    @Step("STEP #9: Switch to the iframe and check that there is “Frame Button” in the iframe")
    public void frameButtonExists() {
        framePage.frameButtonExists();
    }
}