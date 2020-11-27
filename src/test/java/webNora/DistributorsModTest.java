package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.distributorsHelpers.AddDistributorHelper;

public class DistributorsModTest {

    AddDistributorHelper addDistributorHelper = new AddDistributorHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====DistributorsModTest=====START");
    }

    @Test
    public void distributorModTest() throws InterruptedException {
        addDistributorHelper.clickDistributors();
        Thread.sleep(1000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====DistributorsModTest=====FINISH");
        addDistributorHelper.close();
    }
}
