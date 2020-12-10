package webNora.pages.geoBlockPages;

import webNora.pages.AbstractPage;

public class AddGeoBlockPAge extends AbstractPage {

    private String geoBlockButton = "//span[contains(text(),'GEO Block')]";

    public AddGeoBlockPAge clickGeoBlockButton() {
        waitForElementClickable(getElementBy(geoBlockButton));
        getElement(geoBlockButton).click();
        return this;
    }

}
