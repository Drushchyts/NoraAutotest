package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.reportsHelpers.*;

public class ReportsModTest {

    private static final Logger LOG = Logger.getLogger(ReportsModTest.class);
    AddReportsHelper addReportsHelper = new AddReportsHelper();
    SubscriberReportsHelper subscriberReportsHelper = new SubscriberReportsHelper();
    CpsReportsHelper cpsReportsHelper = new CpsReportsHelper();
    StreamReportsHelper streamReportsHelper = new StreamReportsHelper();
    ActivationAuditHelper activationAuditHelper = new ActivationAuditHelper();
    TVodReportsHelper tVodReportsHelper = new TVodReportsHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====ReportsModTest=====START");
    }

    @Test
    public void reportsModTest() throws InterruptedException {
        addReportsHelper.clickReports();
        Thread.sleep(2000);
        LOG.info("Click Report Mod success");
    }

    @Test(dependsOnMethods = "reportsModTest")
    public void subscriberReportsSubModTest() throws InterruptedException {
        subscriberReportsHelper.subscriberReports();
        Thread.sleep(2000);
        LOG.info("Subscriber Report SubMod success");
    }

    @Test(dependsOnMethods = "subscriberReportsSubModTest")
    public void cpsReportsSubModTest() throws InterruptedException {
        cpsReportsHelper.cpsReports();
        Thread.sleep(2000);
        LOG.info("Cps Report SubMod success");
    }

    @Test(dependsOnMethods = "cpsReportsSubModTest")
    public void streamReportsSubModTest() throws InterruptedException {
        streamReportsHelper.streamReports();
        Thread.sleep(2000);
        LOG.info("Stream Report SubMod success");
    }

    @Test(dependsOnMethods = "streamReportsSubModTest")
    public void activationAuditSubModTest() throws InterruptedException {
        activationAuditHelper.streamReports();
        Thread.sleep(2000);
        LOG.info("Activation Audit Report SubMod success");
    }

    @Test(dependsOnMethods = "activationAuditSubModTest")
    public void tVodReportsSubModTest() throws InterruptedException {
        tVodReportsHelper.tVodReports();
        Thread.sleep(2000);
        LOG.info("TVod Report SubMod success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====ReportsModTest=====FINISH\n");
        addReportsHelper.close();
    }
}
