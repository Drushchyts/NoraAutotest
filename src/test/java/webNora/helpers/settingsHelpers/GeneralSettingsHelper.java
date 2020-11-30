package webNora.helpers.settingsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.settingsPages.GeneralSettingsPage;

public class GeneralSettingsHelper extends AbstractHelper {

    GeneralSettingsPage generalSettingsPage = new GeneralSettingsPage();

    public GeneralSettingsHelper generalSettings() {
        generalSettingsPage.clickGeneralSettingsButton();
        return this;
    }
}
