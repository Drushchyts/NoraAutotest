package webNora.pages.settingsPages;

import webNora.pages.AbstractPage;

public class GeneralSettingsPage extends AbstractPage {

    private String generalSettingsButton = "//span[contains(text(),'General Settings')]";

    public GeneralSettingsPage clickGeneralSettingsButton() {
        waitForElementClickable(getElementBy(generalSettingsButton));
        getElement(generalSettingsButton).click();
        return this;
    }
}
