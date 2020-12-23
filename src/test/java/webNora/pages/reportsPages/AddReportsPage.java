package webNora.pages.reportsPages;

import webNora.pages.AbstractPage;

public class AddReportsPage extends AbstractPage {

    private String reportsButton = "//body/div[1]/div[1]/aside[1]/div[1]/div[2]/ul[8]/li[1]/a[1]/span[1]";

    public AddReportsPage clickReportsButton(){
        waitForElementClickable(getElementBy(reportsButton));
        getElement(reportsButton).click();
        return this;
    }
}
