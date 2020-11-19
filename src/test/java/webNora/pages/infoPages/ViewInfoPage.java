package webNora.pages.infoPages;

import webNora.pages.AbstractPage;

public class ViewInfoPage extends AbstractPage {

    private String infoModButton = "//body/div[1]/div[1]/aside[1]/div[1]/div[2]/ul[7]/li[2]/a[1]/span[1]";


    public ViewInfoPage clickInfoModButton() {
        getElement(infoModButton).click();
        return this;
    }

}
