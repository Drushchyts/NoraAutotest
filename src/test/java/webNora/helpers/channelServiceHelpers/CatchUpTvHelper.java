package webNora.helpers.channelServiceHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.channelServicePages.CatchUpTvPage;

public class CatchUpTvHelper extends AbstractHelper {

    CatchUpTvPage catchUpTvPage = new CatchUpTvPage();

    public CatchUpTvHelper addCatchUpTv() {
        catchUpTvPage.clickCatchUpTv()
                .clickAddCatchUpTvButton()
                .clickCancelButton();
        return this;
    }


}
