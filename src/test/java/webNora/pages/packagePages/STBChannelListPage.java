package webNora.pages.packagePages;

import webNora.pages.AbstractPage;

public class STBChannelListPage extends AbstractPage {

    private String stbChannelListButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/a[6]";

    public STBChannelListPage clickSTBChannelListButton() {
        waitForElementClickable(getElementBy(stbChannelListButton));
        getElement(stbChannelListButton).click();
        return this;
    }
}
