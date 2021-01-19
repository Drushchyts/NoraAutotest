package webNora.pages.shoppingCardPages;

import webNora.pages.AbstractPage;

public class SelectPackagePage extends AbstractPage {

    private String ThreeInOnePlanButton = "//body/div[@id='sc-app-container']/div[1]/div[3]/div[1]/div[2]/a[1]";
    private String hdBoxButton = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/img[1]";
    private String additionChanelButton = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]";
    private String continueButton = "//a[contains(text(),'Vazhdo')]";
    private String NameField = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]";
    private String surnameField = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]";
    private String emailField = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]";
    private String phoneField = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[2]/form[1]/div[4]";
    private String addressField = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[2]/form[1]/div[5]";
    private String cityField = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[2]/form[1]/div[6]";
    private String stateField = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[2]/form[1]/div[7]";
    private String zipField = "//body/div[@id='sc-app-container']/div[1]/div[2]/div[1]/div[2]/form[1]/div[8]";


    public SelectPackagePage clickThreeInOnePlanButton() {
        waitForElementClickable(getElementBy(ThreeInOnePlanButton));
        getElement(ThreeInOnePlanButton).click();
        return this;
    }

    public SelectPackagePage selectPackageType() {
        waitForElementVisible(getElementBy(hdBoxButton));
        getElement(hdBoxButton).click();
        getElement(additionChanelButton).click();
        return this;
    }

    public SelectPackagePage clickContinueButton() {
        getElement(continueButton).click();
        return this;
    }
}
