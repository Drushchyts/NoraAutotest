package webNora.pages.noraGoPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class TvNoraPage extends AbstractPage {

    private String tvNoraButton = "//header/div[4]/ul[1]/li[1]/a[1]";
    private String playerField = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]";

    public TvNoraPage clickTvNoraButton() {
        waitForElementClickable(getElementBy(tvNoraButton));
        getElement(tvNoraButton).click();
        return this;
    }

    public TvNoraPage checkPlayer() throws InterruptedException {
        sleep(3000);
        waitForElementVisible(getElementBy(playerField));
        WebElement element = getElement(playerField);
        Assert.assertTrue(element.isDisplayed(), "Player is not displayed");
        return this;
    }
}
