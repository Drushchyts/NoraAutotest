package webNora.pages.packagePages;

import webNora.pages.AbstractPage;

public class ContentSetsPage extends AbstractPage {


    private String contentSetsButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/a[3]";

    public ContentSetsPage clickContentSetsButton() {
        getElement(contentSetsButton).click();
        return this;
    }
}
