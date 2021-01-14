package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.distributorsHelpers.AddDistributorHelper;
import webNora.helpers.distributorsHelpers.CheckAndDeleteDistributorHelper;

public class DistributorsModTest {


    private static final Logger LOG = Logger.getLogger(DistributorsModTest.class);
    AddDistributorHelper addDistributorHelper = new AddDistributorHelper();
    CheckAndDeleteDistributorHelper checkAndDeleteDistributorHelper = new CheckAndDeleteDistributorHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====DistributorsModTest=====START");
    }

    @Test
    public void distributorModTest() throws InterruptedException {
        addDistributorHelper.clickDistributors();
        Thread.sleep(1000);
        LOG.info("Click Distributor Mod success");
    }

    @Test(dependsOnMethods = "distributorModTest",skipFailedInvocations = true)
    public void addDistributor() throws InterruptedException {
        addDistributorHelper.addDistributor();
        Thread.sleep(1000);
        LOG.info("Add Distributor Mod success");
    }

    @Test(dependsOnMethods = "addDistributor")
    public void checkAndDeleteDistributor() throws InterruptedException {
        checkAndDeleteDistributorHelper.checkAndDeleteDistributor();
        Thread.sleep(1000);
        LOG.info("Check and Delete Distributor Mod success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====DistributorsModTest=====FINISH\n");
    }
}
