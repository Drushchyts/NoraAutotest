package webNora.helpers.noraGoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.noraGoPages.TvNoraPage;

public class TvNoraHelper extends AbstractHelper {

    TvNoraPage tvNoraPage = new TvNoraPage();

    public TvNoraHelper checkTvNora() throws InterruptedException {
        tvNoraPage.clickTvNoraButton()
                .checkPlayer();
        return this;
    }
}
