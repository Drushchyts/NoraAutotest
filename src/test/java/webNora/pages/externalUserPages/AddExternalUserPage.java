package webNora.pages.externalUserPages;

import webNora.pages.AbstractPage;

public class AddExternalUserPage extends AbstractPage {

    private String externalUserButton = "//span[contains(text(),'External User')]";

    public AddExternalUserPage clickExternalUserModButton() {
        waitForElementClickable(getElementBy(externalUserButton));
        getElement(externalUserButton).click();
        return this;
    }
}
