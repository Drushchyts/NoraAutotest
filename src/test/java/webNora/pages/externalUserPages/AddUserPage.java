package webNora.pages.externalUserPages;

import org.apache.http.impl.client.StandardHttpRequestRetryHandler;
import webNora.pages.AbstractPage;

public class AddUserPage extends AbstractPage {

    private String addUserButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
    private String nameField = "//input[@id='name']";
    private String loginField = "//input[@id='login']";
    private String tokenField = "//input[@id='token']";
    private String packageField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/form[1]/fieldset[2]/div[4]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String selectPackage = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/form[1]/fieldset[2]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/div[1]/span[1]";
    private String createUserButton = "//button[@id='p-save1']";

    public AddUserPage clickAddUserButton() {
        waitForElementClickable(getElementBy(addUserButton));
        getElement(addUserButton).click();
        return this;
    }

    public AddUserPage enterNameUser() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementVisible(getElementBy(nameField));
        getElement(nameField).sendKeys("TestName");
        return this;
    }

    public AddUserPage enterLogin() {
        getElement(loginField).sendKeys("TestLogin");
        return this;
    }

    public AddUserPage enterToken() {
        getElement(tokenField).sendKeys("TestToken");
        return this;
    }

    public AddUserPage selectPackageUser() {
        getElement(packageField).click();
        waitForElementClickable(getElementBy(selectPackage));
        getElement(selectPackage).click();
        return this;
    }

    public AddUserPage clickCreateUserBUtton() {
        getElement(createUserButton).click();
        return this;
    }
}
