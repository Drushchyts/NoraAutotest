package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.settingsHelpers.*;

public class SettingsModTest {

    private static final Logger LOG = Logger.getLogger(SettingsModTest.class);
    AddSettingsHelper addSettingsHelper = new AddSettingsHelper();
    GeneralSettingsHelper generalSettingsHelper = new GeneralSettingsHelper();
    SystemTaskHelper systemTaskHelper = new SystemTaskHelper();
    PaymentSystemHelper paymentSystemHelper = new PaymentSystemHelper();
    ExtensionsHelper extensionsHelper = new ExtensionsHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====SettingsModTest=====START");
    }

    @Test
    public void SettingsModTest() throws InterruptedException {
        addSettingsHelper.clickSettingsMod();
        Thread.sleep(2000);
        LOG.info("Click Settings Mod success");
    }

    @Test(dependsOnMethods = "SettingsModTest")
    public void generalSettingsSubMod() throws InterruptedException {
        generalSettingsHelper.generalSettings();
        Thread.sleep(2000);
        LOG.info("General Settings SubMod success");
    }

    @Test(dependsOnMethods = "generalSettingsSubMod")
    public void systemTaskSubMod() throws InterruptedException {
        systemTaskHelper.systemTask();
        Thread.sleep(2000);
        LOG.info("System Task SubMod success");
    }

    @Test(dependsOnMethods = "systemTaskSubMod")
    public void paymentSystemSubMod() throws InterruptedException {
        paymentSystemHelper.paymentSystem();
        Thread.sleep(2000);
        LOG.info("Payment System SubMod success");
    }

    @Test(dependsOnMethods = "paymentSystemSubMod")
    public void extensionsSubMod() throws InterruptedException {
        extensionsHelper.extensions();
        Thread.sleep(2000);
        LOG.info("Extension SubMod success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====SettingsModTest=====FINISH\n");
    }
}
