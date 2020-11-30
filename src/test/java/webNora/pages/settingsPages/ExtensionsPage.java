package webNora.pages.settingsPages;

import webNora.pages.AbstractPage;

public class ExtensionsPage extends AbstractPage {

    private String extensionsButton = "//span[contains(text(),'Extensions')]";

    public ExtensionsPage clickExtensionsButton() {
        waitForElementClickable(getElementBy(extensionsButton));
        getElement(extensionsButton).click();
        return this;
    }
}
