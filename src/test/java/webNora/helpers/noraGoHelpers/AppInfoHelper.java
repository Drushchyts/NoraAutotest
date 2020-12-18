package webNora.helpers.noraGoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.noraGoPages.AppInfoPage;

public class AppInfoHelper extends AbstractHelper {

    AppInfoPage appInfoPage = new AppInfoPage();

    public AppInfoHelper checkAppInfo() throws InterruptedException {
        appInfoPage.clickSettingsButton()
                .clickAppInfoButton()
                .checkAccountID()
                .clickCloseAppInfo();
        return this;
    }
}
