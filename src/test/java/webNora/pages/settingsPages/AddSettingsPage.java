package webNora.pages.settingsPages;

import webNora.pages.AbstractPage;

public class AddSettingsPage extends AbstractPage {

    private String settingModButton = "//body/div[1]/div[1]/aside[1]/div[1]/div[2]/ul[8]/li[1]/a[1]/span[1]";

    public AddSettingsPage clickSettingsModButton() {
        getElement(settingModButton).click();
        return this;
    }
}
