package webNora;

import webNora.automation.core.utils.IOUtils;
import webNora.helpers.AbstractHelper;
import webNora.helpers.packageHelpers.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PackagesModTest {

    AbstractHelper abstractHelper = new AbstractHelper();
    AddPackageHelper addPackageHelper = new AddPackageHelper();
    AddActivationSettingsHelper addActivationSettingsHelper = new AddActivationSettingsHelper();
    STBSettingsHelper stbSettingsHelper = new STBSettingsHelper();
    STBChannelListHelper stbChannelListHelper = new STBChannelListHelper();
    AnnAndRemindersHelper annAndRemindersHelper = new AnnAndRemindersHelper();
    AddCouponsHelper addCouponsHelper = new AddCouponsHelper();
    ContentSetsHelper contentSetsHelper = new ContentSetsHelper();

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

    @Test(dependsOnMethods = "activationSettings", skipFailedInvocations = true)
    public void stbSettings() throws InterruptedException {
        stbSettingsHelper.addStbSettings();
    }

    @Test(dependsOnMethods = "stbSettings")
    public void contentSets() {
        contentSetsHelper.clickCouponsButton();
    }

    @Test(dependsOnMethods = "contentSets")
    public void coupons() {
        addCouponsHelper.clickCouponsButton();
    }

    @Test(dependsOnMethods = "coupons", skipFailedInvocations = true)
    public void stbChannelList() {
        stbChannelListHelper.clickSTBChannelList();
    }

    @Test(dependsOnMethods = "stbChannelList", skipFailedInvocations = true)
    public void announcementsAndReminders() throws InterruptedException {
        annAndRemindersHelper.addAnnouncement()
                .addReminder()
                .activationTOA();
        //addSubInPackHelper.clickBackButton().addSubscriberInPackage();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====PackagesModTest=====FINISH");
//        abstractHelper.close();
    }

}
