package webNora.pages.subscribersPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class CustomStreamsPage extends AbstractPage {

    private String customerStreamButton = "//*[@id=\"app-content\"]/div/ui-view/ui-view/ui-view/div/div[1]/div[2]/a[4]";
    private String nameField = "Custom Streams";
    private String checkField = "//span[contains(text(),'Custom Streams')]";


    public CustomStreamsPage clickCustomerStreamButton() throws InterruptedException {
        sleep(2000);
        waitForElementVisible(getElementBy(customerStreamButton));
        getElement(customerStreamButton).click();
        return this;
    }

    public CustomStreamsPage checkCustomerPage() {
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        Assert.assertEquals(nameField, element.getText(), "Not start Customer page");
        return this;
    }
}
