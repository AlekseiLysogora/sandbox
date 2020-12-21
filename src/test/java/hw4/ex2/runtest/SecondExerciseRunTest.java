package hw4.ex2.runtest;

import hw4.baseclass.AllureListener;
import hw4.baseclass.CoreTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class SecondExerciseRunTest extends CoreTest {

    @Test(
            description = "Second exercise, Homework-4."
    )
    public void exercise_2_Test() {

        //STEP #1: Open test site by URL
        commonActionStep.openTestSite();

        //STEP #2: Assert Browser title
        commonAssertSteps.assertBrowserTitle();

        //STEP #3: Perform login
        commonActionStep.performLogin();

        //STEP #4: Assert Username is logged
        commonAssertSteps.assertUserName();

        //STEP #5: Open through the header menu Service -> Different Elements Page
        secondExeActionStep.openPage();

        //STEP #6: Select checkboxes
        secondExeActionStep.selectCheckboxes();

        //STEP #7: Select radio
        secondExeActionStep.selectRadio();

        //STEP #8: Select in dropdown
        secondExeActionStep.selectInDropdown();

        //STEP #9: Assert that each element corresponds to itself with positive status
        secondExeAssertionStep.assertActions();

        commonAssertSteps.assertAll();
    }
}