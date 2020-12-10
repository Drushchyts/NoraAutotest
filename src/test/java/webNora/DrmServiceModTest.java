package webNora;

import webNora.helpers.drmServiceHelpers.AddDrmServiceHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.drmServiceHelpers.DeleteDrmServiceHelper;

public class DrmServiceModTest {

    AddDrmServiceHelper drmServiceHelper = new AddDrmServiceHelper();
    DeleteDrmServiceHelper deleteDrmServiceHelper = new DeleteDrmServiceHelper();
    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====DrmServiceModTest=====START");
    }

    @Test
    public void drmServiceTest() throws InterruptedException {
        drmServiceHelper.clickDrmServiceButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "drmServiceTest")
    public void addDrmServiceTest() throws InterruptedException {
        drmServiceHelper.addDrmService();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "addDrmServiceTest")
    public void DeleteDrmServiceTest() throws InterruptedException {
        deleteDrmServiceHelper.deleteDrmService();
        Thread.sleep(2000);
    }


    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====DrmServiceModTest=====FINISH");
//        drmServiceHelper.close();
    }
}
