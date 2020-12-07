package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.automation.core.FrameworkCore;
import webNora.automation.core.utils.IOUtils;
import webNora.helpers.AbstractHelper;
import webNora.helpers.packageHelpers.*;


public class PackagesModTest extends FrameworkCore {

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
    }

    @Test
    public void createPackage() {
        addPackageHelper.clickPackageButton()
                .createPackage();
    }

    @Test(dependsOnMethods = "createPackage", skipFailedInvocations = true)
    public void activationSettings() throws InterruptedException {
        addActivationSettingsHelper.paymentSets()
                .paymentServices()
                .currencies()
                .currencyConverters()
                .generalSettings();
    }

    @Test(dependsOnMethods = "activationSettings")
    public void contentSets() {
        contentSetsHelper.clickContentsSetsButton();
//                .addContentSet();
    }

    @Test(dependsOnMethods = "contentSets")
    public void coupons() {
        addCouponsHelper.clickCouponsButton()
                .addCoupons();
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
    }

    @Test(dependsOnMethods = "announcementsAndReminders")
    public void deletePackage() {
        addPackageHelper.clickPackageButton();
        deletePackageHelper.deletePackage();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====PackagesModTest=====FINISH");
//        abstractHelper.close();
    }

}
