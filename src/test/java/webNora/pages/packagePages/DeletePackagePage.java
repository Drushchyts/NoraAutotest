package webNora.pages.packagePages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class DeletePackagePage extends AbstractPage {

    private String searchField = "//input[@id='_searchBar']";
    private String namePackage = "TestPackage333";
    private String namePackageField = "//font[contains(text(),'TestPackage333')]";
    private String editButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[3]/div[1]/uib-accordion[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[1]/span[1]/div[1]/a[5]/i[1]";
    private String removeButton = "//button[contains(text(),'Remove')]";
    private String agreeButton = "//button[contains(text(),'Yes')]";

    public DeletePackagePage enterNamePackage() {
        waitForElementVisible(getElementBy(searchField));
        getElement(searchField).clear();
        getElement(searchField).sendKeys("TestPackage333");
        return this;
    }

    public DeletePackagePage checkPackage() throws InterruptedException {
        sleep(2000);
        waitForElementVisible(getElementBy(namePackageField));
        WebElement element = getElement(namePackageField);
        Assert.assertEquals(namePackage, element.getText());
        return this;
    }

    public DeletePackagePage deletePackage() {
        waitForElementClickable(getElementBy(editButton));
        getElement(editButton).click();
        waitForElementClickable(getElementBy(removeButton));
        getElement(removeButton).click();
        waitForElementVisible(getElementBy(agreeButton));
        getElement(agreeButton).click();
        return this;
    }


}
