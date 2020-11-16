package nora.web.helpers.subscribersHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.subscribersPages.AddSubscriberPage;

public class AddSubscriberHelper extends AbstractHelper {

    AddSubscriberPage addSubscriberPage = new AddSubscriberPage();

    public AddSubscriberHelper clickSubscriberButton() {
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
