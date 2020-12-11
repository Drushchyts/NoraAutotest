package webNora.pages.categoriesPages;

import webNora.pages.AbstractPage;

public class DeleteVodSeriesPage extends AbstractPage {

    private String deleteVodSeriesButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[2]/div[1]/uib-accordion[1]/div[1]/div[1]/div[1]/h4[1]/a[1]/span[1]/div[1]/div[5]/div[1]/a[2]";
    private String agreeVodSeriesButton = "//button[contains(text(),'Yes')]";


    public DeleteVodSeriesPage clickDeleteVodSeriesButton() {
        waitForElementClickable(getElementBy(deleteVodSeriesButton));
        getElement(deleteVodSeriesButton).click();
        return this;
    }

    public DeleteVodSeriesPage clickAgreeVodSeriesButton() {
        waitForElementClickable(getElementBy(agreeVodSeriesButton));
        getElement(agreeVodSeriesButton).click();
        return this;

    }
}
