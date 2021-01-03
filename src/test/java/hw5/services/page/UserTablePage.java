package hw5.services.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserTablePage extends AbstractPage {

    @FindBy(xpath = "//td[text()='1']")
    private WebElement numberOne;

    @FindBy(xpath = "//a[text()='Roman']")
    private WebElement roman;
    @FindBy(xpath = "//a[text()='Sergey Ivan']")
    private WebElement sergey;
    @FindBy(xpath = "//a[text()='Vladzimir']")
    private WebElement vladzimir;
    @FindBy(xpath = "//a[text()='Helen Bennett']")
    private WebElement helen;
    @FindBy(xpath = "//a[text()='Yoshi Tannamuri']")
    private WebElement yoshi;
    @FindBy(xpath = "//a[text()='Giovanni Rovelli']")
    private WebElement giovanni;

    @FindBy(xpath = "//span[text()='Wolverine']")
    private WebElement description;

    @FindBy(xpath = "//select")
    private List<WebElement> droplistElem;

    @FindBy(id = "ivan")
    private WebElement vipCheckbox;

    @FindBy(xpath = "//li[contains(text(), 'Vip: condition changed to true')]")
    private WebElement assertRow;

    @FindBy(css = "select")
    protected List<WebElement> dropdowns;

    public UserTablePage(WebDriver driver) {
        super(driver);
    }

    public String getNumber() {
        System.out.println(dropdowns
                .stream().map(WebElement::getText).collect(Collectors.toList()).size());
        return numberOne.getText();
    }

    public String getUser() {
        return roman.getText();
    }

    public String getDescription() {
        return description.getText();
    }

    public String assertDroplist(String droplist) {
        List<String> roles = droplistElem
                .stream().map(WebElement::getText).collect(Collectors.toList());

        return roles.get(0);
    }

    public List<String> assertUsernames() {
        List<WebElement> names = new ArrayList<>();
        names.add(roman);
        names.add(vladzimir);
        names.add(sergey);
        names.add(helen);
        names.add(yoshi);
        names.add(giovanni);

        List<String> textsName = names
                .stream().map(WebElement::getText).collect(Collectors.toList());

        return textsName;
    }

    //Exercise 3:

    public void selectVipCheckbox(String vip, String name) {
        vipCheckbox.click();
    }

    public String getAssertRow() {
        return assertRow.getText().substring(9);
    }
}