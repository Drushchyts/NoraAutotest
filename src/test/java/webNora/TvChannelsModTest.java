package webNora;

import webNora.helpers.tvChannelsHelpers.AddTvChannelsHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.tvChannelsHelpers.DeleteTvChannelHelper;

public class TvChannelsModTest {


    AddTvChannelsHelper addTvChannelsHelper = new AddTvChannelsHelper();
    DeleteTvChannelHelper deleteTvChannelHelper = new DeleteTvChannelHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====TvChannelsModTest=====START");
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
        System.out.println("TEST=====TvChannelsModTest=====FINISH");
    }
}
