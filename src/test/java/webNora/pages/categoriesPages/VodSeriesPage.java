package webNora.pages.categoriesPages;

import webNora.pages.AbstractPage;

public class VodSeriesPage extends AbstractPage {

    private String vodSeriesButton = "//span[contains(text(),'VOD Series')]";

    public VodSeriesPage clickVodSeriesButton() {
        waitForElementClickable(getElementBy(vodSeriesButton));
        getElement(vodSeriesButton).click();
        return this;
    }

}
