package webNora.pages.devicesPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.helpers.devicesHelpers.CheckAndDeleteDeviceHelper;
import webNora.pages.AbstractPage;

public class CheckAndDeleteDevicePage extends AbstractPage {

    private String searchField = "//input[@id='_searchBar']";
    private String macAddress = "00:11:23:45:65:44";
    private String fieldDevice = "//tbody/tr[1]/td[1]/a[1]";
    private String removeButton = "//button[contains(text(),'Remove')]";
    private String agreeRemoveButton = "//button[contains(text(),'Yes')]";
    private String assertField = "//tbody/tr[1]/td[3]/font[1]";

    public CheckAndDeleteDevicePage enterDevice(){
        waitForElementVisible(getElementBy(searchField));
        getElement(searchField).sendKeys(macAddress);
        return this;
    }

    public CheckAndDeleteDevicePage checkDevice(){
        waitForElementVisible(getElementBy(assertField));
        WebElement element = getElement(assertField);
        Assert.assertEquals(macAddress,element.getText(),"Device not equals");
        return this;
    }

    public CheckAndDeleteDevicePage clickFiledDevice() throws InterruptedException {
        Thread.sleep(1000);
        waitForElementClickable(getElementBy(fieldDevice));
        getElement(fieldDevice).click();
        return this;
    }

    public CheckAndDeleteDevicePage clickRemoveButton() throws InterruptedException {
        Thread.sleep(1000);
        waitForElementClickable(getElementBy(removeButton));
        getElement(removeButton).click();
        return this;
    }


    public CheckAndDeleteDevicePage agreeRemove()  {
        waitForElementClickable(getElementBy(agreeRemoveButton));
        getElement(agreeRemoveButton).click();
        return this;
    }
}
