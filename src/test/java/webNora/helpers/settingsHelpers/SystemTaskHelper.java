package webNora.helpers.settingsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.settingsPages.GeneralSettingsPage;
import webNora.pages.settingsPages.SystemTaskPage;

public class SystemTaskHelper extends AbstractHelper {

    SystemTaskPage systemTaskPage = new SystemTaskPage();

    public SystemTaskHelper systemTask() {
        systemTaskPage.clickSystemTaskButton();
        return this;
    }
}
