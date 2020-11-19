package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import webNora.helpers.devicesHelpers.AddDevicesHelper;
import org.testng.annotations.Test;
import webNora.helpers.devicesHelpers.DeviceHelper;
import webNora.helpers.devicesHelpers.MultipleDeviceHelper;

public class DevicesModTest {

    AddDevicesHelper addDevicesHelper = new AddDevicesHelper();
    DeviceHelper deviceHelper = new DeviceHelper();
    MultipleDeviceHelper multipleDeviceHelper = new MultipleDeviceHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====DevicesModTest=====START");
    }

    @Test
    public void devicesTest() throws InterruptedException {
        addDevicesHelper.clickDevicesButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "devicesTest")
    public void addDevicesTest() throws InterruptedException {
        deviceHelper.addDevice();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "addDevicesTest")
    public void addMultipleDevicesTest() throws InterruptedException {
        multipleDeviceHelper.addMultipleDevice();
        Thread.sleep(2000);
    }


    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====DevicesModTest=====FINISH");
//        addDevicesHelper.close();
    }
}
