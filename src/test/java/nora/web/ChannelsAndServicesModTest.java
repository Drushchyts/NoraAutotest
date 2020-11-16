package nora.web;

import nora.web.helpers.channelServiceHelpers.AddChannelServiceHelper;
import nora.web.helpers.channelServiceHelpers.CatchUpTvHelper;
import nora.web.helpers.channelServiceHelpers.SmartCatchUpHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChannelsAndServicesModTest {

    AddChannelServiceHelper addChannelServiceHelper = new AddChannelServiceHelper();
    CatchUpTvHelper catchUpTvHelper = new CatchUpTvHelper();
    SmartCatchUpHelper smartCatchUpHelper = new SmartCatchUpHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====ChannelsAndServicesModTest=====START");
    }

    @Test
    public void channelServiceTest() throws InterruptedException {
        addChannelServiceHelper.clickChannelServiceButton();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "channelServiceTest")
    public void addCatchUpTv() throws InterruptedException {
        catchUpTvHelper.addCatchUpTv();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "addCatchUpTv")
    public void addSmartCatchup() throws InterruptedException {
        smartCatchUpHelper.addCatchUpTv();
        Thread.sleep(1000);

    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====ChannelsAndServicesModTest=====FINISH");
//        addChannelServiceHelper.close();
    }
}
