package webNora.helpers.devicesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.devicesPages.AddDevicesPage;
import webNora.pages.devicesPages.CheckAndDeleteDevicePage;

public class CheckAndDeleteDeviceHelper extends AbstractHelper {

    CheckAndDeleteDevicePage checkAndDeleteDevicePage = new CheckAndDeleteDevicePage();
    AddDevicesPage addDevicesPage = new AddDevicesPage();

    public CheckAndDeleteDeviceHelper checkAndDeleteDevice() throws InterruptedException {
        addDevicesPage.clickDevicesMod();
        checkAndDeleteDevicePage.enterDevice()
                .checkDevice()
                .clickFiledDevice()
                .clickRemoveButton()
                .agreeRemove();
        return this;
    }
}
