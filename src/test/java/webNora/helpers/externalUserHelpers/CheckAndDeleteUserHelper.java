package webNora.helpers.externalUserHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.externalUserPages.CheckAndDeleteUserPage;

public class CheckAndDeleteUserHelper extends AbstractHelper {

    CheckAndDeleteUserPage checkAndDeleteUserPage = new CheckAndDeleteUserPage();

    public CheckAndDeleteUserHelper verifyCreated() {
        checkAndDeleteUserPage.enterNameForSearch()
                .checkUser();
        return this;
    }

    public CheckAndDeleteUserHelper deleteUserExternal() throws InterruptedException {
        checkAndDeleteUserPage.deleteExternalUser();
        return this;
    }
}
