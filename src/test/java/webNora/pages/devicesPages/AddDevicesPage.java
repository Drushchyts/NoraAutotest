package webNora.pages.devicesPages;

import webNora.pages.AbstractPage;

public class AddDevicesPage extends AbstractPage {

    private String devicesButton = "//span[contains(text(),'Devices')]";

    public AddDevicesPage clickDevicesMod() {
        getElement(devicesButton).click();
        return this;
    }
}
