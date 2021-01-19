package webNora;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.tvChannelsHelpers.AddTvChannelsHelper;
import webNora.helpers.tvChannelsHelpers.DeleteTvChannelHelper;

public class TvChannelsModTest {

    private static final Logger LOG = Logger.getLogger(TvChannelsModTest.class);
    AddTvChannelsHelper addTvChannelsHelper = new AddTvChannelsHelper();
    DeleteTvChannelHelper deleteTvChannelHelper = new DeleteTvChannelHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====TvChannelsModTest=====START");
    }

    @Test
    public void tvChannelsTest() throws InterruptedException {
        addTvChannelsHelper.clickTvChannelsButton();
        Thread.sleep(2000);
        LOG.info("Click Tv Channel Mod success");
    }

    @Test(dependsOnMethods = "tvChannelsTest", alwaysRun = true, skipFailedInvocations = true)
    public void addChannel() throws InterruptedException {
        addTvChannelsHelper.addChannel();
        Thread.sleep(2000);
        LOG.info("Add Channel success");
    }

    @Test(dependsOnMethods = "addChannel", alwaysRun = true, skipFailedInvocations = true)
    public void deleteChannel() throws InterruptedException {
        deleteTvChannelHelper.deleteChannel();
        Thread.sleep(2000);
        LOG.info("Delete Channel success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====TvChannelsModTest=====FINISH\n");
    }
}
