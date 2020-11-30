package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.distributorsHelpers.AddDistributorHelper;
import webNora.helpers.distributorsHelpers.CheckAndDeleteDistributorHelper;

public class DistributorsModTest {

    AddDistributorHelper addDistributorHelper = new AddDistributorHelper();
    CheckAndDeleteDistributorHelper checkAndDeleteDistributorHelper = new CheckAndDeleteDistributorHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====DistributorsModTest=====START");
    }

    @Test
    public void distributorModTest() throws InterruptedException {
        addDistributorHelper.clickDistributors();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "distributorModTest")
    public void addDistributor() throws InterruptedException {
        addDistributorHelper.addDistributor();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "addDistributor")
    public void checkAndDeleteDistributor() throws InterruptedException {
        checkAndDeleteDistributorHelper.checkAndDeleteDistributor();
        Thread.sleep(1000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====DistributorsModTest=====FINISH");
//        addDistributorHelper.close();
    }
}
