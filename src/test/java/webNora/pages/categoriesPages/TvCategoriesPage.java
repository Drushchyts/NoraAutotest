package webNora.pages.categoriesPages;

import webNora.pages.AbstractPage;

public class TvCategoriesPage extends AbstractPage {

    private String tvCategoriesButton = "//body/div[1]/div[1]/aside[1]/div[1]/div[2]/ul[4]/div[1]/ul[1]/li[1]/a[1]/span[1]";
    private String addTvCategoriesButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/button[1]/i[1]";
    private String nameField = "//input[@id='nameSet']";
    private String packageField = "//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String selectPackage = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/div[1]/span[1]";
    private String saveTvCategoriesButton = "//button[contains(text(),'Save')]";

    public TvCategoriesPage clickTvCategoriesButton() {
        waitForElementClickable(getElementBy(tvCategoriesButton));
        getElement(tvCategoriesButton).click();
        return this;
    }

    public TvCategoriesPage clickAddTvCategoriesButton() {
        waitForElementClickable(getElementBy(addTvCategoriesButton));
        getElement(addTvCategoriesButton).click();
        return this;
    }

    public TvCategoriesPage enterName() throws InterruptedException {
        sleep(1000);
        waitForElementVisible(getElementBy(nameField));
        getElement(nameField).sendKeys("0000Test");
        return this;
    }

    public TvCategoriesPage selectPackage() throws InterruptedException {
        getElement(packageField).click();
        waitForElementClickable(getElementBy(selectPackage));
        sleep(1000);
        getElement(selectPackage).click();
        return this;
    }

    public TvCategoriesPage clickSaveTvCategoriesButton() {
        getElement(saveTvCategoriesButton).click();
        return this;
    }
}
