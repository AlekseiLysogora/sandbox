package hw6.service.pages;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import hw6.service.entities.User;
import hw6.service.pages.elements.composite.LoginComposite;

public class HomePage extends WebPage {

    @FindBy(id = "user-icon")
    public static Label label;

    public static LoginComposite loginComposite;

    public static void loginJdiSite(User user) {
        label.click();
        loginComposite.loginAs(user);
    }
}