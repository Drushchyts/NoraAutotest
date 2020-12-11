package webNora.pages.categoriesPages;

import webNora.pages.AbstractPage;

public class RadioCategoriesPage extends AbstractPage {

    private String radioCategoriesButton = "//span[contains(text(),'Radio Categories')]";
    private String addTvCategoriesButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/button[1]/i[1]";
    private String nameField = "//input[@id='nameSet']";
    private String packageField = "//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String selectPackage = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/div[1]/span[1]";
    private String saveTvCategoriesButton = "//button[contains(text(),'Save')]";

    public RadioCategoriesPage clickRadioCategoriesButton() {
        waitForElementClickable(getElementBy(radioCategoriesButton));
        getElement(radioCategoriesButton).click();
        return this;
    }

    public RadioCategoriesPage clickAddRadioCategoriesButton() throws InterruptedException {
        sleep(1000);
        waitForElementClickable(getElementBy(addTvCategoriesButton));
        getElement(addTvCategoriesButton).click();
        return this;
    }

    public RadioCategoriesPage enterName() throws InterruptedException {
        sleep(1000);
        waitForElementVisible(getElementBy(nameField));
        getElement(nameField).sendKeys("0000Test");
        return this;
    }

    public RadioCategoriesPage selectPackage() throws InterruptedException {
        getElement(packageField).click();
        waitForElementClickable(getElementBy(selectPackage));
        sleep(1000);
        getElement(selectPackage).click();
        return this;
    }

    public RadioCategoriesPage clickSaveRadioCategoriesButton() {
        getElement(saveTvCategoriesButton).click();
        return this;
    }
}
