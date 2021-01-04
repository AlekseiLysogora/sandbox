package hw6.service.pages;

import com.epam.jdi.light.elements.complex.Checklist;
//import com.epam.jdi.light.ui.html.complex.Checklist; взято из документации
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.*;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;

import java.util.ArrayList;
import java.util.List;

//@Url("https://jdi-testing.github.io/jdi-light/metals-colors.html")
public class MetalsAndColorsPage extends WebPage {

    @UI("[name=custom_radio_odd]")
    public RadioButtons summaryTop;

    @UI("[name=custom_radio_even]")
    public RadioButtons summaryBottom;

    @FindBy(id = "elements-checklist")
    List<Checkbox> checkboxes;

    @FindBy(xpath = "//*[@type='checkbox']")
    public Checklist elements;

    @JDropdown(
            root = "div[ui=dropdown]",
            value = ".filter-option",
            list = "li",
            expand = ".caret"
    )
    public Dropdown colors;

    @JDropdown(
            root = "div[ui=combobox]",
            value = "input",
            list = "li",
            expand = ".caret"
    )
    public Dropdown metals;

    @JDropdown(
            root = "div[ui=droplist]",
            value = "button",
            list = "li",
            expand = ".caret"
    )
    public Dropdown vegetables;

    public void selectSummary(ArrayList<String> summary) {
        summaryTop.select(summary.get(0));
        summaryBottom.select(summary.get(1));
    }

    public void selectElements() {
    }

    public void selectColors(String color) {
        colors.select(color);
    }

    public void selectMetals(String metal) {
        metals.select(metal);
    }

    public void selectVegetables(ArrayList<String> vegetable) {
        // как очистить поле перед выбором элементов

        vegetables.select(vegetable.get(0));
    }
}