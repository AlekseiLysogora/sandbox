package hw5.services.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.stream.Collectors;

public class UserTablePage extends AbstractPage {

    @FindBy(xpath = "//tbody//tr/td//a")
    private List<WebElement> nameList;

    @FindBy(xpath = "//tbody//div/span")
    private List<WebElement> heroesList;

    @FindBy(xpath = "//*[@type='checkbox']")
    private List<WebElement> sixCheckBoxes;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/select")
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

    public boolean getNumber(String number) {
        for (Integer x = 1; x < dropdowns.size()+1; x++)
        {
            System.out.println(x); //comment's hint (at the end of class's code)
            if (number.equals(x.toString())){
                return true;
            }
        }
        //comment's hint (at the end of class's code)
        //System.out.println(dropdowns
        //.stream().map(WebElement::getText).collect(Collectors.toList()).size());

        return false;
    }

    public boolean getUser(String usernames) {
        for (WebElement nameInList: nameList) {
            if (nameInList.getText().equals(usernames)) {
                System.out.println(
                        String //comment's hint (at the end of class's code)
                                .format("name in list == %s", nameInList.getText())
                );
                return true;
            }
        }
        return false;
    }

    public boolean getDescription(String description) {
        for (WebElement heroeInList: heroesList) {
            if (description.contains(heroeInList.getText().substring(0,3))) {
                System.out.println(
                        String //comment's hint (at the end of class's code)
                                .format("hero in list == %s", heroeInList.getText())
                );
                return true;
            }
        }
        return false;
    }

    public String assertSixCheckboxes() {
        return String.valueOf(sixCheckBoxes.size());
    }

    public String assertDroplist(String droplist) {
        List<String> roles = droplistElem
                .stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println(roles);
        return roles.get(0);
    }

    //Exercise 3:

    public void selectVipCheckbox(String vip, String name) {
        vipCheckbox.click();
    }

    public String getAssertRow() {
        return assertRow.getText().substring(9);
    }
}

    /*
                            ***COMMENT'S HINT***

        Hi! I know that this is a bad practice to leave some log's information in the product code,
    but, please, let me leave this line(s) here. It will help us (especially me as a junior tester)
    in the future to understand logical steps better and figure out an error if it comes to our code.
    Thanks:)
    */