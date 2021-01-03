package hw6.service.pages.elements.composite;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.*;

import hw6.service.entities.User;

public class LoginComposite extends Form<User> {

    @FindBy(id = "name")
    public TextField name;

    @FindBy(id = "password")
    public TextField password;

}
