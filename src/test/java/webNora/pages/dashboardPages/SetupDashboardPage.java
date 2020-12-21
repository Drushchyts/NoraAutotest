package webNora.pages.dashboardPages;

import webNora.pages.AbstractPage;

public class SetupDashboardPage extends AbstractPage {

    private String setupButton = "//a[contains(text(),'setup')]";

    public SetupDashboardPage clickSetupButton() {
        waitForElementClickable(getElementBy(setupButton));
        getElement(setupButton).click();
        return this;
    }
}
