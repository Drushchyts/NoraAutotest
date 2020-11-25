package webNora.pages.usersPages;

import webNora.pages.AbstractPage;

public class AddUserPage extends AbstractPage {

    private String infoUsersButton = "//span[contains(text(),'Users')]";


    public AddUserPage clickUsersModButton() {
        waitForElementClickable(getElementBy(infoUsersButton));
        getElement(infoUsersButton).click();
        return this;
    }

}
