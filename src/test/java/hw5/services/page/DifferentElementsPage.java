package hw5.services.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DifferentElementsPage extends AbstractPage {

    @FindBy(css = ".dropdown-menu > li:nth-child(8) > a")
    protected WebElement differentElements;

    @FindBy(xpath = "//div[3]/label[4]/input")
    protected WebElement selen;

    @FindBy(xpath = "//select")
    protected WebElement dropdown;

    @FindBy(xpath = "//li[contains(text(),'Water: condition changed to true')]")
    private WebElement assertCheckBoxWater;
    @FindBy(xpath = "//li[contains(text(),'Wind: condition changed to true')]")
    private WebElement assertCheckBoxWind;
    @FindBy(xpath = "//li[contains(text(),'Selen')]")
    private WebElement assertRadioBtn;
    @FindBy(xpath = "//li[contains(text(),'Color')]")
    private WebElement assertDropdown;

    @FindBy(className = "label-checkbox")
    private List<WebElement> checkBoxList;

    @FindBy(className = "label-radio")
    private List<WebElement> radioBtnList;

    public DifferentElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        differentElements.click();
    }

    public void selectCheckboxes(String firstCheckBox, String secondCheckbox) {
        if (checkBoxList.get(0).getText().equals(firstCheckBox) &&
        checkBoxList.get(2).getText().equals(secondCheckbox)) {
            checkBoxList.get(0).click();
            checkBoxList.get(2).click();
        } else
            System.out.println("You selected the incorrect checkboxes");
    }

    public void selectRadioBtn(String radioBtn) {
        if (radioBtnList.get(3).getText().equals(radioBtn)) {
            radioBtnList.get(3).click();
        } else
            System.out.println("You selected the incorrect radio button");
    }

    public void selectInDropdown(String colorType) {
        dropdown.click();
        Select color = new Select(dropdown);
        String selectColor = colorType;
        color.selectByVisibleText(selectColor);
    }

    public WebElement getAssertCheckBoxWater() {
        return assertCheckBoxWater;
    }

    public WebElement getAssertCheckBoxWind() {
        return assertCheckBoxWind;
    }

    public WebElement getAssertRadioBtn() {
        return assertRadioBtn;
    }

    public WebElement getAssertDropdown() {
        return assertDropdown;
    }
}