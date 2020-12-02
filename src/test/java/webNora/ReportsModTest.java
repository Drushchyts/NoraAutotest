package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.reportsHelpers.*;

public class ReportsModTest {

    AddReportsHelper addReportsHelper = new AddReportsHelper();
    SubscriberReportsHelper subscriberReportsHelper = new SubscriberReportsHelper();
    CpsReportsHelper cpsReportsHelper = new CpsReportsHelper();
    StreamReportsHelper streamReportsHelper = new StreamReportsHelper();
    ActivationAuditHelper activationAuditHelper = new ActivationAuditHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====ReportsModTest=====START");
    }

    @Test
    public void reportsModTest() throws InterruptedException {
        addReportsHelper.clickReports();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "reportsModTest")
    public void subscriberReportsSubModTest() throws InterruptedException {
        subscriberReportsHelper.subscriberReports();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "subscriberReportsSubModTest")
    public void cpsReportsSubModTest() throws InterruptedException {
        cpsReportsHelper.cpsReports();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "cpsReportsSubModTest")
    public void streamReportsSubModTest() throws InterruptedException {
        streamReportsHelper.streamReports();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "streamReportsSubModTest")
    public void activationAuditSubModTest() throws InterruptedException {
        activationAuditHelper.streamReports();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====ReportsModTest=====FINISH");
        addReportsHelper.close();
    }
}
