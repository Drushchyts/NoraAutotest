package webNora.helpers.subscribersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.subscribersPages.CustomStreamsPage;

public class CustomStreamsHelper extends AbstractHelper {

    CustomStreamsPage customStreamsPage = new CustomStreamsPage();

    public CustomStreamsHelper checkCustomerPage() throws InterruptedException {
        customStreamsPage.clickCustomerStreamButton()
                .checkCustomerPage();
        return this;
    }
}
