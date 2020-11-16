package nora.web.helpers.packageHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.packagePages.AddPackagePage;
import nora.web.pages.packagePages.AddSubInPackPage;
import nora.web.pages.subscribersPages.AddSubscriberPage;

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
