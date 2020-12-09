package webNora.helpers.subscribersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.subscribersPages.AddSubscriberPage;

public class AddSubscriberHelper extends AbstractHelper {

    AddSubscriberPage addSubscriberPage = new AddSubscriberPage();

    public AddSubscriberHelper clickSubscriberButton() throws InterruptedException {
        addSubscriberPage.clickSubscriberMod();
        return this;
    }

    public AddSubscriberHelper createSubscriber() {
        addSubscriberPage.clickAddButton()
                .selectPackage()
                .enterPinCode()
                .enterUsername()
                .enterPassword()
                .enterFirstName()
                .enterLastName()
                .enterEmail()
                .enterPhone()
                .enterAddress()
                .enterCity()
                .enterZipCode()
                .selectCountry()
                .enterState()
                .selectLanguage()
                .enterDateOfBirth()
                .selectTimeZone()
                .clickSaveButton();
        return this;
    }
}
