//package hw5.ex1.runtest;
//
//import hw5.baseclass.CoreTest;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Story;
//import org.testng.annotations.Test;
//
//@Feature("Selenium")
//@Story("Homework #5")
//public class FirstExerciseRunTestNGTest extends CoreTest {
//
//    @Test(
//            description = "First exercise test, Jira binding cab be here"
//    )
//    public void exercise_2_Test() {
//        //STEP #1: Open test site by URL
//        commonActionStep.openTestSite();
//
//        //STEP #2: Assert Browser title
//        commonAssertSteps.assertBrowserTitle();
//
//        //STEP #3: Perform login
//        commonActionStep.performLogin();
//
//        //STEP #4: Assert Username is logged
//        commonAssertSteps.assertUserName();
//
//        //STEP #5: Open through the header menu Service -> Different Elements Page
//        firstExerciseActionStep.openPage();
//        firstExerciseAssertionStep.assertTitle();
//
//        //STEP #6: Select checkboxes
//        firstExerciseActionStep.selectCheckboxes();
//
//        //STEP #7: Select radio
//        firstExerciseActionStep.selectRadio();
//
//        //STEP #8: Select in dropdown
//        firstExerciseActionStep.selectInDropdown();
//
//        //STEP #9: Assert that each element corresponds to itself with positive status
//        firstExerciseAssertionStep.assertActions();
//
//        commonAssertSteps.checkAll();
//    }
//}