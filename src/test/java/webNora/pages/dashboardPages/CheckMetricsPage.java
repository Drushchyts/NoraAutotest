package webNora.pages.dashboardPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class CheckMetricsPage extends AbstractPage {

    private String totalSubscriberField = "//h4[contains(text(),'Total count of subscribers')]";
    private String totalName = "Total count of subscribers";
    private String activeSubscriberField = "//h4[contains(text(),'Active subscribers')]";
    private String activeName = "Active subscribers";
    private String expiredSubscriberField = "//h4[contains(text(),'Expired subscribers')]";
    private String expiredName = "Expired subscribers";
    private String OnHoldSubscriberField = "//h4[contains(text(),'On hold subscribers')]";
    private String OnHoldName = "On hold subscribers";
    private String NewSubscriberField = "//h4[contains(text(),'New subscribers')]";
    private String NewName = "New subscribers";

    public CheckMetricsPage checkTotalSubscriber() {
        waitForElementVisible(getElementBy(totalSubscriberField));
        WebElement element1 = getElement(totalSubscriberField);
        Assert.assertEquals(totalName, element1.getText(), "Total count not displayed");
        return this;
    }

    public CheckMetricsPage checkActiveSubscriber() {
        WebElement element2 = getElement(activeSubscriberField);
        Assert.assertEquals(activeName, element2.getText(), "Active Subscriber not displayed");
        return this;
    }

    public CheckMetricsPage checkExpiredSubscriber() {
        WebElement element3 = getElement(expiredSubscriberField);
        Assert.assertEquals(expiredName, element3.getText(), "Expired Subscriber not displayed");
        return this;
    }

    public CheckMetricsPage checkOnHoldSubscriber() {
        WebElement element3 = getElement(OnHoldSubscriberField);
        Assert.assertEquals(OnHoldName, element3.getText(), "On Hold Subscriber not displayed");
        return this;
    }

    public CheckMetricsPage checkNewSubscriber() {
        WebElement element3 = getElement(NewSubscriberField);
        Assert.assertEquals(NewName, element3.getText(), "New Subscriber not displayed");
        return this;
    }
}
