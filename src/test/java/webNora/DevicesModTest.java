package webNora;

import webNora.helpers.devicesHelpers.AddDevicesHelper;
import org.testng.annotations.Test;

public class DevicesModTest {

    AddDevicesHelper addDevicesHelper = new AddDevicesHelper();


    @Test(priority = 9)
    public void devicesTest() throws InterruptedException {
        addDevicesHelper.clickDevicesButton();
        Thread.sleep(2000);
    }
}
