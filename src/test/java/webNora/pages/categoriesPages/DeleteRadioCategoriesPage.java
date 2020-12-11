package webNora.pages.categoriesPages;

import webNora.pages.AbstractPage;

public class DeleteRadioCategoriesPage extends AbstractPage {

    private String deleteRadioButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[2]/div[1]/uib-accordion[1]/div[1]/div[1]/div[1]/h4[1]/a[1]/span[1]/div[1]/div[5]/div[1]/a[2]";
    private String agreeRadioButton = "//button[contains(text(),'Yes')]";


    public DeleteRadioCategoriesPage clickDeleteTvButton() {
        waitForElementClickable(getElementBy(deleteRadioButton));
        getElement(deleteRadioButton).click();
        return this;
    }

    public DeleteRadioCategoriesPage clickAgreeTvButton() {
        waitForElementClickable(getElementBy(agreeRadioButton));
        getElement(agreeRadioButton).click();
        return this;


    }
}
