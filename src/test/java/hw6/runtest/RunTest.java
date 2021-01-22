package hw6.runtest;

import com.google.gson.JsonElement;
import hw6.TestsInit;
import hw6.core.entities.datafromjsonfile.*;
import hw6.core.utility.*;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static hw6.Site.*;

public class RunTest extends AuxiliaryClass implements TestsInit {

    @Test(dataProvider = "firstJsonData", dataProviderClass = DataProviderFromJson.class)
    public void firstVariantTest(
            ArrayList<String> summary, ArrayList<String> elements,
            String color, String metal, ArrayList<String> vegetable
    ) {
        openSite();
        login(ROMAN);
        openMetalColorPage();
        selectSummary2(summary);
        selectElements(elements);
        selectColors(color);
        selectMetals(metal);
        selectVegetables(vegetable);
        pressSubmitBtn();
        assertResults();
    }

    @Test(dataProvider = "secondJsonData", dataProviderClass = DataProviderFromJson.class)
    public void secondVariantTest(
            JsonElement summary, JsonElement elements,
            String color, String metal, JsonElement vegetable
    ) {
        openSite();
        login(ROMAN);
        openMetalColorPage();
        selectSummary(summary);
        selectElements2(elements);
        selectColors(color);
        selectMetals(metal);
        selectVegetables2(vegetable);
        pressSubmitBtn();
        assertResults();
    }

    @Test(dataProvider = "jsonData1", dataProviderClass = DataProviderFromJson.class)
    public void data1Test(Data1 data1) {
        openSite();
        login(ROMAN);
        openMetalColorPage();
        checkData1(data1);
        pressSubmitBtn();
        assertResults();
    }

    @Test(dataProvider = "jsonData2", dataProviderClass = DataProviderFromJson.class)
    public void data2Test(Data2 data2) {
        openSite();
        login(ROMAN);
        openMetalColorPage();
        checkData2(data2);
        pressSubmitBtn();
        assertResults();
    }

    @Test(dataProvider = "jsonData3", dataProviderClass = DataProviderFromJson.class)
    public void data3Test(Data3 data3) {
        openSite();
        login(ROMAN);
        openMetalColorPage();
        checkData3(data3);
        pressSubmitBtn();
        assertResults();
    }

    @Test(dataProvider = "jsonData4", dataProviderClass = DataProviderFromJson.class)
    public void data4Test(Data4 data4) {
        openSite();
        login(ROMAN);
        openMetalColorPage();
        checkData4(data4);
        pressSubmitBtn();
        assertResults();
    }

    @Test(dataProvider = "jsonData5", dataProviderClass = DataProviderFromJson.class)
    public void data5Test(Data5 data5) {
        openSite();
        login(ROMAN);
        openMetalColorPage();
        checkData5(data5);
        pressSubmitBtn();
        assertResults();
    }

}