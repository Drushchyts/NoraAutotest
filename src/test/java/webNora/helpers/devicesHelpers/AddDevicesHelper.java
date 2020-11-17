package webNora.helpers.devicesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.devicesPages.AddDevicesPage;

public class AddDevicesHelper extends AbstractHelper {

    AddDevicesPage addDevicesPage = new AddDevicesPage();

    public void clickDevicesButton() {
        addDevicesPage.clickDevicesMod();
    }
}
