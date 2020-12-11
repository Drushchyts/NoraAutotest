package webNora.pages.categoriesPages;

import webNora.pages.AbstractPage;

public class DeleteTvCategoriesPage extends AbstractPage {

    private String deleteTvButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[2]/div[1]/uib-accordion[1]/div[1]/div[1]/div[1]/h4[1]/a[1]/span[1]/div[1]/div[5]/div[1]/a[2]";
    private String agreeTvButton = "//button[contains(text(),'Yes')]";


    public DeleteTvCategoriesPage clickDeleteRadioButton() {
        waitForElementClickable(getElementBy(deleteTvButton));
        getElement(deleteTvButton).click();
        return this;
    }

    public DeleteTvCategoriesPage clickAgreeRadioButton() {
        waitForElementClickable(getElementBy(agreeTvButton));
        getElement(agreeTvButton).click();
        return this;

    }
}
