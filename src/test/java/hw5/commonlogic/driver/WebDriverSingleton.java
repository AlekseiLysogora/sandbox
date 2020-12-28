package hw5.commonlogic.driver;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton() {
    }

    public static WebDriver getDriver() {
        String browserName = System.getProperty("browser") == null ? "CHROME" : System.getProperty("browser");
        if (Objects.isNull(driver)) {
            driver = WebDriverFactory.createWebDriver(browserName);
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }

}