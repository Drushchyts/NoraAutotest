package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.usersHelpers.AddUserHelper;

public class UsersModTest {

    AddUserHelper addUserHelper = new AddUserHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====UsersModTest=====START");
    }

    @Test
    public void infoModTest() throws InterruptedException {
        addUserHelper.clickUsers();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====UsersModTest=====FINISH");
//        addUserHelper.close();
    }
}
