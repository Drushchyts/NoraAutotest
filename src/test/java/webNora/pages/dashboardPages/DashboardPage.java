package webNora.pages.dashboardPages;

import webNora.pages.AbstractPage;

public class DashboardPage extends AbstractPage {

    private String dashboardModButton = "//span[contains(text(),'Dashboard')]";

    public DashboardPage clickDashboardButton() {
        waitForElementClickable(getElementBy(dashboardModButton));
        getElement(dashboardModButton).click();
        return this;
    }
}
