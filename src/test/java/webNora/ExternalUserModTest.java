package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.externalUserHelpers.AddExternalUserHelper;
import webNora.helpers.externalUserHelpers.AddUserHelper;
import webNora.helpers.externalUserHelpers.CheckAndDeleteUserHelper;

public class ExternalUserModTest {

    private static final Logger LOG = Logger.getLogger(ExternalUserModTest.class);
    AddExternalUserHelper addExternalUserHelper = new AddExternalUserHelper();
    AddUserHelper addUserHelper = new AddUserHelper();
    CheckAndDeleteUserHelper checkAndDeleteUserHelper = new CheckAndDeleteUserHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====ExternalUserModTest=====START");
    }

    @Test
    public void externalModTest() throws InterruptedException {
        addExternalUserHelper.clickExternalUser();
        Thread.sleep(1000);
        LOG.info("Click External Mod success");
    }

    @Test(dependsOnMethods = "externalModTest")
    public void addExternalUserTest() throws InterruptedException {
        addUserHelper.addUser();
        Thread.sleep(1000);
        LOG.info("Add External User success");
    }

    @Test(dependsOnMethods = "addExternalUserTest")
    public void checkAndDeleteUserTest() throws InterruptedException {
        checkAndDeleteUserHelper.verifyCreated()
                .deleteUserExternal();
        Thread.sleep(1000);
        LOG.info("Check and Delete External User success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====ExternalUserModTest=====FINISH\n");
    }
}
