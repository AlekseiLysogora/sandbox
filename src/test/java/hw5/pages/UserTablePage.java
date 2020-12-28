package hw5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserTablePage extends AbstractPage {
    @FindBy(css = "#ivan")
    protected WebElement sergeyIvanVipCheckBox;

    @FindBy(xpath = "/html/body/header/div/nav/ul[1]/li[3]/ul/li[6]/a")
    protected WebElement SelectUserTable;

    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li")
    protected WebElement userTableRow;

    public UserTablePage(WebDriver driver) {
        super(driver);
    }

    public void openUserTable(String userTable) {
        SelectUserTable.click();
    }

    public void selectCheckbox(String typeOfCheckbox, String user) {
        sergeyIvanVipCheckBox.click();
    }

    public WebElement getUserTableRow() {
        return userTableRow;
    }
}
