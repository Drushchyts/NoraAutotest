package webNora.helpers.usersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.usersPages.AddUserPage;

public class AddUserHelper extends AbstractHelper {

    AddUserPage addUserPage = new AddUserPage();

    public AddUserHelper clickUsers() {
        addUserPage.clickUsersModButton();
        return this;
    }
}
