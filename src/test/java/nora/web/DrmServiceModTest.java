package nora.web;

import nora.web.helpers.drmServiceHelpers.AddDrmServiceHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DrmServiceModTest {

    AddDrmServiceHelper drmServiceHelper = new AddDrmServiceHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====drmServiceHelper=====START");
    }

    @Test
    public void drmServiceTest() throws InterruptedException {
        drmServiceHelper.clickDrmServiceButton();
        Thread.sleep(2000);
    }


    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====DrmServiceModTest=====FINISH");
        drmServiceHelper.close();
    }
}
