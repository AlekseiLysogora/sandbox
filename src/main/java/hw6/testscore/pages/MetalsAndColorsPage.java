package hw6.testscore.pages;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.*;
import com.epam.jdi.light.ui.html.elements.common.*;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;

import hw6.testscore.jsonreadewrite.WriteToJason;

import org.openqa.selenium.WebElement;

import java.util.*;
import java.util.stream.Collectors;

public class MetalsAndColorsPage extends WebPage {

    @UI("[name=custom_radio_odd]")
    public RadioButtons summaryTop;

    @UI("[name=custom_radio_even]")
    public RadioButtons summaryBottom;

    @FindBy(css = "section[id=elements-checklist] input[type=checkbox]")
    public Checklist elementChecklist;

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

    @XPath("//input[@id='g7']")
    public Checkbox vegetableCheckBox;

    @UI("['Submit']")
    public Button submit;

    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[2]/div[2]/div")
    private List<WebElement> assertRow;

    private WriteToJason writeToJason;

    public void selectSummary(ArrayList<String> summary) {
        summaryTop.select(summary.get(0));
        summaryBottom.select(summary.get(1));
    }

    public void selectElements(ArrayList<String> elements) {
        if (elements.size() == 2) {
            elementChecklist.select(elements.get(0));
            elementChecklist.select(elements.get(1));
        } else {
            elementChecklist.select(elements.get(0));
            elementChecklist.select(elements.get(1));
            elementChecklist.select(elements.get(2));
            elementChecklist.select(elements.get(3));
        }
    }

    public void selectColors(String color) {
        colors.select(color);
    }

    public void selectMetals(String metal) {
        metals.select(metal);
    }

    public void selectVegetables(ArrayList<String> vegetable) {
        cleanUpVegetables();
        for (String veget:vegetable) {
            vegetables.select(veget);
        }
    }

    public void cleanUpVegetables() {
        vegetables.expand();
        vegetableCheckBox.click();
    }

    public void pressSubmitBtn() {
        submit.click();
    }

    /*
    This method was aimed to get the log row to the compassion.
    The idea was concluded to write the actual log for the page to
    the new JSON object for the following comparison.
     */
    public void assertResults() {
        writeToJason = new WriteToJason();
        writeToJason.writeToJason(assertRow
                .stream().map(WebElement::getText).collect(Collectors.toList()).get(0));
    }

    public String assertResults2() {
        return assertRow
                .stream().map(WebElement::getText).collect(Collectors.toList()).get(0);
    }
}