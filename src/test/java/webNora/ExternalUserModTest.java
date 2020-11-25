package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.externalUserHelpers.AddExternalUserHelper;

public class ExternalUserModTest {

    AddExternalUserHelper addExternalUserHelper = new AddExternalUserHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====ExternalUserModTest=====START");
    }

    @Test
    public void infoModTest() throws InterruptedException {
        addExternalUserHelper.clickExternalUser();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====ExternalUserModTest=====FINISH");
//        addExternalUserHelper.close();
    }
}
