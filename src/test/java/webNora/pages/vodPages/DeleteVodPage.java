package webNora.pages.vodPages;

import webNora.pages.AbstractPage;

public class DeleteVodPage extends AbstractPage {

    private String deleteVodButton = "//tbody/tr[1]/td[9]/div[1]/button[1]/span[1]";
    private String agreeDeleteButton = "//button[contains(text(),'Yes')]";

    public DeleteVodPage clickDeleteVodButton() {
        getElement(deleteVodButton).click();
        return this;
    }

    public DeleteVodPage clickAgreeDeleteButton() {
        waitForElementClickable(getElementBy(agreeDeleteButton));
        getElement(agreeDeleteButton).click();
        return this;
    }
}
