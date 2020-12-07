package webNora.pages.externalUserPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class CheckAndDeleteUserPage extends AbstractPage {

    private String searchField = "//input[@id='_searchBar']";
    private String nameUser = "TestName";
    private String checkField = "//td[contains(text(),'TestName')]";
    private String deleteButton = "//tbody/tr[1]/td[4]/div[1]/button[1]";
    private String agreeButton = "//button[contains(text(),'Yes')]";

    public CheckAndDeleteUserPage enterNameForSearch() {
        waitForElementVisible(getElementBy(searchField));
        getElement(searchField).sendKeys(nameUser);
        return this;
    }

    public CheckAndDeleteUserPage checkUser() {
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        Assert.assertEquals(nameUser, element.getText());
        return this;
    }

    public CheckAndDeleteUserPage deleteExternalUser() throws InterruptedException {
        sleep(2000);
        waitForElementClickable(getElementBy(deleteButton));
        getElement(deleteButton).click();
        waitForElementClickable(getElementBy(agreeButton));
        getElement(agreeButton).click();
        return this;
    }
}
