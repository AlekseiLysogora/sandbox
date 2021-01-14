package hw6.runtest;

import hw6.TestsInit;
import hw6.testscore.utility.AuxiliaryClass;
import hw6.testscore.utility.DataProviderJson;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static hw6.Site.*;

public class RunTest extends AuxiliaryClass implements TestsInit {
    private boolean firstTime = true;

    @Test(dataProvider = "jsonData", dataProviderClass = DataProviderJson.class)
    public void userCanSubmitMetalsAndColorsFormTest(
            ArrayList<String> summary, ArrayList<String> elements,
            String color, String metal, ArrayList<String> vegetable
    ) {
        openSite();
        login(ROMAN);
        openMetalColorPage();
//        selectSummary(summary);
//        selectElements(elements);
//        selectColors(color);
//        selectMetals(metal);
        selectVegetables(vegetable);
        pressSubmitBtn();
        assertResults();
    }
}