package webNora;

import org.apache.log4j.Logger;
import webNora.helpers.categotiesHelpers.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CategoriesAndSeriesModTest {

    private static final Logger LOG = Logger.getLogger(CategoriesAndSeriesModTest.class);
    AddCategoriesHelper addCategoriesHelper = new AddCategoriesHelper();
    TvCategoriesHelper tvCategoriesHelper = new TvCategoriesHelper();
    RadioCategoriesHelper radioCategoriesHelper = new RadioCategoriesHelper();
    VodCategoriesHelper vodCategoriesHelper = new VodCategoriesHelper();
    VodSeriesHelper vodSeriesHelper = new VodSeriesHelper();
    DeleteTvCategoriesHelper deleteTvCategoriesHelper = new DeleteTvCategoriesHelper();
    DeleteRadioCategoriesHelper deleteRadioCategoriesHelper = new DeleteRadioCategoriesHelper();
    DeleteVodCategoriesHelper deleteVodCategoriesHelper = new DeleteVodCategoriesHelper();
    DeleteVodSeriesHelper deleteVodSeriesHelper = new DeleteVodSeriesHelper();
    SeriesCategoriesHelper seriesCategoriesHelper = new SeriesCategoriesHelper();


    @BeforeClass
    public void startUp() {
        LOG.info("TEST=====CategoriesAndSeriesModTest=====START");
    }

    @Test
    public void categoriesTest() throws InterruptedException {
        addCategoriesHelper.clickCategoriesButton();
        Thread.sleep(1000);
        LOG.info("Click Categories Mod success");
    }

    @Test(dependsOnMethods = "categoriesTest")
    public void addTvCategoriesTest() throws InterruptedException {
        tvCategoriesHelper.addTvCategories();
        Thread.sleep(1000);
        LOG.info("Add Tv Categories success");
    }

    @Test(dependsOnMethods = "addTvCategoriesTest")
    public void deleteTvCategoriesTest() throws InterruptedException {
        deleteTvCategoriesHelper.deleteTvCategories();
        Thread.sleep(1000);
        LOG.info("Delete Tv Categories success");
    }

    @Test(dependsOnMethods = "deleteTvCategoriesTest")
    public void addRadioCategoriesTest() throws InterruptedException {
        radioCategoriesHelper.addRadioCategories();
        Thread.sleep(1000);
        LOG.info("Add Radio Categories success");
    }

    @Test(dependsOnMethods = "addRadioCategoriesTest")
    public void deleteRadioCategoriesTest() throws InterruptedException {
        deleteRadioCategoriesHelper.deleteRadioCategories();
        Thread.sleep(1000);
        LOG.info("Delete Radio Categories success");
    }

    @Test(dependsOnMethods = "deleteRadioCategoriesTest")
    public void addVodCategoriesTest() throws InterruptedException {
        vodCategoriesHelper.addVodCategories();
        Thread.sleep(1000);
        LOG.info("Add Vod Categories success");
    }

    @Test(dependsOnMethods = "addVodCategoriesTest")
    public void deleteVodCategoriesTest() throws InterruptedException {
        deleteVodCategoriesHelper.deleteVodCategories();
        Thread.sleep(1000);
        LOG.info("Delete Vod Categories success");
    }

    @Test(dependsOnMethods = "deleteVodCategoriesTest")
    public void addVodSeriesTest() throws InterruptedException {
        vodSeriesHelper.addVodSeries();
        Thread.sleep(1000);
        LOG.info("Add Vod Series success");
    }

//    @Test(dependsOnMethods = "addVodSeriesTest")
//    public void deleteVodSeriesTest() throws InterruptedException {
//        deleteVodSeriesHelper.deleteVodSeries();
//        Thread.sleep(1000);
//    }

    @Test(dependsOnMethods = "addVodSeriesTest")
    public void seriesCategoriesTest() throws InterruptedException {
        seriesCategoriesHelper.clickSeriesCategories();
        Thread.sleep(1000);
        LOG.info("Series Categories success");
    }

    @AfterClass
    public void tearDown() {
        LOG.info("TEST=====CategoriesAndSeriesModTest=====FINISH\n");
    }
}