package webNora.helpers.dashboardHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.dashboardPages.DashboardPage;

public class DashboardHelper extends AbstractHelper {

    DashboardPage dashboardPage = new DashboardPage();

    public DashboardHelper dashboard() {
        dashboardPage.clickDashboardButton();
        return this;
    }

}
