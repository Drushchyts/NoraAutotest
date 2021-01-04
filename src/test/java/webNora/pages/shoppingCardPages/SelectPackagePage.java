package webNora.pages.shoppingCardPages;

import webNora.pages.AbstractPage;

public class SelectPackagePage extends AbstractPage {

    private String ThreeInOnePlanButton = "//body/div[@id='sc-app-container']/div[1]/div[3]/div[1]/div[2]/a[1]";

    public SelectPackagePage clickThreeInOnePlanButton(){
        waitForElementClickable(getElementBy(ThreeInOnePlanButton));
        getElement(ThreeInOnePlanButton).click();
        return this;
    }
}
