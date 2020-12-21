package hw4.ex1.runtest;

import hw4.baseclass.AllureListener;
import hw4.baseclass.CoreTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class FirstExerciseRunTest extends CoreTest {

    @Test(
            description = "First exercise, Homework-4."
    )
    public void exercise_1_Test() {

        //STEP #1: Open test site by URL
        commonActionStep.openTestSite();

        //STEP #2: Assert Browser title
        commonAssertSteps.assertBrowserTitle();

        //STEP #3: Perform login
        commonActionStep.performLogin();

        //STEP #4: Assert Username is logged
        commonAssertSteps.assertUserName();

        //STEP #5: Assert that there are 4 items on the header section
        //         are displayed and they have proper texts
        firstExeFirstExerciseAssertionStep.assertHeaderItemsOnHomePage();

        //STEP #6: Assert that there are 4 images on the Index Page and they are displayed
        firstExeFirstExerciseAssertionStep.assertImagesOnHomePage();

        //STEP #7: Assert that there are 4 texts on the Index Page
        //         under icons and they have proper text
        firstExeFirstExerciseAssertionStep.assertTextOnHomePage();

        //STEP #8: Assert that there is the iframe with “Frame Button” exist
        firstExeFirstExerciseAssertionStep.iframeWithButtonExists();

        //STEP #9: Switch to the iframe and check that there is “Frame Button” in the iframe
        firstExeFirstExerciseAssertionStep.frameButtonExists();

        //STEP #10: Switch to original window back
        firstExeFirstExerciseActionStep.switchHomePage();
        //homePage.switchHomePage();

        //STEP #11: Assert that there are 5 items in the Left Section
        //          are displayed and they have proper text
        firstExeFirstExerciseActionStep.assertLeftSectionItems();

        commonAssertSteps.assertAll();
    }
}