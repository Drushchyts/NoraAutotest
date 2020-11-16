package nora.web.helpers.packageHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.packagePages.STBChannelListPage;

public class STBChannelListHelper extends AbstractHelper {

    STBChannelListPage stbChannelListPage = new STBChannelListPage();

    public STBChannelListHelper clickSTBChannelList() {
        stbChannelListPage.clickSTBChannelListButton();
        return this;
    }

}
