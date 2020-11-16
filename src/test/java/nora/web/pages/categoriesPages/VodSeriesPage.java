package nora.web.pages.categoriesPages;

import nora.web.pages.AbstractPage;

public class VodSeriesPage extends AbstractPage {

    private String vodSeriesButton = "//span[contains(text(),'VOD Categories')]";

    public VodSeriesPage clickVodSeriesButton() {
        waitForElementClickable(getElementBy(vodSeriesButton));
        getElement(vodSeriesButton).click();
        return this;
    }


}
