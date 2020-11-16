package nora.web.helpers.devicesHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.channelServicePages.AddChannelServicePage;
import nora.web.pages.devicesPages.AddDevicesPage;

public class AddDevicesHelper extends AbstractHelper {

    AddDevicesPage addDevicesPage = new AddDevicesPage();

    public void clickDevicesButton() {
        addDevicesPage.clickDevicesMod();
    }
}
