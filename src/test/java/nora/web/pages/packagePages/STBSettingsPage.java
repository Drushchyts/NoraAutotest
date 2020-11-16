package nora.web.pages.packagePages;

import nora.web.pages.AbstractPage;

public class STBSettingsPage extends AbstractPage {

    private String stbSettingsButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/a[4]";
    private String timeZoneField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/span[2]/span[1]";
    private String selectTimeZone = "//span[contains(text(),'Europe/Jersey')]";
    private String pinCodeField = "//input[@id='pincode']";
    private String screenSaverField = "//input[@id='screensaver']";
    private String RainbowBox = "//input[@id='link-Rainbow']";
    private String DarkForceBox = "//input[@id='link-DarkForce']";
    private String RainbowRadio = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/form[1]/div[1]/div[9]/div[1]/div[1]/label[1]";
    private String DarkForceRadio = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/form[1]/div[1]/div[10]/div[1]/div[1]/label[1]";
    private String colorButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/form[1]/div[2]/ul[1]/li[2]/input[1]";
    private String colorField = "//input[@id='colorPicker']";
    private String updateButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/form[1]/div[3]/div[1]/div[1]/fieldset[1]/button[1]";

    public STBSettingsPage clickStbSettingsButton() {
        waitForElementClickable(getElementBy(stbSettingsButton));
        getElement(stbSettingsButton).click();
        return this;
    }

    public STBSettingsPage enterTimeZone() {
        waitForElementClickable(getElementBy(timeZoneField));
        getElement(timeZoneField).click();
        waitForElementClickable(getElementBy(selectTimeZone));
        getElement(selectTimeZone).click();
        return this;
    }

    public STBSettingsPage enterPinCode() {
        getElement(pinCodeField).sendKeys("5456");
        return this;
    }

    public STBSettingsPage enterScreenSaver() throws InterruptedException {
        getElement(screenSaverField).clear();
        sleep1000();
        getElement(screenSaverField).sendKeys("222");
        return this;
    }

    public STBSettingsPage selectThemesBox() throws InterruptedException {
        getElement(RainbowBox).click();
        getElement(DarkForceBox).click();
        jsScroll();
        sleep1000();
        getElement(RainbowRadio).click();
        getElement(DarkForceRadio).click();
        jsScroll();
        jsScroll();
        return this;
    }

    public STBSettingsPage selectColorApp() throws InterruptedException {
        getElement(colorButton).click();
        getElement(colorField).sendKeys("370b0b");
        sleep1000();
        jsScroll();
        return this;
    }

    public STBSettingsPage clickUpdateButton() {
        getElement(updateButton).click();
        return this;
    }

}
