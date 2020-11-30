package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.settingsHelpers.*;

public class SettingsModTest {

    AddSettingsHelper addSettingsHelper = new AddSettingsHelper();
    GeneralSettingsHelper generalSettingsHelper = new GeneralSettingsHelper();
    SystemTaskHelper systemTaskHelper = new SystemTaskHelper();
    PaymentSystemHelper paymentSystemHelper = new PaymentSystemHelper();
    ExtensionsHelper extensionsHelper = new ExtensionsHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====SettingsModTest=====START");
    }

    @Test
    public void SettingsModTest() throws InterruptedException {
        addSettingsHelper.clickSettingsMod();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "SettingsModTest")
    public void generalSettingsSubMod() throws InterruptedException {
        generalSettingsHelper.generalSettings();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "generalSettingsSubMod")
    public void systemTaskSubMod() throws InterruptedException {
        systemTaskHelper.systemTask();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "systemTaskSubMod")
    public void paymentSystemSubMod() throws InterruptedException {
        paymentSystemHelper.paymentSystem();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "paymentSystemSubMod")
    public void extensionsSubMod() throws InterruptedException {
        extensionsHelper.extensions();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====SettingsModTest=====FINISH");
//        viewInfoHelper.close();
    }
}
