package webNora.pages.packagePages;

import webNora.pages.AbstractPage;

public class AddActivationSettingsPage extends AbstractPage {

    private String activationSettingsButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/a[2]";
    private String addPaymentSetButton = "//a[contains(text(),'Add New')]";
    private String nameField = "//input[@id='name']";
    private String descriptionField = "//textarea[@id='desc']";
    private String saveButton = "//button[@id='in-save1']";
    private String cancelButton = "//a[@id='in-cancel']";
    private String paymentServicesButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]";
    private String currenciesButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[3]/a[1]";
    private String currencyConvertersButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[4]/a[1]";
    private String generalSettingsButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[5]/a[1]";

    public AddActivationSettingsPage clickActivationSettingsButton() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementClickable(getElementBy(activationSettingsButton));
        getElement(activationSettingsButton).click();
        return this;
    }

    public AddActivationSettingsPage clickAddPaymentSetButton() {
        waitForElementClickable(getElementBy(addPaymentSetButton));
        getElement(addPaymentSetButton).click();
        return this;
    }

    public AddActivationSettingsPage enterName() {
        getElement(nameField).sendKeys("Test Name Settings");
        return this;
    }

    public AddActivationSettingsPage enterDescription() {
        getElement(descriptionField).sendKeys("Test Description");
        return this;
    }

    public AddActivationSettingsPage clickSaveButton() {
        getElement(saveButton).click();
        return this;
    }

    public AddActivationSettingsPage clickCancelButton() {
        waitForElementClickable(getElementBy(cancelButton));
        getElement(cancelButton).click();
        return this;
    }

    public AddActivationSettingsPage clickPaymentServicesButton() throws InterruptedException {
        sleep1000();
        getElement(paymentServicesButton).click();
        return this;
    }

    public AddActivationSettingsPage clickCurrenciesButton() throws InterruptedException {
        sleep1000();
        getElement(currenciesButton).click();
        return this;
    }

    public AddActivationSettingsPage clickCurrencyConverterButton() throws InterruptedException {
        sleep1000();
        getElement(currencyConvertersButton).click();
        return this;
    }

    public AddActivationSettingsPage clickGeneralSettingsButton() throws InterruptedException {
        sleep1000();
        getElement(generalSettingsButton).click();
        return this;
    }
}
