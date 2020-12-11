package webNora.pages.categoriesPages;

import webNora.pages.AbstractPage;

public class VodCategoriesPage extends AbstractPage {

    private String vodCategoriesButton = "//span[contains(text(),'VOD Categories')]";
    private String addVodCategoriesButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/button[1]/i[1]";
    private String nameField = "//input[@id='nameSet']";
    private String packageField = "//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String selectPackage = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/div[1]/span[1]";
    private String saveVodCategoriesButton = "//button[contains(text(),'Save')]";

    public VodCategoriesPage clickVodCategoriesButton() {
        waitForElementClickable(getElementBy(vodCategoriesButton));
        getElement(vodCategoriesButton).click();
        return this;
    }

    public VodCategoriesPage clickAddVodCategoriesButton() throws InterruptedException {
        sleep(1000);
        waitForElementClickable(getElementBy(addVodCategoriesButton));
        getElement(addVodCategoriesButton).click();
        return this;
    }

    public VodCategoriesPage enterName() throws InterruptedException {
        sleep(1000);
        waitForElementVisible(getElementBy(nameField));
        getElement(nameField).sendKeys("0000Test");
        return this;
    }

    public VodCategoriesPage selectPackage() throws InterruptedException {
        getElement(packageField).click();
        waitForElementClickable(getElementBy(selectPackage));
        sleep(1000);
        getElement(selectPackage).click();
        return this;
    }

    public VodCategoriesPage clickSaveVodCategoriesButton() {
        getElement(saveVodCategoriesButton).click();
        return this;
    }
}
