package webNora.pages.settingsPages;

import webNora.pages.AbstractPage;

public class PaymentSystemPage extends AbstractPage {

    private String paymentSystemButton = "//span[contains(text(),'Payment System')]";

    public PaymentSystemPage clickPaymentSystemButton() {
        waitForElementClickable(getElementBy(paymentSystemButton));
        getElement(paymentSystemButton).click();
        return this;
    }
}
