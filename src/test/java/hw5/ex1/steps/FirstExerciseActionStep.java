package hw5.ex1.steps;

import hw5.ex1.pages.DifferentElementsPage;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class FirstExerciseActionStep {

    DifferentElementsPage differentElementsPage;

    public FirstExerciseActionStep(WebDriver driver) {
        differentElementsPage = new DifferentElementsPage(driver);
    }

    @Step("STEP #5: Click on 'Service' button in Header")
    public void clickBtnHeader(String buttonName) {
        differentElementsPage.clickBtnHeader(buttonName);
    }

    @Step("STEP #5: Click on 'Different Elements Page' button in Service dropdown")
    public void openDifferentElementsPage(String dropdownName) {
        differentElementsPage.openDifferentElementsPage(dropdownName);
    }

    @Step("STEP #6: Select checkboxes")
    public void selectCheckboxes(String checkBoxWater, String checkBoxWind) {
        differentElementsPage.selectCheckboxes(checkBoxWater, checkBoxWind);
    }

    @Step("STEP #7: Select radio")
    public void selectRadio(String radioBtnName) {
        differentElementsPage.selectRadio();
    }

    @Step("STEP #8: Select in dropdown")
    public void selectInDropdown(String colorName) {
        differentElementsPage.selectInDropdown();
    }
}