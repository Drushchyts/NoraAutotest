package webNora.pages.settingsPages;

import webNora.pages.AbstractPage;

public class SystemTaskPage extends AbstractPage {


    private String systemTaskButton = "//span[contains(text(),'System Tasks')]";

    public SystemTaskPage clickSystemTaskButton() {
        waitForElementClickable(getElementBy(systemTaskButton));
        getElement(systemTaskButton).click();
        return this;
    }
}
