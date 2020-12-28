package hw5.ex1.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {

    public WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
}