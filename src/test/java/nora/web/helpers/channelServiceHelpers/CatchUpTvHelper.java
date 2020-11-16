package nora.web.helpers.channelServiceHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.channelServicePages.CatchUpTvPage;

public class CatchUpTvHelper extends AbstractHelper {

    CatchUpTvPage catchUpTvPage = new CatchUpTvPage();

    public CatchUpTvHelper addCatchUpTv() {
        catchUpTvPage.clickCatchUpTv()
                .clickAddCatchUpTvButton()
                .clickCancelButton();
        return this;
    }
}
