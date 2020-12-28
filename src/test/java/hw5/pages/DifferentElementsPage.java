package hw5.pages;

import hw5.commonlogic.utility.GetProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Optional;

import static hw5.commonlogic.utility.GetProperties.NameOfProperty.EXERCISE_DATA;

public class DifferentElementsPage extends AbstractPage {
    @FindBy(xpath = "//li[3]/a[1]")
    protected WebElement serviceHeaderElement;
    @FindBy(css = ".dropdown-menu > li:nth-child(8) > a")
    protected WebElement differentElements;

    @FindBy(xpath = "//input[@type='checkbox']")
    protected WebElement water;
    @FindBy(xpath = "//label[3]/input")
    protected WebElement wind;

    @FindBy(xpath = "//div[3]/label[4]/input")
    protected WebElement selen;

    @FindBy(xpath = "//select")
    protected WebElement dropdown;

    @FindBy(xpath = "/html/body/header/div/nav/ul[1]/li[3]/a")
    private List<WebElement> category;

    @FindBy(xpath = "/html/body/div/div[2]/main/div[2]/div/div[2]")
    private List<WebElement> checkBoxes;

    @FindBy(xpath = "//li[contains(text(),'Water: condition changed to true')]")
    private WebElement assertCheckBoxWater;
    @FindBy(xpath = "//li[contains(text(),'Wind: condition changed to true')]")
    private WebElement assertCheckBoxWind;
    @FindBy(xpath = "//li[contains(text(),'Selen')]")
    private WebElement assertRadioBtn;
    @FindBy(xpath = "//li[contains(text(),'Color')]")
    private WebElement assertDropdown;

    private GetProperties getExerciseDataProperties = new GetProperties(EXERCISE_DATA);

    public DifferentElementsPage(WebDriver driver) {
        super(driver);
    }

    public void clickBtnHeader(String buttonName) {

        Optional<WebElement> category = this.category
                .stream()
                .filter(categoryItem -> categoryItem.getText().equalsIgnoreCase(buttonName))
                .findFirst();

        category.ifPresent(WebElement::click);

    }

    public void openDifferentElementsPage(String dropdownName) {
        //click Different Elements
        differentElements.click();
    }

    //STEP #6: Select checkboxes
    //DATA: Water, Wind
    //EXPECTED RESULT: Elements are checked
    public void selectCheckboxes(String checkBoxWater, String checkBoxWind) {
        //System.out.println(checkBoxes.get(0).getText());

        //select checkbox with parameter Water
        water.click();

        //select checkbox with parameter Wind
        wind.click();
    }

    //STEP #7: Select radio
    //DATA: Selen
    //EXPECTED RESULT: Element is checked
    public void selectRadio() {
        selen.click();
    }

    //STEP #8: Select in dropdown
    //DATA: Yellow
    //EXPECTED RESULT: Element is selected
    public void selectInDropdown() {
        dropdown.click();
        Select color = new Select(dropdown);
        String selectColor = getExerciseDataProperties
                .getResource("selectInDropdown");
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