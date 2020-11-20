package webNora.helpers.tvChannelsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.tvChannelsPages.DeleteTvChannelPage;

public class DeleteTvChannelHelper extends AbstractHelper {

    DeleteTvChannelPage deleteTvChannelPage = new DeleteTvChannelPage();

    public DeleteTvChannelHelper deleteChannel() {
        deleteTvChannelPage.clickDeleteChannelButton()
                .clickAgreeDeleteButton();
        return this;
    }
}
