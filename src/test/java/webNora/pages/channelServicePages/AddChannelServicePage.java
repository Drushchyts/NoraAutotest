package webNora.pages.channelServicePages;

import webNora.pages.AbstractPage;

public class AddChannelServicePage extends AbstractPage {

    private String channelServiceButton = "//span[contains(text(),'Channel Services')]";

    public AddChannelServicePage clickChannelServiceMod() {
        getElement(channelServiceButton).click();
        return this;
    }
}
