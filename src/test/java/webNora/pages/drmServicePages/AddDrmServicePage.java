package webNora.pages.drmServicePages;

import webNora.pages.AbstractPage;

public class AddDrmServicePage extends AbstractPage {

    private String drmServiceButton = "//span[contains(text(),'DRM Service')]";
    private String addDRMServiceButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
    private String nameField = "//input[@id='name']";
    private String drmProviderFiled = "//select[@id='accountType']";
    private String selectDRMProvider = "//select[contains(text(),'EZDRM')]";
    private String pxValue = "//input[@id='pxValue']";
    private String createButton = "//button[contains(text(),'Create')]";


    public AddDrmServicePage clickDrmServiceMod() {
        getElement(drmServiceButton).click();
        return this;
    }

    public AddDrmServicePage clickAddDRMServiceButton() {
        getElement(addDRMServiceButton).click();
        return this;
    }

    public AddDrmServicePage enterNameDRM() {
        getElement(nameField).sendKeys("Test Name");
        return this;
    }

    public AddDrmServicePage selectDRMProvider() {
        getElement(drmProviderFiled).click();
        getElement(selectDRMProvider).click();
        return this;
    }

    public AddDrmServicePage enterPXValue() {
        getElement(pxValue).sendKeys("12");
        return this;
    }

    public AddDrmServicePage clickCreateDRMButton() {
        getElement(createButton).click();
        return this;
    }

}
