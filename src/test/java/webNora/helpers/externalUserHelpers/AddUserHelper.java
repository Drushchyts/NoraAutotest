package webNora.helpers.externalUserHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.externalUserPages.AddUserPage;

public class AddUserHelper extends AbstractHelper {

    AddUserPage addUserPage = new AddUserPage();

    public AddUserHelper addUser() throws InterruptedException {
        addUserPage.clickAddUserButton()
                .enterNameUser()
                .enterLogin()
                .enterToken()
                .selectPackageUser()
                .clickCreateUserBUtton();

        return this;
    }
}
