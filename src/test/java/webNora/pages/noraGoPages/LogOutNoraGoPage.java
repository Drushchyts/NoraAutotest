package webNora.pages.noraGoPages;

import webNora.pages.AbstractPage;

public class LogOutNoraGoPage extends AbstractPage {

    private String settingsButton = "//button[contains(text(),'SETTINGS')]";
    private String logOutButton = "//header/div[4]/ul[1]/li[7]/span[1]/ul[1]/li[3]/a[1]";
    private String agreeLogOutButton = "//button[contains(text(),'Yes, I want to log out')]";


    public LogOutNoraGoPage clickSettingsButton() {
        getElement(settingsButton).click();
        return this;
    }

    public LogOutNoraGoPage clickLogOutButton() {
        waitForElementClickable(getElementBy(logOutButton));
        getElement(logOutButton).click();
        return this;
    }

    public LogOutNoraGoPage clickAgreeLogOutButton() {
        waitForElementClickable(getElementBy(agreeLogOutButton));
        getElement(agreeLogOutButton).click();
        return this;
    }
}
