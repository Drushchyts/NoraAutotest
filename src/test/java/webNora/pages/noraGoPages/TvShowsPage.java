package webNora.pages.noraGoPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class TvShowsPage extends AbstractPage {

    private String tvShowButton = "//a[contains(text(),'tv shows')]";
    private String searchField = "//input[@id='search']";
    private String searchName = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]";

    public TvShowsPage clickTvShowButton() {
        waitForElementClickable(getElementBy(tvShowButton));
        getElement(tvShowButton).click();
        return this;
    }

    public TvShowsPage enterSearchName() throws InterruptedException {
        sleep(2000);
        getElement(searchField).sendKeys("test" + Keys.ENTER);
        return this;
    }

    public TvShowsPage checkTvShow() {
        waitForElementVisible(getElementBy(searchField));
        WebElement element = getElement(searchField);
        Assert.assertTrue(element.isDisplayed());
        return this;
    }
}
