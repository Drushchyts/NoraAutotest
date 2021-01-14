package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import webNora.helpers.devicesHelpers.AddDevicesHelper;
import org.testng.annotations.Test;
import webNora.helpers.devicesHelpers.DeviceHelper;
import webNora.helpers.devicesHelpers.MultipleDeviceHelper;

public class DevicesModTest {

    private static final Logger LOG = Logger.getLogger(DevicesModTest.class);
    AddDevicesHelper addDevicesHelper = new AddDevicesHelper();
    DeviceHelper deviceHelper = new DeviceHelper();
    MultipleDeviceHelper multipleDeviceHelper = new MultipleDeviceHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====DevicesModTest=====START");
    }

    @Test
    public void devicesTest() throws InterruptedException {
        addDevicesHelper.clickDevicesButton();
        Thread.sleep(2000);
        LOG.info("Click Device Mod success");
    }

//    @Test(dependsOnMethods = "devicesTest",skipFailedInvocations = true)
//    public void addDevicesTest() throws InterruptedException {
//        deviceHelper.addDevice();
//        Thread.sleep(2000);
//        LOG.info("Add Devices success");
//    }
//
//    @Test(dependsOnMethods = "addDevicesTest",skipFailedInvocations = true)
//    public void addMultipleDevicesTest() throws InterruptedException {
//        multipleDeviceHelper.addMultipleDevice();
//        Thread.sleep(2000);
//        LOG.info("Add Multiple Device success");
//    }


    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====DevicesModTest=====FINISH\n");
    }
}
