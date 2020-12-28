package hw5.steps.steps;

import hw5.pages.DifferentElementsPage;
import hw5.pages.UserTablePage;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class actionStep {

    protected DifferentElementsPage differentElementsPage;
    protected UserTablePage userTablePage;

    public actionStep(WebDriver driver) {
        differentElementsPage = new DifferentElementsPage(driver);
        userTablePage = new UserTablePage(driver);
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

    @Step("STEP #5: Click on 'User Table' in Service dropdown")
    public void clickService(String userTable) {
        userTablePage.openUserTable(userTable);
    }

    @Step("STEP #6: Select 'vip' checkbox for 'Sergey Ivan'")
    public void selectCheckbox(String typeOfCheckbox, String user) {
        userTablePage.selectCheckbox(typeOfCheckbox, user);
    }
}