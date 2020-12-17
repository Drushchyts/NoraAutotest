package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.infoHelpers.ViewInfoHelper;

public class InfoModTest {

    private static final Logger LOG = Logger.getLogger(InfoModTest.class);
    ViewInfoHelper viewInfoHelper = new ViewInfoHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====InfoModTest=====START");
    }

    @Test
    public void infoModTest() throws InterruptedException {
        viewInfoHelper.clickInfo();
        Thread.sleep(2000);
        LOG.info("Click Info Mod success");
    }

    @Test(dependsOnMethods = "infoModTest")
    public void checkNoraVersion() {
        viewInfoHelper.checkVersionsNora();
        LOG.info("Check Nora Version success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====InfoModTest=====FINISH");
    }
}
