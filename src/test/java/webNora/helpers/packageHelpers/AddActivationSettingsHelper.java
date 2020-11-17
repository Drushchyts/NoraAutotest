package webNora.helpers.packageHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.packagePages.AddActivationSettingsPage;

public class AddActivationSettingsHelper extends AbstractHelper {

    AddActivationSettingsPage addActivationSettingsPage = new AddActivationSettingsPage();

    public AddActivationSettingsHelper paymentSets() throws InterruptedException {
        addActivationSettingsPage.clickActivationSettingsButton()
                .clickAddPaymentSetButton()
                .enterName()
                .enterDescription()
                .clickSaveButton();
        Thread.sleep(2000);// may not work by button cancel
        addActivationSettingsPage.clickCancelButton();
        return this;
    }

    public AddActivationSettingsHelper paymentServices() throws InterruptedException {
        addActivationSettingsPage.clickPaymentServicesButton();
        return this;
    }

    public AddActivationSettingsHelper currencies() throws InterruptedException {
        addActivationSettingsPage.clickCurrenciesButton();
        return this;
    }

    public AddActivationSettingsHelper currencyConverters() throws InterruptedException {
        addActivationSettingsPage.clickCurrencyConverterButton();
        return this;
    }

    public AddActivationSettingsHelper generalSettings() throws InterruptedException {
        addActivationSettingsPage.clickGeneralSettingsButton();
        return this;
    }
}
