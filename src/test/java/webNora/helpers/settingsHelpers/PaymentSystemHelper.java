package webNora.helpers.settingsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.settingsPages.PaymentSystemPage;

public class PaymentSystemHelper extends AbstractHelper {

    PaymentSystemPage paymentSystemPage = new PaymentSystemPage();

    public PaymentSystemHelper paymentSystem() {
        paymentSystemPage.clickPaymentSystemButton();
        return this;
    }
}
