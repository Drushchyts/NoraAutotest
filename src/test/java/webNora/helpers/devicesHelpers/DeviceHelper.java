package webNora.helpers.devicesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.devicesPages.DevicePage;

public class DeviceHelper extends AbstractHelper {

    DevicePage devicePage = new DevicePage();

    public DeviceHelper addDevice() {
        devicePage.clickAddDeviceButton()
                .enterMacAddress()
                .enterSerialNumber()
                .selectAssPackages()
                .clickSaveDeviceButton();
        return this;
    }
}
