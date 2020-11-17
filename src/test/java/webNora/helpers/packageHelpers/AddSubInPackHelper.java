package webNora.helpers.packageHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.packagePages.AddPackagePage;
import webNora.pages.subscribersPages.AddSubscriberPage;
import webNora.pages.packagePages.AddSubInPackPage;

public class AddSubInPackHelper extends AbstractHelper {

    AddSubInPackPage addSubInPackPage = new AddSubInPackPage();
    AddSubscriberPage addSubscriberPage = new AddSubscriberPage();
    AddPackagePage addPackagePage = new AddPackagePage();


    public AddSubInPackHelper clickBackButton() {
        addSubInPackPage.clickBack();
        return this;
    }


    public AddSubInPackHelper addSubscriberInPackage(){
        addSubInPackPage.clickFirstPackageOnList()
                .clickAddSubscriberButton();
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
