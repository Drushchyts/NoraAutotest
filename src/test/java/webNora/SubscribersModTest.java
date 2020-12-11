package webNora;

import webNora.helpers.noraGoHelpers.AddProfilesHelper;
import webNora.helpers.noraGoHelpers.CloseNoraGoHelper;
import webNora.helpers.noraGoHelpers.NoraGoWebHelper;
import webNora.helpers.subscribersHelpers.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.logging.Logger;

public class SubscribersModTest {


    AddSubscriberHelper addSubscriberHelper = new AddSubscriberHelper();
    AddDeviceHelper addDeviceHelper = new AddDeviceHelper();
    ActivationHelper activationHelper = new ActivationHelper();
    DeleteDeviceHelper deleteDeviceHelper = new DeleteDeviceHelper();
    CheckAndDeleteSubscriberHelper checkAndDeleteSubscriberHelper = new CheckAndDeleteSubscriberHelper();
    CustomStreamsHelper customStreamsHelper = new CustomStreamsHelper();
    NotesHelper notesHelper = new NotesHelper();
    NoraGoWebHelper noraGoWebHelper = new NoraGoWebHelper();
    AddProfilesHelper addProfilesHelper = new AddProfilesHelper();
    CloseNoraGoHelper closeNoraGoHelper = new CloseNoraGoHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====SubscribersModTest=====START");
    }


    @Test
    public void subscribersTest() throws InterruptedException {
        addSubscriberHelper.clickSubscriberButton().createSubscriber();
        Thread.sleep(2000);

    }

    @Test(dependsOnMethods = "subscribersTest", alwaysRun = true)
    public void addDeviceSubscriberTest() throws InterruptedException {
        addDeviceHelper.addDevice();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "addDeviceSubscriberTest", alwaysRun = true)
    public void activationSubscriber() throws InterruptedException {
        activationHelper.activationSubscriber();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "activationSubscriber", alwaysRun = true)
    public void deleteDeviceSubscriber() throws InterruptedException {
        deleteDeviceHelper.deleteDevice();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "deleteDeviceSubscriber")
    public void customerStreamsSubscriber() throws InterruptedException {
        customStreamsHelper.checkCustomerPage();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "customerStreamsSubscriber")
    public void notesSubscriber() throws InterruptedException {
        notesHelper.checkNotesPage();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "notesSubscriber", alwaysRun = true, skipFailedInvocations = true)
    public void noraWebTest() throws AWTException, InterruptedException {
        noraGoWebHelper.openWebNoraGo()
                .loginNorGo();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "noraWebTest", skipFailedInvocations = true)
    public void addProfilesWeb() throws InterruptedException {
        addProfilesHelper.addNewProfiles();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "addProfilesWeb", alwaysRun = true)
    public void backToAdminPanel() throws InterruptedException {
        closeNoraGoHelper.backAdminPanel();
        Thread.sleep(2000);
    }


    @Test(dependsOnMethods = "backToAdminPanel")
    public void checkAbdDeleteSubscriberTest() throws InterruptedException {
        addSubscriberHelper.clickSubscriberButton();
        checkAndDeleteSubscriberHelper.deleteSubscriber();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====SubscribersModTest=====FINISH");
//        addSubscriberHelper.close();
    }

}
