package hw6.core.pages;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.*;
import com.epam.jdi.light.ui.html.elements.common.*;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import hw6.core.entities.datafromjsonfile.*;

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

    public void selectData1(Data1 data_1) {
        summaryTop.select(String.valueOf(data_1.getSummary().getAsJsonArray().get(0)));
        //summaryTop.select(summary.get(0));
        summaryBottom.select(String.valueOf(data_1.getSummary().getAsJsonArray().get(1)));
        //summaryBottom.select(summary.get(1));

        JsonArray arrayList = data_1.getElements().getAsJsonArray();
        if (arrayList.size() == 2) {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
        } else {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
            elementChecklist.select(String.valueOf(arrayList.get(2)));
            elementChecklist.select(String.valueOf(arrayList.get(3)));
        }

        colors.select(data_1.getColor());
        metals.select(data_1.getMetals());

        cleanUpVegetables();
        JsonArray arrayListVegetables = data_1.getVegetables().getAsJsonArray();
        for (JsonElement veget:arrayListVegetables) {
            vegetables.select(String.valueOf(veget));
        }

    }

    public void selectData2(Data2 data_2) {
        JsonArray arrayList = data_2.getElements().getAsJsonArray();
        JsonArray arrayListVegetables = data_2.getVegetables().getAsJsonArray();

        summaryTop.select(String.valueOf(data_2.getSummary().getAsJsonArray().get(0)));
        summaryBottom.select(String.valueOf(data_2.getSummary().getAsJsonArray().get(1)));

        if (arrayList.size() == 2) {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
        } else {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
            elementChecklist.select(String.valueOf(arrayList.get(2)));
            elementChecklist.select(String.valueOf(arrayList.get(3)));
        }

        colors.select(data_2.getColor());
        metals.select(data_2.getMetals());

        cleanUpVegetables();
        for (JsonElement veget:arrayListVegetables) {
            vegetables.select(String.valueOf(veget));
        }

    }

    public void selectData3(Data3 data_3) {
        summaryTop.select(String.valueOf(data_3.getSummary().getAsJsonArray().get(0)));
        //summaryTop.select(summary.get(0));
        summaryBottom.select(String.valueOf(data_3.getSummary().getAsJsonArray().get(1)));
        //summaryBottom.select(summary.get(1));

        JsonArray arrayList = data_3.getElements().getAsJsonArray();
        if (arrayList.size() == 2) {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
        } else {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
            elementChecklist.select(String.valueOf(arrayList.get(2)));
            elementChecklist.select(String.valueOf(arrayList.get(3)));
        }

        colors.select(data_3.getColor());
        metals.select(data_3.getMetals());

        cleanUpVegetables();
        JsonArray arrayListVegetables = data_3.getVegetables().getAsJsonArray();
        for (JsonElement veget:arrayListVegetables) {
            vegetables.select(String.valueOf(veget));
        }

    }

    public void selectData4(Data4 data4) {
        summaryTop.select(String.valueOf(data4.getSummary().getAsJsonArray().get(0)));
        //summaryTop.select(summary.get(0));
        summaryBottom.select(String.valueOf(data4.getSummary().getAsJsonArray().get(1)));
        //summaryBottom.select(summary.get(1));

        JsonArray arrayList = data4.getElements().getAsJsonArray();
        if (arrayList.size() == 2) {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
        } else {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
            elementChecklist.select(String.valueOf(arrayList.get(2)));
            elementChecklist.select(String.valueOf(arrayList.get(3)));
        }

        colors.select(data4.getColor());
        metals.select(data4.getMetals());

        cleanUpVegetables();
        JsonArray arrayListVegetables = data4.getVegetables().getAsJsonArray();
        for (JsonElement veget:arrayListVegetables) {
            vegetables.select(String.valueOf(veget));
        }

    }

    public void selectData5(Data5 data_5) {
        summaryTop.select(String.valueOf(data_5.getSummary().getAsJsonArray().get(0)));
        //summaryTop.select(summary.get(0));
        summaryBottom.select(String.valueOf(data_5.getSummary().getAsJsonArray().get(1)));
        //summaryBottom.select(summary.get(1));

        JsonArray arrayList = data_5.getElements().getAsJsonArray();
        if (arrayList.size() == 2) {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
        } else {
            elementChecklist.select(String.valueOf(arrayList.get(0)));
            elementChecklist.select(String.valueOf(arrayList.get(1)));
            elementChecklist.select(String.valueOf(arrayList.get(2)));
            elementChecklist.select(String.valueOf(arrayList.get(3)));
        }

        colors.select(data_5.getColor());
        metals.select(data_5.getMetals());

        cleanUpVegetables();
        JsonArray arrayListVegetables = data_5.getVegetables().getAsJsonArray();
        for (JsonElement veget:arrayListVegetables) {
            vegetables.select(String.valueOf(veget));
        }

    }

    public void selectSummary(JsonElement summary) {
        summaryTop.select(String.valueOf(summary.getAsJsonArray().get(0)));
        //summaryTop.select(summary.get(0));
        summaryBottom.select(String.valueOf(summary.getAsJsonArray().get(1)));
        //summaryBottom.select(summary.get(1));
    }
    public void selectSummary2(ArrayList<String> summary) {
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

    public void selectElements2(JsonElement elements) {
        JsonArray arrayList = elements.getAsJsonArray();
        if (arrayList.size() == 2) {
            elementChecklist.select(String.valueOf(elements.getAsJsonArray().get(0)));
            elementChecklist.select(String.valueOf(elements.getAsJsonArray().get(1)));
        } else {
            elementChecklist.select(String.valueOf(elements.getAsJsonArray().get(0)));
            elementChecklist.select(String.valueOf(elements.getAsJsonArray().get(1)));
            elementChecklist.select(String.valueOf(elements.getAsJsonArray().get(2)));
            elementChecklist.select(String.valueOf(elements.getAsJsonArray().get(3)));
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
    public void selectVegetables2(JsonElement vegetable) {
        cleanUpVegetables();
        JsonArray arrayList = vegetable.getAsJsonArray();
        for (JsonElement veget:arrayList) {
            vegetables.select(String.valueOf(veget));
        }
    }

    public void cleanUpVegetables() {
        vegetables.expand();
        vegetableCheckBox.click();
    }

    public void pressSubmitBtn() {
        submit.click();
    }

    public String assertResults2() {
        return assertRow
                .stream().map(WebElement::getText).collect(Collectors.toList()).get(0);
    }
}