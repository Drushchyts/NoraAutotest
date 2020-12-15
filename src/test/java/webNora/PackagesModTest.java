package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import webNora.automation.core.FrameworkCore;
import webNora.automation.core.utils.IOUtils;
import webNora.helpers.AbstractHelper;
import webNora.helpers.packageHelpers.*;


public class PackagesModTest extends FrameworkCore {

    private static final Logger LOG = Logger.getLogger(PackagesModTest.class);

    AbstractHelper abstractHelper = new AbstractHelper();
    AddPackageHelper addPackageHelper = new AddPackageHelper();
    AddActivationSettingsHelper addActivationSettingsHelper = new AddActivationSettingsHelper();
    STBSettingsHelper stbSettingsHelper = new STBSettingsHelper();
    STBChannelListHelper stbChannelListHelper = new STBChannelListHelper();
    AnnAndRemindersHelper annAndRemindersHelper = new AnnAndRemindersHelper();
    AddCouponsHelper addCouponsHelper = new AddCouponsHelper();
    ContentSetsHelper contentSetsHelper = new ContentSetsHelper();
    DeletePackageHelper deletePackageHelper = new DeletePackageHelper();

    private String username;
    private String password;


    @BeforeClass
    public void setUp() {
        LOG.info("TEST=====PackagesModTest=====START");
        username = IOUtils.loadGenericProperties("username", "configuration");
        password = IOUtils.loadGenericProperties("password", "configuration");
        abstractHelper.openAdminPage();
        abstractHelper.loginAdmin(username, password);

    }

    @Test
    public void createPackage() throws InterruptedException {
        addPackageHelper.clickPackageButton()
                .createPackage();
        Thread.sleep(2000);
        LOG.info("Create package success");
    }

    @Test(dependsOnMethods = "createPackage", skipFailedInvocations = true)
    public void activationSettings() throws InterruptedException {
        addActivationSettingsHelper.paymentSets()
                .paymentServices()
                .currencies()
                .currencyConverters()
                .generalSettings();
        Thread.sleep(2000);
        LOG.info("Activation settings package success");
    }

    @Test(dependsOnMethods = "activationSettings")
    public void contentSets() throws InterruptedException {
        contentSetsHelper.clickContentsSetsButton();
//                .addContentSet();
        Thread.sleep(2000);
        LOG.info("Add Content sets package success");
    }

    @Test(dependsOnMethods = "contentSets")
    public void coupons() throws InterruptedException {
        addCouponsHelper.clickCouponsButton()
                .addCoupons();
        Thread.sleep(2000);
        LOG.info("Add Coupons package success");
    }

    @Test(dependsOnMethods = "coupons", skipFailedInvocations = true, alwaysRun = true)
    public void stbSettings() throws InterruptedException {
        stbSettingsHelper.addStbSettings();
        Thread.sleep(2000);
        LOG.info("Add Sbt Settings package success");
    }

    @Test(dependsOnMethods = "stbSettings", skipFailedInvocations = true, alwaysRun = true)
    public void stbChannelList() throws InterruptedException {
        stbChannelListHelper.clickSTBChannelList();
        Thread.sleep(2000);
        LOG.info("Add Stb Channel list package success");
    }

    @Test(dependsOnMethods = "stbChannelList", skipFailedInvocations = true, alwaysRun = true)
    public void announcementsAndReminders() throws InterruptedException {
        annAndRemindersHelper.addAnnouncement()
                .addReminder()
                .activationTOA();
        Thread.sleep(2000);
        LOG.info("Add Announcements and Reminders package success");
    }

    @Test(dependsOnMethods = "announcementsAndReminders", skipFailedInvocations = true, alwaysRun = true)
    public void deletePackage() throws InterruptedException {
        addPackageHelper.clickPackageButton();
        deletePackageHelper.deletePackage();
        Thread.sleep(2000);
        LOG.info("Delete package success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====PackagesModTest=====FINISH");
    }

}
