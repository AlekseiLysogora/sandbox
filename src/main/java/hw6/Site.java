package hw6;

import com.epam.jdi.light.elements.pageobjects.annotations.*;

import hw6.service.pages.HomePage;
import hw6.service.pages.MetalsAndColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class Site {

    @Url("index.html")
    public static HomePage homePage;

    @Url("metals-colors.html")
    public static MetalsAndColorsPage metalColorPage;

    public static void openHomePage() {
        homePage.open();
    }

    public static void openMetalColorPage() {
        metalColorPage.open();
    }

}
