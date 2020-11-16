package nora.web.helpers.packageHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.packagePages.STBSettingsPage;

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
