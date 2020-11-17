package webNora;

import webNora.helpers.vodHelpers.AddVodHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VideoOnDemandModTest {

    AddVodHelper addVodHelper = new AddVodHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====VideoOnDemandModTest=====START");
    }

    @Test
    public void vodTest() {
        addVodHelper.clickVodButton();
    }

    @Test(dependsOnMethods = "vodTest")
    public void addVideoOnDemand() throws InterruptedException {
        addVodHelper.addVod();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====VideoOnDemandModTest=====FINISH");
//        addVodHelper.close();
    }
}
