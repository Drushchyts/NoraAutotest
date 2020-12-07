package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.externalUserHelpers.AddExternalUserHelper;
import webNora.helpers.externalUserHelpers.AddUserHelper;
import webNora.helpers.externalUserHelpers.CheckAndDeleteUserHelper;

public class ExternalUserModTest {

    AddExternalUserHelper addExternalUserHelper = new AddExternalUserHelper();
    AddUserHelper addUserHelper = new AddUserHelper();
    CheckAndDeleteUserHelper checkAndDeleteUserHelper = new CheckAndDeleteUserHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====ExternalUserModTest=====START");
    }

    @Test
    public void externalModTest() throws InterruptedException {
        addExternalUserHelper.clickExternalUser();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "externalModTest")
    public void addExternalUserTest() throws InterruptedException {
        addUserHelper.addUser();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "addExternalUserTest")
    public void checkAndDeleteUserTest() throws InterruptedException {
        checkAndDeleteUserHelper.verifyCreated()
                .deleteUserExternal();
        Thread.sleep(1000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====ExternalUserModTest=====FINISH");
//        addExternalUserHelper.close();
    }
}
