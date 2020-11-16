package nora.web.pages.packagePages;

import nora.web.pages.AbstractPage;

public class AddPackagePage extends AbstractPage {

    private String packageButton = "//body/div[1]/div[1]/aside[1]/div[1]/div[2]/ul[2]/li[1]/a[1]/span[1]";
    private String addButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/a[1]/i[1]";
    private String namePackageField = "//input[@id='name']";
    private String saveButton = "//button[contains(text(),'Save')]";
    private String checkBoxPC = "//input[@id='platform-PC']";
    private String checkBoxIOS = "//label[contains(text(),'iOS')]";
    private String checkBoxAndroid = "//label[contains(text(),'Android')]";
    private String checkBoxSamsungTV = "//label[contains(text(),'SamsungTV')]";
    private String checkBoxOthers = "//input[@id='platform-Others']";
    private String checkBoxWeb = "//input[@id='platform-WEB']";

    public AddPackagePage clickPackageMod() {
        waitForElementClickable(getElementBy(packageButton));
        getElement(packageButton).click();
        return this;
    }

    public AddPackagePage clickAddButton() {
        waitForElementClickable(getElementBy(addButton));
        getElement(addButton).click();
        return this;
    }

    public AddPackagePage enterNamePackage() {
        getElement(namePackageField).sendKeys("TestPackage" + (int) (Math.random() * 999));
        return this;
    }

    public AddPackagePage selectPlatform(){
        getElement(checkBoxPC).click();
        getElement(checkBoxIOS).click();
        getElement(checkBoxAndroid).click();
        getElement(checkBoxSamsungTV).click();
        getElement(checkBoxOthers).click();
        getElement(checkBoxWeb).click();
        return this;
    }

    public AddPackagePage clickSaveButton() {
        getElement(saveButton).click();
        return this;
    }


}
