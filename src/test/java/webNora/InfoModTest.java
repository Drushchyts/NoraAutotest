package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.infoHelpers.ViewInfoHelper;

public class InfoModTest {

    ViewInfoHelper viewInfoHelper = new ViewInfoHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====InfoModTest=====START");
    }

    @Test
    public void infoModTest() throws InterruptedException {
        viewInfoHelper.clickInfo();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "infoModTest")
    public void checkNoraVersion() {
        viewInfoHelper.checkVersionsNora();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====InfoModTest=====FINISH");
//        viewInfoHelper.close();
    }
}
