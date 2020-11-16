package nora.web;

import nora.web.helpers.categotiesHelpers.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CategoriesAndSeriesModTest {

    AddCategoriesHelper addCategoriesHelper = new AddCategoriesHelper();
    TvCategoriesHelper tvCategoriesHelper = new TvCategoriesHelper();
    RadioCategoriesHelper radioCategoriesHelper = new RadioCategoriesHelper();
    VodCategoriesHelper vodCategoriesHelper = new VodCategoriesHelper();
    VodSeriesHelper vodSeriesHelper = new VodSeriesHelper();


    @BeforeClass
    public void startUp() {
        System.out.println("TEST=====CategoriesAndSeriesModTest=====START");
    }

    @Test
    public void categoriesTest() throws InterruptedException {
        addCategoriesHelper.clickCategoriesButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "categoriesTest")
    public void addTvCategoriesTest() throws InterruptedException {
        tvCategoriesHelper.addTvCategories();
    }

    @Test(dependsOnMethods = "addTvCategoriesTest")
    public void addRadioCategoriesTest() throws InterruptedException {
        radioCategoriesHelper.addRadioCategories();
    }

    @Test(dependsOnMethods = "addRadioCategoriesTest")
    public void addVodCategoriesTest() throws InterruptedException {
        vodCategoriesHelper.addVodCategories();
    }

    @Test(dependsOnMethods = "addVodCategoriesTest")
    public void addVodSeriesTest() throws InterruptedException {
        vodSeriesHelper.addVodSeries();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("TEST=====CategoriesAndSeriesModTest=====FINISH");
//        addCategoriesHelper.close();
    }
}