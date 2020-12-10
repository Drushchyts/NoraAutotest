package webNora.helpers.noraGoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.noraGoPages.AddProfilesPage;

public class AddProfilesHelper extends AbstractHelper {

    AddProfilesPage addProfilesPage = new AddProfilesPage();

    public AddProfilesHelper addNewProfiles() throws InterruptedException {
        addProfilesPage.clickSettingsButton()
                .clickProfilesButton()
                .clickNewProfilesButton()
                .enterNameProfile()
                .clickAddButton()
                .closeModalProfiles();
        return this;
    }
}
