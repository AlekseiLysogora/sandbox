package hw5.ex1.pages;

import hw5.baseclass.unit.GetProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Optional;

import static hw5.baseclass.unit.GetProperties.NameOfProperty.EXERCISE_DATA;

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
        PageFactory.initElements(driver, this);
    }

    public void clickBtnHeader(String buttonName) {

        Optional<WebElement> category = this.category
                .stream()
                .filter(categoryItem -> categoryItem.getText().equalsIgnoreCase(buttonName))
                .findFirst();

        category.ifPresent(WebElement::click);

    }
    protected WebDriverWait wait = new WebDriverWait(driver, 5);
    public void openDifferentElementsPage(String dropdownName) {
        //click Different Elements
        differentElements.click();
    }

    //STEP #6: Select checkboxes
    //DATA: Water, Wind
    //EXPECTED RESULT: Elements are checked
    public void selectCheckboxes(String checkBoxWater, String checkBoxWind) {
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