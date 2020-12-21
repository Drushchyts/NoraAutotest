package webNora.helpers.noraGoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.noraGoPages.TvShowsPage;

public class TvShowsHelper extends AbstractHelper {

    TvShowsPage tvShowsPage = new TvShowsPage();

    public TvShowsHelper TvShowsHelper() {
        tvShowsPage.clickTvShowButton()
                .enterSearchName()
                .checkTvShow();
        return this;
    }
}
