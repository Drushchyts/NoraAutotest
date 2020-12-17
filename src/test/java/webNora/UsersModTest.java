package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.usersHelpers.AddSystemUserHelper;
import webNora.helpers.usersHelpers.AddUserHelper;
import webNora.helpers.usersHelpers.SearchAndDeleteUserHelper;

public class UsersModTest {

    private static final Logger LOG = Logger.getLogger(UsersModTest.class);
    AddUserHelper addUserHelper = new AddUserHelper();
    AddSystemUserHelper addSystemUserHelper = new AddSystemUserHelper();
    SearchAndDeleteUserHelper searchAndDeleteUserHelper = new SearchAndDeleteUserHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====UsersModTest=====START");
    }

    @Test
    public void userModTest() throws InterruptedException {
        addUserHelper.clickUsers();
        Thread.sleep(2000);
        LOG.info("Click User Mod success");
    }

    @Test(dependsOnMethods = "userModTest")
    public void addSystemUser() throws InterruptedException {
        addSystemUserHelper.addSystemUser();
        Thread.sleep(2000);
        LOG.info("Add System User success");
    }

    @Test(dependsOnMethods = "addSystemUser")
    public void searchAndDeleteUser() throws InterruptedException {
        searchAndDeleteUserHelper.searchAndDeleteUser();
        Thread.sleep(2000);
        LOG.info("Search System User success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====UsersModTest=====FINISH\n");
    }
}
