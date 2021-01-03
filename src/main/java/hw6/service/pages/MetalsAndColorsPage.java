package hw6.service.pages;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;

public class MetalsAndColorsPage extends WebPage {

    @JDropdown(
            root = "div[ui=dropdown]",
            value = ".filter-option",
            list = "li", expand = ".caret"
    )
    public static Dropdown colors;

    @JDropdown(
            root = "div[ui=combobox]",
            value = "input",
            list = "li", expand = ".caret"
    )
    public static Dropdown metals;

    @JDropdown(
            root = "div[ui=droplist]",
            value = "button",
            list = "li", expand = ".caret"
    )
    public static Dropdown vegetables;

    @FindBy(id = "elements-checklist")
    public static Checklist elements;

    @UI("['Calculate']")
    public Button calculate;

    @UI("['Submit']")
    public Button submit;


    public static void selectColors() {
        colors.select("Red");
    }

    public static void selectMetal() {
        metals.select("Gold");
    }

    public static void selectVegetables() {
        vegetables.select("Tomato");
    }
}