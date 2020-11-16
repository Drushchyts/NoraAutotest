package nora.web.pages.radioPages;

import nora.web.pages.AbstractPage;

public class AddRadioPage extends AbstractPage {

    private String radioButton = "//body/div[1]/div[1]/aside[1]/div[1]/div[2]/ul[4]/li[2]/a[1]/span[1]";

    public AddRadioPage clickRadioMod() {
        getElement(radioButton).click();
        return this;
    }
}
