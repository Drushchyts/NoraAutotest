package nora.web.helpers.channelServiceHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.channelServicePages.AddChannelServicePage;

public class AddChannelServiceHelper extends AbstractHelper {

    AddChannelServicePage addChannelServicePage = new AddChannelServicePage();

    public void clickChannelServiceButton() {
        addChannelServicePage.clickChannelServiceMod();
    }
}
