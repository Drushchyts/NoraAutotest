package webNora.pages.tvChannelsPages;

import webNora.pages.AbstractPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddTvChannelsPage extends AbstractPage {

    private String tvChannelsButton = "//body/div[1]/div[1]/aside[1]/div[1]/div[2]/ul[4]/li[1]";
    private String addChannelButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/a[1]";
    private String channelNameField = "//input[@id='name']";
    private String numberField = "//input[@id='numberof']";
    private String epgField = "//input[@id='epgid']";
    private String languageField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[4]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String selectLanguage = "//span[contains(text(),'English')]";
    private String stbField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
    private String saveButton = "//button[contains(text(),'Save')]";
    private String searchField = "//input[@id='_searchBar']";
    private String searchButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[3]/form[1]/button[1]/i[1]";
    private String nameChannel = "Test Name";
    private String checkField = "//tbody/tr[1]/td[3]/a[1]";

    public AddTvChannelsPage clickTvChannelsMod() {
        waitForElementClickable(getElementBy(tvChannelsButton));
        getElement(tvChannelsButton).click();
        return this;
    }

    public AddTvChannelsPage clickAddChannelButton() throws InterruptedException {
        sleep(3000);
        waitForElementVisible(getElementBy(addChannelButton));
        getElement(addChannelButton).click();
        return this;
    }

    public AddTvChannelsPage enterName() {
        waitForElementVisible(getElementBy(channelNameField));
        getElement(channelNameField).sendKeys(nameChannel);
        return this;
    }

    public AddTvChannelsPage enterNumber() {
        getElement(numberField).sendKeys("4");
        return this;
    }

    public AddTvChannelsPage enterEpg() {
        getElement(epgField).clear();
        getElement(epgField).sendKeys("456");
        return this;
    }

    public AddTvChannelsPage selectLanguage() {
        getElement(languageField).click();
        waitForElementClickable(getElementBy(selectLanguage));
        getElement(selectLanguage).click();
        return this;
    }

    public AddTvChannelsPage enterStb() {
        getElement(stbField).sendKeys("https://mkdev.setplex.net/nora/channels/tv/new");
        return this;
    }

    public AddTvChannelsPage clickSaveButton() {
        jsScroll();
        getElement(saveButton).click();
        return this;
    }

    public AddTvChannelsPage enterSearchChannel() throws InterruptedException {
        waitForElementVisible(getElementBy(searchField));
        sleep(1000);
        getElement(searchField).sendKeys(nameChannel);
        sleep(1000);
        getElement(searchButton).click();
        return this;
    }

    public AddTvChannelsPage checkCreateChannel() throws InterruptedException {
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        sleep(1000);
        Assert.assertEquals(nameChannel, element.getText());
        return this;
    }
}
