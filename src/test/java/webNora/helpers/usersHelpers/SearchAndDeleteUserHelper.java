package webNora.helpers.usersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.usersPages.SearchAndDeleteUserPage;

public class SearchAndDeleteUserHelper extends AbstractHelper {

    SearchAndDeleteUserPage searchAndDeleteUserPage = new SearchAndDeleteUserPage();

    public SearchAndDeleteUserHelper searchAndDeleteUser() throws InterruptedException {
        searchAndDeleteUserPage.clickSearchInputButton()
                .enterSearchInput()
                .checkUser()
                .deleteUser();
        return this;
    }
}
