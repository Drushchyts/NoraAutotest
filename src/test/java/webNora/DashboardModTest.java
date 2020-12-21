package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.automation.core.FrameworkCore;
import webNora.automation.core.utils.IOUtils;
import webNora.helpers.AbstractHelper;
import webNora.helpers.dashboardHelpers.CheckMetricsHelper;
import webNora.helpers.dashboardHelpers.DashboardHelper;
import webNora.helpers.dashboardHelpers.SetupDashboardHelper;

public class DashboardModTest extends FrameworkCore {

    private static final Logger LOG = Logger.getLogger(DashboardModTest.class);
    AbstractHelper abstractHelper = new AbstractHelper();
    DashboardHelper dashboardHelper = new DashboardHelper();
    SetupDashboardHelper setupDashboardHelper = new SetupDashboardHelper();
    CheckMetricsHelper checkMetricsHelper = new CheckMetricsHelper();

    private String username;
    private String password;

    @BeforeClass
    public void setUp() {
        LOG.info("TEST=====DashboardModTest=====START");
        username = IOUtils.loadGenericProperties("username", "configuration");
        password = IOUtils.loadGenericProperties("password", "configuration");
        abstractHelper.openAdminPage();
        abstractHelper.loginAdmin(username, password);

    }

    @Test
    public void dashboardModTest() throws InterruptedException {
        dashboardHelper.dashboard();
        Thread.sleep(2000);
        LOG.info("Open Dashboard success");
    }

    @Test(dependsOnMethods = "dashboardModTest", skipFailedInvocations = true)
    public void verifyDashboard() throws InterruptedException {
        checkMetricsHelper.verifyMetrics();
        Thread.sleep(2000);
        LOG.info("Verify Metrics success");
    }

    @Test(dependsOnMethods = "verifyDashboard", skipFailedInvocations = true)
    public void setupDashboardTest() throws InterruptedException {
        setupDashboardHelper.openSetupDashboard();
        Thread.sleep(2000);
        LOG.info("Open Dashboard Setup success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====DashboardModTest=====FINISH\n");
    }
}
