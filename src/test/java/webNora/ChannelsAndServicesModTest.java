package webNora;

import org.apache.log4j.Logger;
import org.omg.PortableInterceptor.LOCATION_FORWARD;
import webNora.helpers.channelServiceHelpers.AddChannelServiceHelper;
import webNora.helpers.channelServiceHelpers.CatchUpTvHelper;
import webNora.helpers.channelServiceHelpers.SmartCatchUpHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChannelsAndServicesModTest {

    private static final Logger LOG = Logger.getLogger(ChannelsAndServicesModTest.class);
    AddChannelServiceHelper addChannelServiceHelper = new AddChannelServiceHelper();
    CatchUpTvHelper catchUpTvHelper = new CatchUpTvHelper();
    SmartCatchUpHelper smartCatchUpHelper = new SmartCatchUpHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====ChannelsAndServicesModTest=====START");
    }

    @Test
    public void channelServiceTest() throws InterruptedException {
        addChannelServiceHelper.clickChannelServiceButton();
        Thread.sleep(1000);
        LOG.info("Click Channel Service Mod success");
    }

    @Test(dependsOnMethods = "channelServiceTest")
    public void addCatchUpTv() throws InterruptedException {
        catchUpTvHelper.addCatchUpTv();
        Thread.sleep(1000);
        LOG.info("Add CatchUp Mod success");
    }

    @Test(dependsOnMethods = "addCatchUpTv")
    public void addSmartCatchup() throws InterruptedException {
        smartCatchUpHelper.addCatchUpTv();
        Thread.sleep(1000);
        LOG.info("Add Smart CatchUp success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====ChannelsAndServicesModTest=====FINISH\n");
    }
}
