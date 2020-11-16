package nora.web.pages.devicesPages;

import nora.web.pages.AbstractPage;

public class AddDevicesPage extends AbstractPage {

    private String devicesButton = "//span[contains(text(),'Devices')]";

    public AddDevicesPage clickDevicesMod() {
        getElement(devicesButton).click();
        return this;
    }
}
