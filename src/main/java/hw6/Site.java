package hw6;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.*;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import hw6.testscore.entities.ExistingDataJsonObject;
import hw6.testscore.entities.User;
import hw6.testscore.jsonreadewrite.ReadFromJson;
import hw6.testscore.pages.Pages;
import hw6.testscore.pages.HomePage;
import hw6.testscore.pages.MetalsAndColorsPage;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class Site {

    @Css(".profile-photo [ui=label]")
    public static UIElement userName;

    @Url("index.html")
    public static HomePage homePage;

    @Url("metals-colors.html")
    public static MetalsAndColorsPage metalColorPage;

    public static void openSite() {
        homePage.open();
    }

    public static void login(User user) {
        openSiteIfItClosed();
        if (!userName.isDisplayed()) {
            homePage.loginJdiSite(user);
        }
    }

    public static void openMetalColorPage() {
        homePage.getHeader().select(Pages.METALS_COLORS);
    }

    public static void selectSummary(ArrayList<String> summary) {
        metalColorPage.selectSummary(summary);
    }

    public static void selectElements(ArrayList<String> elements) {
        metalColorPage.selectElements(elements);
    }

    public static void selectColors(String color) {
        metalColorPage.selectColors(color);
    }

    public static void selectMetals(String metal) {
        metalColorPage.selectMetals(metal);
    }

    public static void selectVegetables(ArrayList<String> vegetable) {
        metalColorPage.selectVegetables(vegetable);
    }

    public static void pressSubmitBtn() {
        metalColorPage.pressSubmitBtn();
    }

    public static void assertResults() {

        Assert.assertTrue(!metalColorPage.assertResults2().isEmpty(),
                "Log row at the page is empty");

        String[] resList = metalColorPage.assertResults2().split("\n");
        System.err.println(resList[0].trim());
        System.err.println(resList[1].trim());
        System.err.println(resList[2].trim());
        System.err.println(resList[3].trim());
        System.err.println(resList[4].trim());
    }

    private static void openSiteIfItClosed() {
        if (!WebPage.getUrl().contains("https://jdi-testing.github.io/jdi-light/")) {
            homePage.open();
        }
    }
}