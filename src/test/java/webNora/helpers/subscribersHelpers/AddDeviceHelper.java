package webNora.helpers.subscribersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.subscribersPages.AddDevicePage;

public class AddDeviceHelper extends AbstractHelper {

    AddDevicePage addAndDeleteDevicePage = new AddDevicePage();

    public AddDeviceHelper addDevice() throws InterruptedException {
        addAndDeleteDevicePage.clickAddDeviceButton()
                .selectDevice()
                .clickAdd();
        return this;
    }
}
