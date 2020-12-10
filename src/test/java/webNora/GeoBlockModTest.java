package webNora;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webNora.helpers.geoBlockHelpers.AddGeoBlockHelper;

public class GeoBlockModTest {

    AddGeoBlockHelper addGeoBlockHelper = new AddGeoBlockHelper();

    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====GeoBlockModTest=====START");
    }

    @Test(skipFailedInvocations = true)
    public void clickGeoBlockMod() throws InterruptedException {
        addGeoBlockHelper.clickGeoMod();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====GeoBlockModTest=====FINISH");
//        viewInfoHelper.close();
    }

}
