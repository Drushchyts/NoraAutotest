package webNora.helpers.subscribersHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.subscribersPages.DeleteDevicePage;

public class DeleteDeviceHelper extends AbstractHelper {

    DeleteDevicePage deleteDevicePage = new DeleteDevicePage();

    public DeleteDeviceHelper deleteDevice() throws InterruptedException {
        deleteDevicePage.clickDeviceButton()
                .deleteDevice();
        return this;
    }
}
