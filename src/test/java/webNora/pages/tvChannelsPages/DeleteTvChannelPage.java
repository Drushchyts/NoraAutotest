package webNora.pages.tvChannelsPages;

import webNora.pages.AbstractPage;

public class DeleteTvChannelPage extends AbstractPage {

    private String deleteChannelButton = "//tbody/tr[1]/td[10]/div[1]/button[1]/span[1]";
    private String agreeDeleteButton = "//button[contains(text(),'Yes')]";

    public DeleteTvChannelPage clickDeleteChannelButton() {
        getElement(deleteChannelButton).click();
        return this;
    }

    public DeleteTvChannelPage clickAgreeDeleteButton() {
        waitForElementClickable(getElementBy(agreeDeleteButton));
        getElement(agreeDeleteButton).click();
        return this;
    }
}
