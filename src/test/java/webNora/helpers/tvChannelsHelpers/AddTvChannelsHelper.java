package webNora.helpers.tvChannelsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.tvChannelsPages.AddTvChannelsPage;

public class AddTvChannelsHelper extends AbstractHelper {

    AddTvChannelsPage addTvChannelsPage = new AddTvChannelsPage();

    public AddTvChannelsHelper clickTvChannelsButton() {
        addTvChannelsPage.clickTvChannelsMod();
        return this;
    }

    public AddTvChannelsHelper addChannel() throws InterruptedException {
        addTvChannelsPage.clickAddChannelButton()
                .enterName()
                .enterNumber()
                .enterEpg()
                .selectLanguage()
                .enterStb()
                .clickSaveButton()
                .enterSearchChannel()
                .checkCreateChannel();
        return this;
    }


}
