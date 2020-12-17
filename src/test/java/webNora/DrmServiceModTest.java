package webNora;

import org.apache.log4j.Logger;
import webNora.helpers.drmServiceHelpers.AddDrmServiceHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.drmServiceHelpers.DeleteDrmServiceHelper;

public class DrmServiceModTest {

    private static final Logger LOG = Logger.getLogger(DrmServiceModTest.class);
    AddDrmServiceHelper drmServiceHelper = new AddDrmServiceHelper();
    DeleteDrmServiceHelper deleteDrmServiceHelper = new DeleteDrmServiceHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====DrmServiceModTest=====START");
    }

    @Test
    public void drmServiceTest() throws InterruptedException {
        drmServiceHelper.clickDrmServiceButton();
        Thread.sleep(2000);
        LOG.info("Click Drm Mod success");
    }

    @Test(dependsOnMethods = "drmServiceTest")
    public void addDrmServiceTest() throws InterruptedException {
        drmServiceHelper.addDrmService();
        Thread.sleep(2000);
        LOG.info("Add Drm success");
    }

    @Test(dependsOnMethods = "addDrmServiceTest")
    public void DeleteDrmServiceTest() throws InterruptedException {
        deleteDrmServiceHelper.deleteDrmService();
        Thread.sleep(2000);
        LOG.info("Delete Drm success");
    }


    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====DrmServiceModTest=====FINISH\n");
    }
}
