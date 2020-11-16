package nora.web.helpers.channelServiceHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.channelServicePages.SmartCatchUpPage;

public class SmartCatchUpHelper extends AbstractHelper {

    SmartCatchUpPage smartCatchUpPage = new SmartCatchUpPage();

    public SmartCatchUpHelper addCatchUpTv() {
        smartCatchUpPage.clickSmartCatchup()
                .clickAddSmartCatchUpButton()
                .clickCancelButton();
        return this;
    }
}
