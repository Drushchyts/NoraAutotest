package nora.web.helpers.packageHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.packagePages.ContentSetsPage;

public class ContentSetsHelper extends AbstractHelper {

    ContentSetsPage contentSetsPage = new ContentSetsPage();

    public ContentSetsHelper clickCouponsButton() {
        contentSetsPage.clickContentSetsButton();
        return this;
    }
}
