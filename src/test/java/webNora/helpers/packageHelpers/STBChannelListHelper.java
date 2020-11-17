package webNora.helpers.packageHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.packagePages.STBChannelListPage;

public class STBChannelListHelper extends AbstractHelper {

    STBChannelListPage stbChannelListPage = new STBChannelListPage();

    public STBChannelListHelper clickSTBChannelList() {
        stbChannelListPage.clickSTBChannelListButton();
        return this;
    }

}
