package webNora.pages.settingsPages;

import webNora.pages.AbstractPage;

public class GeneralSettingsPage extends AbstractPage {

    private String generalSettingsButton = "//body/div[1]/div[1]/aside[1]/div[1]/div[2]/ul[8]/div[1]/ul[1]/li[1]/a[1]/span[1]";

    public GeneralSettingsPage clickGeneralSettingsButton() {
        waitForElementClickable(getElementBy(generalSettingsButton));
        getElement(generalSettingsButton).click();
        return this;
    }
}
