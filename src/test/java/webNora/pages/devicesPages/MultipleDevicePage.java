package webNora.pages.devicesPages;

import webNora.pages.AbstractPage;

import java.awt.*;

public class MultipleDevicePage extends AbstractPage {


    private String devicesButton = "//span[contains(text(),'Devices')]";
    private String addDeviceButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
    private String addMultipleDeviceButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/ul[1]/li[2]/a[1]";
    private String assignedPackagesField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]";
    private String selectAssignedPackages = "//span[contains(text(),'\"November2020\"')]";
    private String deviceOneField = "//input[@id='dev0']";
    private String deviceTwoField = "//input[@id='dev1']";
    private String deviceThreeField = "//input[@id='dev2']";
    private String macOneField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[2]/input[1]";
    private String macTwoField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[2]/input[1]";
    private String macThreeField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[2]/input[1]";
    private String addDevicesButton = "//button[@id='in-save3']";
    private String randomSeriesNumber = "" + (int) (Math.random() * 99999);

    public MultipleDevicePage clickAddDeviceButton() {
        waitForElementClickable(getElementBy(addDeviceButton));
        getElement(addDeviceButton).click();
        return this;
    }


    public MultipleDevicePage clickDevicesMod() {
        getElement(devicesButton).click();
        return this;
    }

    public MultipleDevicePage clickAddMultipleDeviceButton() {
        waitForElementClickable(getElementBy(addMultipleDeviceButton));
        getElement(addMultipleDeviceButton).click();
        return this;
    }

    public MultipleDevicePage selectMultiplePackages() {
        getElement(assignedPackagesField).click();
        waitForElementClickable(getElementBy(selectAssignedPackages));
        getElement(selectAssignedPackages).click();
        return this;
    }

    public MultipleDevicePage enterDeviceAndMac() {
        getElement(deviceOneField).sendKeys(getRandom());
        getElement(deviceTwoField).sendKeys(getRandom());
        getElement(deviceThreeField).sendKeys(getRandom());
        getElement(macOneField).sendKeys("00:11:23:45:65:44");
        getElement(macTwoField).sendKeys("00:11:23:45:65:44");
        getElement(macThreeField).sendKeys("00:11:23:45:65:44");
        return this;
    }

    public MultipleDevicePage clickAddDevicesButton() {
        getElement(addDevicesButton).click();
        return this;
    }
}
