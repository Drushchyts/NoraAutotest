package webNora.pages.distributorsPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class CheckAndDeleteDistributorPage extends AbstractPage {

    private String searchField = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/st-select-multiple[1]/div[1]/div[1]/div[1]/input[1]";
    private String selectPackage = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/st-select-multiple[1]/div[1]/div[1]/ul[1]/li[1]/div[3]/span[1]/span[1]";
    private String checkField = "//a[contains(text(),'sectant@mail.ru')]";
    private String namePackage = "sectant@mail.ru";
    private String clickOther = "//th[contains(text(),'User')]";
    private String deleteDistributorButton = "//tbody/tr[2]/td[9]/div[1]/button[1]/span[1]";
    private String agreeDeleteButton = "//button[contains(text(),'Yes')]";


    public CheckAndDeleteDistributorPage enterPackageSearch() {
        waitForElementVisible(getElementBy(searchField));
        getElement(searchField).click();
        waitForElementClickable(getElementBy(selectPackage));
        getElement(selectPackage).click();
        return this;
    }

    public CheckAndDeleteDistributorPage checkNamePackage() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementClickable(getElementBy(clickOther));
        getElement(clickOther).click();
        WebElement element = getElement(checkField);
        Assert.assertEquals(namePackage, element.getText());
        return this;
    }

    public CheckAndDeleteDistributorPage deleteDistributor() {
        waitForElementClickable(getElementBy(deleteDistributorButton));
        getElement(deleteDistributorButton).click();
        waitForElementClickable(getElementBy(agreeDeleteButton));
        getElement(agreeDeleteButton).click();
        return this;
    }
}
