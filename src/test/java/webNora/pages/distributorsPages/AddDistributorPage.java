package webNora.pages.distributorsPages;

import webNora.pages.AbstractPage;

public class AddDistributorPage extends AbstractPage {

    private String distributorsButton = "//span[contains(text(),'Distributors')]";

    public AddDistributorPage clickDistributorsModButton() {
        waitForElementClickable(getElementBy(distributorsButton));
        getElement(distributorsButton).click();
        return this;
    }
}
