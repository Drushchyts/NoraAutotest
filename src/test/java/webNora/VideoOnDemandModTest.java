package webNora;

import org.apache.log4j.Logger;
import webNora.helpers.vodHelpers.AddVodHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.vodHelpers.DeleteVodHelper;

public class VideoOnDemandModTest {

    private static final Logger LOG = Logger.getLogger(VideoOnDemandModTest.class);

    AddVodHelper addVodHelper = new AddVodHelper();
    DeleteVodHelper deleteVodHelper = new DeleteVodHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====VideoOnDemandModTest=====START");
    }

    @Test
    public void vodTest() {
        addVodHelper.clickVodButton();
        LOG.info("Click Vod Mod success");
    }

    @Test(dependsOnMethods = "vodTest")
    public void addVideoOnDemand() throws InterruptedException {
        addVodHelper.addVod();
        LOG.info("Add Video on Demand success");
    }

    @Test(dependsOnMethods = "addVideoOnDemand")
    public void deleteVideoOnDemand() {
        deleteVodHelper.deleteVod();
        LOG.info("Delete Video on Demand success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====VideoOnDemandModTest=====FINISH");
    }
}
