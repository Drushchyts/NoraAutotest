package webNora.helpers.noraGoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.noraGoPages.LogOutNoraGoPage;

public class LogOutNoraGoHelper extends AbstractHelper {

    LogOutNoraGoPage logOutNoraGoPage = new LogOutNoraGoPage();

    public LogOutNoraGoHelper logOutNoraWeb() {
        logOutNoraGoPage.clickSettingsButton()
                .clickLogOutButton()
                .clickLogOutButton();
        return this;
    }
}
