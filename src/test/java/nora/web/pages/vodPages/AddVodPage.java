package nora.web.pages.vodPages;

import nora.web.pages.AbstractPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddVodPage extends AbstractPage {


    private String vodButton = "//body/div[1]/div[1]/aside[1]/div[1]/div[2]/ul[4]/li[3]/a[1]/span[1]";
    private String addVodButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
    private String titleField = "//input[@id='title']";
    private String descriptionField = "//textarea[@id='descrip']";
    private String directorsField = "//input[@id='directors']";
    private String starsField = "//textarea[@id='stars']";
    private String yearField = "//input[@id='year']";
    private String packageField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]";
    private String selectPackage = "//span[contains(text(),'1 (copy)')]";
    private String lengthClock = "//tbody/tr[2]/td[1]/input[1]";
    private String lengthMinute = "//tbody/tr[2]/td[3]/input[1]";
    private String stbField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[6]/div[1]/div[1]/input[1]";
    private String saveButton = "//button[contains(text(),'Save')]";
    private String nameVod = "Test Title";
    private String searchField = "//input[@id='_searchBar']";
    private String searchButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[3]/form[1]/button[1]/i[1]";
    private String checkField = "//a[contains(text(),'Test Title')]";

    public AddVodPage clickVodMod() {
        getElement(vodButton).click();
        return this;
    }

    public AddVodPage clickAddVodButton() {
        waitForElementClickable(getElementBy(addVodButton));
        getElement(addVodButton).click();
        return this;
    }

    public AddVodPage enterTitle() throws InterruptedException {
        sleep(2000);
        waitForElementVisible(getElementBy(titleField));
        getElement(titleField).sendKeys(nameVod);
        return this;
    }

    public AddVodPage enterDescription() {
        getElement(descriptionField).sendKeys("Test Description");
        return this;
    }

    public AddVodPage enterDirectors() {
        getElement(directorsField).sendKeys("Test Director");
        return this;
    }

    public AddVodPage enterStars() {
        getElement(starsField).sendKeys("Test Stars");
        return this;
    }

    public AddVodPage enterYear() {
        getElement(yearField).sendKeys("2012");
        return this;
    }

    public AddVodPage selectPackage() {
        getElement(packageField).click();
        waitForElementClickable(getElementBy(selectPackage));
        getElement(selectPackage).click();
        return this;
    }

    public AddVodPage enterLength() {
        getElement(lengthClock).clear();
        getElement(lengthClock).sendKeys("12");
        getElement(lengthMinute).clear();
        getElement(lengthMinute).sendKeys("15");
        return this;
    }

    public AddVodPage enterSTB() throws InterruptedException {
        jsScroll();
        getElement(stbField).sendKeys("https://mkdev.setplex.net/nora/vods/new");
        return this;
    }

    public AddVodPage clickSaveCouponsButton() {
        getElement(saveButton).click();
        return this;
    }

    public AddVodPage enterSearchVod() throws InterruptedException {
        waitForElementVisible(getElementBy(searchField));
        sleep(1000);
        getElement(searchField).sendKeys(nameVod);
        sleep(1000);
        getElement(searchButton).click();
        return this;
    }

    public AddVodPage checkCreateVod() {
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        Assert.assertEquals(nameVod, element.getText());
        return this;
    }
}
