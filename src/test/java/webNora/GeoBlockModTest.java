package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.geoBlockHelpers.AddGeoBlockHelper;

public class GeoBlockModTest {

    private static final Logger LOG = Logger.getLogger(GeoBlockModTest.class);
    AddGeoBlockHelper addGeoBlockHelper = new AddGeoBlockHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====GeoBlockModTest=====START");
    }

    @Test(skipFailedInvocations = true)
    public void clickGeoBlockMod() throws InterruptedException {
        addGeoBlockHelper.clickGeoMod();
        Thread.sleep(2000);
        LOG.info("Click Geo Block Mod success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====GeoBlockModTest=====FINISH");
    }

}
