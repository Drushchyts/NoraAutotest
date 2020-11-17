package webNora;

import webNora.helpers.tvChannelsHelpers.AddTvChannelsHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TvChannelsModTest {


    AddTvChannelsHelper addTvChannelsHelper = new AddTvChannelsHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====TvChannelMod=====START");
    }

    @Test
    public void tvChannelsTest() {
        addTvChannelsHelper.clickTvChannelsButton();
    }

    @Test(dependsOnMethods = "tvChannelsTest")
    public void addChannel() throws InterruptedException {
        addTvChannelsHelper.addChannel();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Test=====TvChannelMod=====FINISH");
    }
}
