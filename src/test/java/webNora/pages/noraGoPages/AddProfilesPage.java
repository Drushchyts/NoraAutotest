package webNora.pages.noraGoPages;

import webNora.pages.AbstractPage;

public class AddProfilesPage extends AbstractPage {

    private String settingsButton = "//button[contains(text(),'SETTINGS')]";
    private String profilesButton = "//header/div[4]/ul[1]/li[7]/span[1]/ul[1]/li[2]/a[1]";
    private String newProfilesButton = "//span[contains(text(),'New Profile')]";
    private String nameProfileFieldOne = "//label[contains(text(),'Profile Name')]";
    private String nameProfileFieldTwo = "//input[@id='profile']";
    private String nameProfile = "TestProfile123";
    private String addButton = "//header/div[7]/div[1]/div[2]/div[1]/form[1]/div[2]/button[1]";
    private String modalButton = "//header/div[@id='profilesModal']/div[1]/a[1]/i[1]";

    public AddProfilesPage clickSettingsButton() throws InterruptedException {
        sleep(3000);
        getElement(settingsButton).click();
        return this;
    }

    public AddProfilesPage clickProfilesButton() throws InterruptedException {
        sleep(3000);
        waitForElementVisible(getElementBy(profilesButton));
        getElement(profilesButton).click();
        return this;
    }

    public AddProfilesPage clickNewProfilesButton() throws InterruptedException {
        sleep(1000);
        getElement(newProfilesButton).click();
        return this;
    }

    public AddProfilesPage enterNameProfile() throws InterruptedException {
        sleep(1000);
        getElement(nameProfileFieldOne).click();
        sleep(2000);
        getElement(nameProfileFieldTwo).sendKeys(nameProfile);
        return this;
    }

    public AddProfilesPage clickAddButton() {
        getElement(addButton).click();
        return this;
    }

    public AddProfilesPage closeModalProfiles() {
        waitForElementClickable(getElementBy(modalButton));
        getElement(modalButton).click();
        return this;
    }
}
