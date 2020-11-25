package webNora.helpers.externalUserHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.externalUserPages.AddExternalUserPage;

public class AddExternalUserHelper extends AbstractHelper {

    AddExternalUserPage addExternalUserPage = new AddExternalUserPage();

    public AddExternalUserHelper clickExternalUser() {
        addExternalUserPage.clickExternalUserModButton();
        return this;
    }
}
