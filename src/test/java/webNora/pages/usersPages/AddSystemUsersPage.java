package webNora.pages.usersPages;

import webNora.pages.AbstractPage;

import java.awt.*;
import java.io.StringReader;

public class AddSystemUsersPage extends AbstractPage {

    private String addUserButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
    private String firstNameField = "//input[@id='firstName']";
    private String lastNameField = "//input[@id='lastName']";
    private String passwordOneField = "//input[@id='password']";
    private String passwordTwoField = "//input[@id='password2']";
    private String ruleField = "//select[@id='role']";
    private String selectRuleField = "//option[contains(text(),'Managers TV Cosmo + AsteraTV')]";
    private String emailField = "//input[@id='email']";
    private String phoneNumberField = "//input[@id='pphone']";
    private String companyField = "//input[@id='company']";
    private String locationField = "//input[@id='location']";
    private String maxFailedLogin = "//input[@id='pmaxfail']";
    private String boxSuperAdmin = "//input[@id='superadmin']";
    private String createButton = "//button[@id='p-save1']";
    private String cancelButton = "//*[@id=\"p-cancel\"]";


    public AddSystemUsersPage clickAddUserButton() {
        waitForElementClickable(getElementBy(addUserButton));
        getElement(addUserButton).click();
        return this;
    }

    public AddSystemUsersPage enterFirstName() {
        waitForElementVisible(getElementBy(firstNameField));
        getElement(firstNameField).sendKeys("First Name");
        return this;
    }

    public AddSystemUsersPage enterLastName() {
        getElement(lastNameField).sendKeys("Last Name");
        return this;
    }

    public AddSystemUsersPage enterPassword() {
        getElement(passwordOneField).sendKeys("Password123");
        getElement(passwordTwoField).sendKeys("Password123");
        return this;
    }

    public AddSystemUsersPage selectRule() {
        getElement(ruleField).click();
        waitForElementClickable(getElementBy(selectRuleField));
        getElement(selectRuleField).click();
        return this;
    }

    public AddSystemUsersPage enterEmail() {
        getElement(emailField).sendKeys("email" + (int) (Math.random() * 999) + "@mail.ru");
        return this;
    }

    public AddSystemUsersPage enterPhoneNumber() {
        getElement(phoneNumberField).sendKeys("80292777777");
        return this;
    }

    public AddSystemUsersPage enterCompany() {
        getElement(companyField).sendKeys("Shell");
        return this;
    }

    public AddSystemUsersPage enterLocation() {
        getElement(locationField).sendKeys("Location");
        return this;
    }

    public AddSystemUsersPage enterMaxFailedLogin() {
        getElement(maxFailedLogin).clear();
        getElement(maxFailedLogin).sendKeys("5");
        return this;
    }

//    public AddSystemUsersPage clickSuperAdminCheckBox() {
//        getElement(boxSuperAdmin).click();
//        return this;
//    }

    public AddSystemUsersPage clickCreateUserButton() {
        getElement(createButton).click();
        return this;
    }

    public AddSystemUsersPage clickCancelUserButton() throws InterruptedException {
        Thread.sleep(2000);
        getElement(cancelButton).click();
        return this;
    }


}
