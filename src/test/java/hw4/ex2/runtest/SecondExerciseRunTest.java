package hw4.ex2.runtest;

import hw4.baseclass.AllureListener;
import hw4.baseclass.CoreTest;
import hw4.ex1.steps.ActionStep;
import hw4.ex2.pages.DifferentElementsPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class SecondExerciseRunTest extends CoreTest {

    private DifferentElementsPage differentElementsPage;
    private ActionStep actionStep;

    @Test(
            description = "Second exercise test, Homework-4. Jira binding cab be here"
    )
    public void exercise_2_Test() {
        differentElementsPage = new DifferentElementsPage(driver, softAssertion);

        //перенсти в Before
        actionStep = new ActionStep(driver, softAssertion, new WebDriverWait(driver, 5));

        //STEP #1: Open test site by URL
        actionStep.openTestSite();
        //commonSteps.openPage();

        //STEP #2: Assert Browser title
        commonSteps.checkTitle();

        //STEP #3: Perform login
        commonSteps.login();

        //STEP #4: Assert Username is logged
        commonSteps.assertUserName();

        //STEP #5: Open through the header menu Service -> Different Elements Page
        differentElementsPage.openPage();
        differentElementsPage.checkTitle();

        //STEP #6: Select checkboxes
        differentElementsPage.selectCheckboxes();

        //STEP #7: Select radio
        differentElementsPage.selectRadio();

        //STEP #8: Select in dropdown
        differentElementsPage.selectInDropdown();

        //STEP #9: Assert that each element corresponds to itself with positive status
        differentElementsPage.assertActions();

        commonSteps.assertAll();
    }
}