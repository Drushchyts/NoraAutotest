package webNora.helpers.settingsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.settingsPages.AddSettingsPage;

public class AddSettingsHelper extends AbstractHelper {

    AddSettingsPage addSettingsPage = new AddSettingsPage();

    public AddSettingsHelper clickSettingsMod() {
        addSettingsPage.clickSettingsModButton();
        return this;
    }
}
