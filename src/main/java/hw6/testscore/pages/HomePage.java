package hw6.testscore.pages;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;

import hw6.testscore.entities.User;
import hw6.testscore.pages.elements.composite.LoginComposite;

import lombok.Getter;

@Getter
public class HomePage extends WebPage {

    @FindBy(id = "user-icon")
    private Label label;

    @FindBy(css = ".nav")
    public Menu header;

    private LoginComposite loginComposite;

    public void loginJdiSite(User user) {
        label.click();
        loginComposite.loginAs(user);
    }
}