package webNora;

import org.apache.log4j.Logger;
import webNora.helpers.radioHelpers.AddRadioHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioChannelsModTest {

    private static final Logger LOG = Logger.getLogger(RadioChannelsModTest.class);
    AddRadioHelper addRadioHelper = new AddRadioHelper();

    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====RadioChannelsModTest=====START");
    }


    @Test
    public void radioTest() throws InterruptedException {
        addRadioHelper.clickRadioButton();
        Thread.sleep(2000);
        LOG.info("Click Radio Mod success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====RadioChannelsModTest=====FINISH\n");
    }
}
