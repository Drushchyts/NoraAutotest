package webNora.helpers.packageHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.packagePages.STBSettingsPage;

public class STBSettingsHelper extends AbstractHelper {

    STBSettingsPage stbSettingsPage = new STBSettingsPage();

    public STBSettingsHelper addStbSettings() throws InterruptedException {
        stbSettingsPage.clickStbSettingsButton()
                .enterTimeZone()
                .enterPinCode()
                .enterScreenSaver()
                .selectThemesBox()
                .selectColorApp()
                .clickUpdateButton();
        return this;
    }

}
