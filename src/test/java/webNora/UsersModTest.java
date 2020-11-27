package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.usersHelpers.AddSystemUserHelper;
import webNora.helpers.usersHelpers.AddUserHelper;
import webNora.helpers.usersHelpers.SearchAndDeleteUserHelper;

public class UsersModTest {

    AddUserHelper addUserHelper = new AddUserHelper();
    AddSystemUserHelper addSystemUserHelper = new AddSystemUserHelper();
    SearchAndDeleteUserHelper searchAndDeleteUserHelper = new SearchAndDeleteUserHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====UsersModTest=====START");
    }

    @Test
    public void userModTest() throws InterruptedException {
        addUserHelper.clickUsers();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "userModTest")
    public void addSystemUser() throws InterruptedException {
        addSystemUserHelper.addSystemUser();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "addSystemUser")
    public void searchAndDeleteUser() throws InterruptedException {
        searchAndDeleteUserHelper.searchAndDeleteUser();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====UsersModTest=====FINISH");
//        addUserHelper.close();
    }
}
