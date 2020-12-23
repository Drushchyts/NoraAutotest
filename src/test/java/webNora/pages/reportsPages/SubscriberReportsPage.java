package webNora.pages.reportsPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class SubscriberReportsPage extends AbstractPage {

    private String subscriberReportsButton = "//span[contains(text(),'Subscriber Reports')]";
    private String checkField = "//header/div[1]/div[1]/ul[1]/li[2]/span[1]";
    private String checkText = "Reports";

    public SubscriberReportsPage clickSubscriberReportsButton() {
        waitForElementClickable(getElementBy(subscriberReportsButton));
        getElement(subscriberReportsButton).click();
        return this;
    }

    public SubscriberReportsPage checkSubscriberReports() {
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        Assert.assertEquals(checkText, element.getText());
        return this;
    }
}
