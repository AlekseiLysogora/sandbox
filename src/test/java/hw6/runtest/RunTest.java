package hw6.runtest;

import hw6.Site;
import hw6.service.entities.JsonDataProvider;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class RunTest extends CoreTest {
    /*
    1. Login on JDI site as User +
    2. Open Metals & Colors page by Header menu +
    3. Fill form Metals & Colors by data below:
    -. Submit form Metals & Colors
    4. Result sections should contains data  below:
     */

    @Test(
            dataProvider = "jsonData",
            dataProviderClass = JsonDataProvider.class
    )
    public void userCanSubmitMetalsAndColorsFormTest(
            ArrayList<String> summary, String color, String metal,
            ArrayList<String> vegetable
    )
    {
        Site.openHomePage();
        homePage.loginJdiSite(ROMAN);
        Site.openMetalColorPage();
        metalsAndColorsPage.selectSummary(summary);
        metalsAndColorsPage.selectElements();
        metalsAndColorsPage.selectColors(color);
        metalsAndColorsPage.selectMetals(metal);
        metalsAndColorsPage.selectVegetables(vegetable);
    }
}