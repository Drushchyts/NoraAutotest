package webNora.pages.shoppingCardPages;

import webNora.pages.AbstractPage;

public class SelectMonthPage extends AbstractPage {

    private String oneMonthButton = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]";

    public SelectMonthPage clickOneMonthButton() {
        waitForElementClickable(getElementBy(oneMonthButton));
        getElement(oneMonthButton).click();
        return this;
    }
}
