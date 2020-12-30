package hw5.services.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DifferentElementsPage extends AbstractPage {

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

    @FindBy(xpath = "//li[contains(text(),'Water: condition changed to true')]")
    private WebElement assertCheckBoxWater;
    @FindBy(xpath = "//li[contains(text(),'Wind: condition changed to true')]")
    private WebElement assertCheckBoxWind;
    @FindBy(xpath = "//li[contains(text(),'Selen')]")
    private WebElement assertRadioBtn;
    @FindBy(xpath = "//li[contains(text(),'Color')]")
    private WebElement assertDropdown;

    @FindBy(xpath = "/html/body/div/div[2]/main/div[2]/div/div[2]")
    private List<WebElement> checkBoxSet;

    public DifferentElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        differentElements.click();
    }

    public void selectCheckboxes(String firstCheckBox, String secondCheckbox) {
//        Optional<WebElement> waterL = checkBoxSet
//                .stream()
//                .filter(t -> t.getText().equals(firstCheckBox))
//                .findFirst();
//        waterL.ifPresent(WebElement::click);

//        checkBoxSet.stream().map(WebElement::getText).collect(Collectors.toList()).get(0);

        water.click();
        wind.click();

    }

    public void selectRadioBtn(String firstRadioBtn) {
        selen.click();
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