package webNora.pages.devicesPages;

import webNora.pages.AbstractPage;

public class DevicePage extends AbstractPage {

    private String addDeviceButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
    private String macAddressFiled = "//input[@id='mac']";
    private String macAddress = "00:11:23:45:65:44";
    private String serialNumberField = "//input[@id='serial']";
    private String serialNumber = "" + (int) (Math.random() * 999 + 10);
    private String assignedPackagesField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[7]/div[1]/div[1]/div[1]/a[1]/span[1]";
    private String selectAssignedPackages = "//span[contains(text(),'1 (copy)')]";
    private String saveDeviceButton = "//button[@id='in-save1']";


    public DevicePage clickAddDeviceButton() {
        waitForElementClickable(getElementBy(addDeviceButton));
        getElement(addDeviceButton).click();
        return this;
    }

    public DevicePage enterMacAddress() {
        getElement(macAddressFiled).sendKeys(macAddress);
        return this;
    }

    public DevicePage enterSerialNumber() {
        getElement(serialNumberField).sendKeys(serialNumber);
        return this;
    }

    public DevicePage selectAssPackages() {
        getElement(assignedPackagesField).click();
        waitForElementClickable(getElementBy(selectAssignedPackages));
        getElement(selectAssignedPackages).click();
        return this;
    }

    public DevicePage clickSaveDeviceButton() {
        waitForElementClickable(getElementBy(saveDeviceButton));
        getElement(saveDeviceButton).click();
        return this;
    }
}
