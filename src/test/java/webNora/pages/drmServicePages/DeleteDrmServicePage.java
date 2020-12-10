package webNora.pages.drmServicePages;

import webNora.pages.AbstractPage;

public class DeleteDrmServicePage extends AbstractPage {

    private String deleteButton = "//tbody/tr[1]/td[5]/div[1]/button[1]/span[1]";
    private String agreeDeleteDrmButton = "//button[contains(text(),'Yes')]";

    public DeleteDrmServicePage clickDeleteButton() {
        waitForElementClickable(getElementBy(deleteButton));
        getElement(deleteButton).click();
        return this;
    }

    public DeleteDrmServicePage clickAgreeButton() {
        waitForElementClickable(getElementBy(agreeDeleteDrmButton));
        getElement(agreeDeleteDrmButton).click();
        return this;
    }
}
