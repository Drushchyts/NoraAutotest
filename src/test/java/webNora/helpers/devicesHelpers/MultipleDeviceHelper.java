package webNora.helpers.devicesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.devicesPages.MultipleDevicePage;

public class MultipleDeviceHelper extends AbstractHelper {

    MultipleDevicePage multipleDevicePage = new MultipleDevicePage();


    public MultipleDeviceHelper addMultipleDevice() {
        multipleDevicePage.clickDevicesMod()
                .clickAddDeviceButton()
                .clickAddMultipleDeviceButton()
                .selectMultiplePackages()
                .enterDeviceAndMac()
                .clickAddDevicesButton();
        return this;
    }
}
