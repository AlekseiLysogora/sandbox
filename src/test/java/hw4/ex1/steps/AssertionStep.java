package hw4.ex1.steps;

import org.openqa.selenium.WebDriver;

public class AssertionStep extends AbstractStep {

    public AssertionStep(WebDriver driver) {
        super(driver);
    }

    /*@Step("Проверка что текст поиска присутствует в названии товара")
    public void searchTextShouldBeExistInResults(String expectedText) {
        List<String> productNames = yandexMarketCatalogItemPage.getProductNames();

        SoftAssertions softAssertions = new SoftAssertions();
        productNames.forEach(productName ->
                softAssertions.assertThat(productName)
                        .as("Проверка что поисковый текст присутствует в заголовке продукта")
                        .contains(expectedText));
        softAssertions.assertAll();
    }*/
}
