package nora.web.pages.channelServicePages;

import nora.web.pages.AbstractPage;

public class AddChannelServicePage extends AbstractPage {

    private String channelServiceButton = "//span[contains(text(),'Channel Services')]";

    public AddChannelServicePage clickChannelServiceMod() {
        getElement(channelServiceButton).click();
        return this;
    }
}
