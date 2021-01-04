package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.shoppingCardHelpers.SelectPackageHelper;
import webNora.helpers.shoppingCardHelpers.ShoppingCardHelper;

public class ShoppingCardTest {

    private static final Logger LOG = Logger.getLogger(ShoppingCardTest.class);
    ShoppingCardHelper shoppingCardHelper = new ShoppingCardHelper();
    SelectPackageHelper selectPackageHelper = new SelectPackageHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====ShoppingCardTest=====START");
    }

    @Test
    public void openShoppingCardPage() throws InterruptedException {
        shoppingCardHelper.openShoppingCard();
        Thread.sleep(2000);
        LOG.info("Open Shopping Card Page success");
    }

    @Test(dependsOnMethods = "openShoppingCardPage",skipFailedInvocations = true)
    public void threeInOneTest() throws InterruptedException {
        selectPackageHelper.threeInOne();
        Thread.sleep(2000);
        LOG.info("Three in one package selected");
    }


    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====ShoppingCardTest=====FINISH\n");
        shoppingCardHelper.close();
    }
}

