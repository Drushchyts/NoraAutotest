package webNora.pages.subscribersPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class CustomStreamsPage extends AbstractPage {

    private String customerStreamButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/form[1]/div[2]/a[4]";
    private String nameField = "Custom Streams";
    private String checkField = "//span[contains(text(),'Custom Streams')]";


    public CustomStreamsPage clickCustomerStreamButton() {
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
