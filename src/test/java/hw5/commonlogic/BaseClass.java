package hw5.commonlogic;

import hw5.commonlogic.utility.GetProperties;
import hw5.entity.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static hw5.commonlogic.utility.GetProperties.NameOfProperty.*;

public class BaseClass {

    private WebDriver driver;
    private WebDriverWait wait;
    private GetProperties getExerciseProperties;

    public BaseClass(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        getExerciseProperties = new GetProperties(EXERCISE);
    }

    public void openPage() {
        driver.get(getExerciseProperties.getResource("homePageURL"));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("html"))));
    }

    public void login(String userName, String password) {
        User.getInstance(userName, password);

        String loginCaretStr = getExerciseProperties.getResource("loginCaret");
        WebElement loginCaret = driver.findElement(By.id(loginCaretStr));
        loginCaret.click();

        String usernameStr = getExerciseProperties.getResource("username");
        WebElement username = driver.findElement(By.cssSelector(usernameStr));
        username.sendKeys(User.getName().substring(0,5));

        String passStr = getExerciseProperties.getResource("pass");
        WebElement pass = driver.findElement(By.cssSelector(passStr));
        pass.sendKeys(User.getPassword());

        String enterBtnStr = getExerciseProperties.getResource("enterBtn");
        WebElement enterBtn = driver.findElement(By.xpath(enterBtnStr));
        enterBtn.click();
    }
}