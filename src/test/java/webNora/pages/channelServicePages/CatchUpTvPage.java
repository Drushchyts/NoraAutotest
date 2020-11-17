package webNora.pages.channelServicePages;

import webNora.pages.AbstractPage;

public class CatchUpTvPage extends AbstractPage {

    private String catchUpTvButton = "//span[contains(text(),'Catch Up TV')]";
    private String addCatchUpTvButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
    private String cancelButton = "//a[contains(text(),'Cancel')]";


    public CatchUpTvPage clickCatchUpTv() {
        getElement(catchUpTvButton).click();
        return this;
    }

    public CatchUpTvPage clickAddCatchUpTvButton() {
        waitForElementClickable(getElementBy(addCatchUpTvButton));
        getElement(addCatchUpTvButton).click();
        return this;
    }

    public CatchUpTvPage clickCancelButton() {
        waitForElementClickable(getElementBy(cancelButton));
        getElement(cancelButton).click();
        return this;
    }
}
