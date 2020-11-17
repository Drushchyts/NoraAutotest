package webNora.helpers.packageHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.packagePages.ContentSetsPage;

public class ContentSetsHelper extends AbstractHelper {

    ContentSetsPage contentSetsPage = new ContentSetsPage();

    public ContentSetsHelper clickCouponsButton() {
        contentSetsPage.clickContentSetsButton();
        return this;
    }
}
