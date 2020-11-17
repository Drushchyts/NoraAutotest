package webNora.helpers.channelServiceHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.channelServicePages.SmartCatchUpPage;

public class SmartCatchUpHelper extends AbstractHelper {

    SmartCatchUpPage smartCatchUpPage = new SmartCatchUpPage();

    public SmartCatchUpHelper addCatchUpTv() {
        smartCatchUpPage.clickSmartCatchup()
                .clickAddSmartCatchUpButton()
                .clickCancelButton();
        return this;
    }
}
