package webNora.pages.categoriesPages;

import webNora.pages.AbstractPage;

public class SeriesCategoriesPage extends AbstractPage {

    private String seriesCategoriesButton = "//span[contains(text(),'Series Categories')]";

    public SeriesCategoriesPage clickSeriesCategoriesButton() {
        waitForElementClickable(getElementBy(seriesCategoriesButton));
        getElement(seriesCategoriesButton).click();
        return this;
    }

}
