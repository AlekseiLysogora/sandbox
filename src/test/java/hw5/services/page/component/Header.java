package hw5.services.page.component;

import hw5.services.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.Optional;

public class Header extends AbstractPage {

    @FindBy(className = "uui-navigation nav navbar-nav m-l8")
    private List<WebElement> serviceItems;

    public Header(WebDriver driver) {
        super(driver);
    }

//    WebElement webElement = serviceItems.get(0);

    public void selectHeaderButton(String itemName) {
        //System.out.println(webElement.getText());

//        Optional<WebElement> category = serviceItems
//                .stream()
//                .filter(categoryItem -> categoryItem.getText().equalsIgnoreCase(itemName))
//                .findFirst();
//
//        category.ifPresent(WebElement::click);
    }
}