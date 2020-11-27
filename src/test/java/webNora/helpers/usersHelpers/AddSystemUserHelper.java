package webNora.helpers.usersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.usersPages.AddSystemUsersPage;

public class AddSystemUserHelper extends AbstractHelper {

    AddSystemUsersPage addSystemUsersPage = new AddSystemUsersPage();

    public AddSystemUserHelper addSystemUser() throws InterruptedException {
        addSystemUsersPage.clickAddUserButton();
        Thread.sleep(2000);
        addSystemUsersPage.enterFirstName()
                .enterLastName()
                .enterPassword()
                .selectRule()
                .enterEmail()
                .enterPhoneNumber()
                .enterCompany()
                .enterLocation()
                .enterMaxFailedLogin()
                //.clickSuperAdminCheckBox() //add rule SuperAdmin
                .clickCreateUserButton()
                .clickCancelUserButton();
        return this;
    }
}
