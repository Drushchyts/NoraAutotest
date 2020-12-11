package webNora;

import webNora.helpers.categotiesHelpers.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CategoriesAndSeriesModTest {

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
        System.out.println("TEST=====CategoriesAndSeriesModTest=====START");
    }

    @Test
    public void categoriesTest() throws InterruptedException {
        addCategoriesHelper.clickCategoriesButton();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "categoriesTest")
    public void addTvCategoriesTest() throws InterruptedException {
        tvCategoriesHelper.addTvCategories();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "addTvCategoriesTest")
    public void deleteTvCategoriesTest() throws InterruptedException {
        deleteTvCategoriesHelper.deleteTvCategories();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "deleteTvCategoriesTest")
    public void addRadioCategoriesTest() throws InterruptedException {
        radioCategoriesHelper.addRadioCategories();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "addRadioCategoriesTest")
    public void deleteRadioCategoriesTest() throws InterruptedException {
        deleteRadioCategoriesHelper.deleteRadioCategories();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "deleteRadioCategoriesTest")
    public void addVodCategoriesTest() throws InterruptedException {
        vodCategoriesHelper.addVodCategories();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "addVodCategoriesTest")
    public void deleteVodCategoriesTest() throws InterruptedException {
        deleteVodCategoriesHelper.deleteVodCategories();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "deleteVodCategoriesTest")
    public void addVodSeriesTest() throws InterruptedException {
        vodSeriesHelper.addVodSeries();
        Thread.sleep(1000);
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
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====CategoriesAndSeriesModTest=====FINISH");
//        addCategoriesHelper.close();
    }
}