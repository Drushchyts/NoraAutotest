package webNora;

import org.apache.log4j.Logger;
import webNora.helpers.noraGoHelpers.*;
import webNora.helpers.subscribersHelpers.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class SubscribersModTest {

    private static final Logger LOG = Logger.getLogger(SubscribersModTest.class);
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
    LogOutNoraGoHelper logOutNoraGoHelper = new LogOutNoraGoHelper();
    AppInfoHelper appInfoHelper = new AppInfoHelper();
    TvNoraHelper tvNoraHelper = new TvNoraHelper();
    MoviesNoraHelper moviesNoraHelper = new MoviesNoraHelper();
    TvShowsHelper tvShowsHelper = new TvShowsHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====SubscribersModTest=====START");
    }


    @Test
    public void subscribersTest() throws InterruptedException {
        addSubscriberHelper.clickSubscriberButton().createSubscriber();
        Thread.sleep(2000);
        LOG.info("Create subscriber success");

    }

    @Test(dependsOnMethods = "subscribersTest", alwaysRun = true)
    public void addDeviceSubscriberTest() throws InterruptedException {
        addDeviceHelper.addDevice();
        Thread.sleep(2000);
        LOG.info("Add Device Subscriber success");
    }

    @Test(dependsOnMethods = "addDeviceSubscriberTest", alwaysRun = true)
    public void activationSubscriber() throws InterruptedException {
        activationHelper.activationSubscriber();
        Thread.sleep(2000);
        LOG.info("Activation Subscriber success");
    }

    @Test(dependsOnMethods = "activationSubscriber", alwaysRun = true)
    public void deleteDeviceSubscriber() throws InterruptedException {
        deleteDeviceHelper.deleteDevice();
        Thread.sleep(2000);
        LOG.info("Delete Device Subscriber success");
    }

    @Test(dependsOnMethods = "deleteDeviceSubscriber")
    public void customerStreamsSubscriber() throws InterruptedException {
        customStreamsHelper.checkCustomerPage();
        Thread.sleep(2000);
        LOG.info("Customer Stream Subscriber success");
    }

    @Test(dependsOnMethods = "customerStreamsSubscriber")
    public void notesSubscriber() throws InterruptedException {
        notesHelper.checkNotesPage();
        Thread.sleep(2000);
        LOG.info("Notes Subscriber success");
    }

    @Test(dependsOnMethods = "notesSubscriber", alwaysRun = true, skipFailedInvocations = true)
    public void noraWebTest() throws AWTException, InterruptedException {
        noraGoWebHelper.openWebNoraGo()
                .loginNorGo();
        Thread.sleep(2000);
        LOG.info("Nora Open Web Test success");
    }

    @Test(dependsOnMethods = "noraWebTest", skipFailedInvocations = true)
    public void addProfilesWeb() throws InterruptedException {
        addProfilesHelper.addNewProfiles();
        Thread.sleep(2000);
        LOG.info("Nora Web Add Profiles success");
    }

    @Test(dependsOnMethods = "addProfilesWeb", skipFailedInvocations = true)
    public void checkAppInfo() throws InterruptedException {
        appInfoHelper.checkAppInfo();
        Thread.sleep(2000);
        LOG.info("Check App Info success");
    }

    @Test(dependsOnMethods = "checkAppInfo", skipFailedInvocations = true)
    public void tvNoraTest() throws InterruptedException {
        tvNoraHelper.checkTvNora();
        Thread.sleep(2000);
        LOG.info("Tv Nora Player success");
    }

    @Test(dependsOnMethods = "tvNoraTest", skipFailedInvocations = true)
    public void moviesNoraTest() throws InterruptedException {
        moviesNoraHelper.checkMoviesNora();
        Thread.sleep(2000);
        LOG.info("Search Movies Nora success");
    }

    @Test(dependsOnMethods = "moviesNoraTest", skipFailedInvocations = true)
    public void tvShowsNoraTest() throws InterruptedException {
        tvShowsHelper.TvShowsHelper();
        Thread.sleep(2000);
        LOG.info("Tv Shows Nora success");
    }

    //----------------------------------------------------------------------------

    @Test(dependsOnMethods = "tvShowsNoraTest", skipFailedInvocations = true)
    public void logOutNora() throws InterruptedException {
        logOutNoraGoHelper.logOutNoraWeb();
        Thread.sleep(2000);
        LOG.info("LogOut Nora Web success");
    }

    @Test(dependsOnMethods = "logOutNora", alwaysRun = true)
    public void backToAdminPanel() throws InterruptedException {
        closeNoraGoHelper.backAdminPanel();
        Thread.sleep(2000);
        LOG.info("Back Admin panel success");
    }


    @Test(dependsOnMethods = "backToAdminPanel")
    public void checkAbdDeleteSubscriberTest() throws InterruptedException {
        addSubscriberHelper.clickSubscriberButton();
        checkAndDeleteSubscriberHelper.deleteSubscriber();
        Thread.sleep(2000);
        LOG.info("Check And Delete Subscriber success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====SubscribersModTest=====FINISH\n");
    }

}
