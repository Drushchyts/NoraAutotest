package webNora.pages.noraGoPages;

import webNora.pages.AbstractPage;

public class NoraGoWebPage extends AbstractPage {

    private String emailField = "//input[@id='email']";
    private String passwordField = "//input[@id='password']";
    private String loginButton = "//i[contains(text(),'send')]";
    private String email = "sector@mail.ru";
    private String password = "Aleksandr123";
    private String text = "//button[contains(text(),'SETTINGS')]";

    public NoraGoWebPage openNoraGo() {
        openNewWindow();
        openNewTab();
        navigateNoraGo();
        return this;
    }

    public NoraGoWebPage enterLoginAndPassword() {
        waitForElementVisible(getElementBy(emailField));
        getElement(emailField).sendKeys(email);
        getElement(passwordField).sendKeys(password);
        return this;
    }

    public NoraGoWebPage clickLogin() throws InterruptedException {
        waitForElementClickable(getElementBy(loginButton));
        getElement(loginButton).click();
        return this;
    }

}
