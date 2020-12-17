package webNora;

import apiNora.subscribers.CreateSubscriberApi;
import org.apache.log4j.Logger;
import webNora.helpers.tvChannelsHelpers.AddTvChannelsHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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
    public void tvChannelsTest() {
        addTvChannelsHelper.clickTvChannelsButton();
    }

    @Test(dependsOnMethods = "tvChannelsTest")
    public void addChannel() throws InterruptedException {
        addTvChannelsHelper.addChannel();
    }

    @Test(dependsOnMethods = "addChannel")
    public void deleteChannel() {
        deleteTvChannelHelper.deleteChannel();
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====TvChannelsModTest=====FINISH");
    }
}
