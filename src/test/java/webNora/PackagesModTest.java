package webNora;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Severity;
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
        System.out.println("TEST=====PackagesModTest=====START");
        username = IOUtils.loadGenericProperties("username", "configuration");
        password = IOUtils.loadGenericProperties("password", "configuration");
        abstractHelper.openAdminPage();
        abstractHelper.loginAdmin(username, password);
        LOG.info("dasdasd");
    }

    @Test
    public void createPackage() throws InterruptedException {
        addPackageHelper.clickPackageButton()
                .createPackage();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "createPackage", skipFailedInvocations = true)
    public void activationSettings() throws InterruptedException {
        addActivationSettingsHelper.paymentSets()
                .paymentServices()
                .currencies()
                .currencyConverters()
                .generalSettings();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "activationSettings")
    public void contentSets() throws InterruptedException {
        contentSetsHelper.clickContentsSetsButton();
//                .addContentSet();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "contentSets")
    public void coupons() throws InterruptedException {
        addCouponsHelper.clickCouponsButton()
                .addCoupons();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "coupons", skipFailedInvocations = true)
    public void stbSettings() throws InterruptedException {
        stbSettingsHelper.addStbSettings();
    }

    @Test(dependsOnMethods = "stbSettings", skipFailedInvocations = true)
    public void stbChannelList() {
        stbChannelListHelper.clickSTBChannelList();
    }

    @Test(dependsOnMethods = "stbChannelList", skipFailedInvocations = true)
    public void announcementsAndReminders() throws InterruptedException {
        annAndRemindersHelper.addAnnouncement()
                .addReminder()
                .activationTOA();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "announcementsAndReminders")
    public void deletePackage() throws InterruptedException {
        addPackageHelper.clickPackageButton();
        deletePackageHelper.deletePackage();
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====PackagesModTest=====FINISH");
    }

}