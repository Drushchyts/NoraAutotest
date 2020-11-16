package nora.web.pages.channelServicePages;

import nora.web.pages.AbstractPage;

public class SmartCatchUpPage extends AbstractPage {

    private String smartCatchUpButton = "//span[contains(text(),'Smart Catchup')]";
    private String addSmartCatchUpButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
    private String cancelButton = "//a[contains(text(),'Cancel')]";

    public SmartCatchUpPage clickSmartCatchup() {
        getElement(smartCatchUpButton).click();
        return this;
    }

    public SmartCatchUpPage clickAddSmartCatchUpButton() {
        waitForElementClickable(getElementBy(addSmartCatchUpButton));
        getElement(addSmartCatchUpButton).click();
        return this;
    }

    public SmartCatchUpPage clickCancelButton() {
        waitForElementClickable(getElementBy(cancelButton));
        getElement(cancelButton).click();
        return this;
    }
}
