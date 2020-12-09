package webNora.pages.noraGoPages;

import org.openqa.selenium.WebElement;
import webNora.pages.AbstractPage;

import java.awt.*;

public class NoraGoWebPage extends AbstractPage {

    private String emailField = "//input[@id='email']";
    private String passwordField = "//input[@id='password']";
    private String loginButton = "//i[contains(text(),'send')]";
    private String email = "sector@mail.ru";
    private String password = "Aleksandr123";
    private String text = "//button[contains(text(),'SETTINGS')]";

    public NoraGoWebPage openNoraGo() throws AWTException {
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
        sleep(5000);
        getScreen();
        return this;
    }

    public NoraGoWebPage testText() throws InterruptedException {
        sleep(5000);
        getScreen();
        waitForElementVisible(getElementBy(text));
        WebElement element = getElement(text);
        System.out.println(element.getText());
        return this;
    }
}
