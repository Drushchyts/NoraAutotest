package webNora.helpers.channelServiceHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.channelServicePages.AddChannelServicePage;

public class AddChannelServiceHelper extends AbstractHelper {

    AddChannelServicePage addChannelServicePage = new AddChannelServicePage();

    public void clickChannelServiceButton() {
        addChannelServicePage.clickChannelServiceMod();
    }
}
