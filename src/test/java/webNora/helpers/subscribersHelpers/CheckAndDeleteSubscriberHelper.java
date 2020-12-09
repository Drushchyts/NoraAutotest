package webNora.helpers.subscribersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.subscribersPages.CheckAndDeleteSubscriberPage;

public class CheckAndDeleteSubscriberHelper extends AbstractHelper {

    CheckAndDeleteSubscriberPage checkAndDeleteSubscriberPage = new CheckAndDeleteSubscriberPage();


    public CheckAndDeleteSubscriberHelper deleteSubscriber() throws InterruptedException {
        checkAndDeleteSubscriberPage.enterSubscriberName()
                .clickEditButton()
                .deleteSubscriber();
        return this;
    }
}
