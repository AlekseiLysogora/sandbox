package hw4.ex1.runtest;

import hw4.baseclass.AllureListener;
import hw4.baseclass.CoreTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class FirstExerciseRunTest extends CoreTest {

    @Test(
            description = "First exercise test, Homework-4."
    )
    public void exercise_1_Test() {
        //STEP #1: Open test site by URL
        actionStep.openTestSite();

        //STEP #2: Assert Browser title
        assertionStep.assertBrowserTitle();

        //STEP #3: Perform login
        actionStep.performLogin();

        //STEP #4: Assert Username is logged
        assertionStep.assertUserName();

        //STEP #5: Assert that there are 4 items on the header section
        //         are displayed and they have proper texts
        assertionStep.assertHeaderItemsOnHomePage();

        //STEP #6: Assert that there are 4 images on the Index Page and they are displayed
        assertionStep.assertImagesOnHomePage();

        //STEP #7: Assert that there are 4 texts on the Index Page
        //         under icons and they have proper text
        assertionStep.assertTextOnHomePage();

        //STEP #8: Assert that there is the iframe with “Frame Button” exist
        assertionStep.iframeWithButtonExists();

        //STEP #9: Switch to the iframe and check that there is “Frame Button” in the iframe
        assertionStep.frameButtonExists();

        //STEP #10: Switch to original window back
        actionStep.switchHomePage();
        //homePage.switchHomePage();

        //STEP #11: Assert that there are 5 items in the Left Section
        //          are displayed and they have proper text
        actionStep.assertLeftSectionItems();
        //homePage.assertLeftSectionItems();

        commonSteps.assertAll();
    }
}