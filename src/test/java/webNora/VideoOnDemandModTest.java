package webNora;

import webNora.helpers.vodHelpers.AddVodHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.vodHelpers.DeleteVodHelper;

public class VideoOnDemandModTest {

    AddVodHelper addVodHelper = new AddVodHelper();
    DeleteVodHelper deleteVodHelper = new DeleteVodHelper();

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

    @Test(dependsOnMethods = "addVideoOnDemand")
    public void deleteVideoOnDemand() {
        deleteVodHelper.deleteVod();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====VideoOnDemandModTest=====FINISH");
//        addVodHelper.close();
    }
}
