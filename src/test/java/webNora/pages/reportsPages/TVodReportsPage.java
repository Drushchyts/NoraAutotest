package webNora.pages.reportsPages;

import webNora.pages.AbstractPage;

public class TVodReportsPage extends AbstractPage {

    private String tVodReportsButton = "//span[contains(text(),'TVOD Reports')]";

    public TVodReportsPage clickTVodReportsButton() {
        waitForElementClickable(getElementBy(tVodReportsButton));
        getElement(tVodReportsButton).click();
        return this;
    }
}
