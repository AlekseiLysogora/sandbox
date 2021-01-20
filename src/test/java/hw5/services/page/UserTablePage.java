package hw5.services.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class UserTablePage extends AbstractPage {

    @FindBy(xpath = "//tbody//tr/td//a")
    private List<WebElement> nameList;

    @FindBy(xpath = "//tbody//div/span")
    private List<WebElement> heroesList;

    @FindBy(xpath = "//select")
    private List<WebElement> sixDropdowns;

    @FindBy(xpath = "//*[@type='checkbox']")
    private List<WebElement> sixCheckBoxes;

    @FindBy(xpath = "//tbody//td[3]/a")
    private List<WebElement> sixUsernames;

    @FindBy(xpath = "//tbody//td[4]//span")
    private List<WebElement> sixDescriprions;

    @FindBy(xpath = "//tbody//select")
    private List<WebElement> droplistElem;

    @FindBy(xpath = "//li[contains(text(), 'Vip: condition changed to true')]")
    private WebElement assertRow;

    @FindBy(css = "select")
    protected List<WebElement> dropdowns;

    @FindBy(xpath = "//tbody//tr")
    protected List<WebElement> selectCheckboxForSergeyIvan;

    @FindBy(xpath = "//tbody/tr/td[1]")
    protected List<WebElement> numbers;

    public UserTablePage(WebDriver driver) {
        super(driver);
    }

    public boolean getNumber(String number) {
        for (Integer x = 1; x < dropdowns.size() + 1; x++) {
            System.out.println(x); //comment's hint (at the end of class's code)
            if (number.equals(x.toString())) {
                return true;
            }
        }
        return false;
    }

    public List<String> getRomanRole() {
        String[] resList = dropdowns.get(0).getText().split("\n");
        List<String> listRole = new ArrayList<>();
        for(int i = 0; i < resList.length; i++){
            listRole.add(resList[i].trim());
        }
        return listRole;
    }

    public List<String> getNumber2() {
        List<String> listName = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            listName.add(numbers.get(i).getText());
        }
        return listName;
    }

    public boolean getUser(String usernames) {
        for (int i = 0; i < nameList.size(); i++) {
            System.err.println("name from LIST" + nameList.get(i).getText());
            if (nameList.get(i).getText().equals(usernames)) {
                System.out.println(
                        String //comment's hint (at the end of class's code)
                                .format("name in list == %s", nameList.get(i).getText())
                );
                return true;
            }
        }
        return false;
    }

    public List<String> getUser2() {
        List<String> listName = new ArrayList<>();
        for (int i = 0; i < nameList.size(); i++) {
            listName.add(nameList.get(i).getText());
        }
        return listName;
    }

    public List<String> getDescription2() {
        List<String> listDescription = new ArrayList<>();
        for (int i = 0; i < heroesList.size(); i++) {
            listDescription.add(heroesList.get(i).getText());
        }
        return listDescription;
    }

    public List<String> getDescription() {
        List<String> listDescription = new ArrayList<>();

        String Wolverine[] = heroesList.get(0).getText().split(" ");
        String wolverine = Wolverine[0];

        String SpiderMan[] = heroesList.get(1).getText().split(" ");
        String spider = SpiderMan[0] + " " + SpiderMan[1];

        String Punisher[] = heroesList.get(2).getText().split(" ");
        String punisher = Punisher[0];

        String Captain[] = heroesList.get(3).getText().split("\n");
        String capitan = Captain[0] + " " + Captain[1];

        String Cyclope[] = heroesList.get(4).getText().split("\n");
        String cyclope = Cyclope[0] + " " + Cyclope[1];

        String Hulk[] = heroesList.get(5).getText().split("\n");
        String hulk = Hulk[0] + Hulk[1];

        listDescription.add(wolverine);
        listDescription.add(spider);
        listDescription.add(punisher);
        listDescription.add(capitan);
        listDescription.add(cyclope);
        listDescription.add(hulk);

        return listDescription;
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

    public String getSixDropdowns() {
        return String.valueOf(sixDropdowns.size());
    }

    public String getSixCheckboxes() {
        return String.valueOf(sixCheckBoxes.size());
    }

    public String getSixUsernames() {
        return String.valueOf(sixUsernames.size());
    }

    public String getSixDescription() {
        return String.valueOf(sixDescriprions.size());
    }

    public String assertDroplist() {
        List<String> roles = droplistElem
                .stream().map(WebElement::getText).collect(Collectors.toList());
        return roles.get(0);
    }

    //Exercise 3:

    public void selectVipCheckbox(String vip, String name) {
        for (WebElement element: selectCheckboxForSergeyIvan) {
            if (element.getText().contains(name)) {
                System.out.println(element.getText());
                element.findElement(By.tagName("input")).click();
                //e.findElement(By.linkText(vip)).click();
            }
        }
    }

    public String getAssertRow() {
        return assertRow.getText().substring(9);
    }
}

    /*
                            ***COMMENT'S HINT***

        Hi! I know that this is a bad practice to leave some log's information in the product code,
    but, please, let me leave this line(s) here. It will help us (especially me as a junior tester)
    in the future to understand logical steps better and figure out an error if it comes to our code
    Thanks:)
    */