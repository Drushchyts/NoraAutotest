package webNora.helpers.dashboardHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.dashboardPages.SetupDashboardPage;

public class SetupDashboardHelper extends AbstractHelper {

    SetupDashboardPage setupDashboardPage = new SetupDashboardPage();

    public SetupDashboardHelper openSetupDashboard() {
        setupDashboardPage.clickSetupButton();
        return this;
    }
}
