package webNora.helpers.packageHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.packagePages.ContentSetsPage;

import java.awt.*;

public class ContentSetsHelper extends AbstractHelper {

    ContentSetsPage contentSetsPage = new ContentSetsPage();

    public ContentSetsHelper clickContentsSetsButton() {
        contentSetsPage.clickContentSetsButton();
        return this;

    }

    public ContentSetsHelper addContentSet() throws InterruptedException, AWTException {
        contentSetsPage.clickAddContentSetsButton()
                .enterVodName()
//                .enterSearchNameMovies()
                .dragAndDropMovies();
        contentSetsPage.clickCreateSetButton();
        return this;
    }
}

