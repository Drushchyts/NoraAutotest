package webNora.pages.noraGoPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class AppInfoPage extends AbstractPage {

    private String settingsButton = "//button[contains(text(),'SETTINGS')]";
    private String appInfoButton = "//header/div[4]/ul[1]/li[7]/span[1]/ul[1]/li[1]/a[1]";
    private String checkField = "//th[contains(text(),'Account ID')]";
    private String nameField = "Account ID";
    private String closeAppInfoButton = "//header/div[@id='sysModal']/a[@id='close-sysModal']/i[1]";


    public AppInfoPage clickSettingsButton() {
        getElement(settingsButton).click();
        return this;
    }

    public AppInfoPage clickAppInfoButton() {
        waitForElementClickable(getElementBy(appInfoButton));
        getElement(appInfoButton).click();
        return this;
    }

    public AppInfoPage checkAccountID() throws InterruptedException {
        sleep(2000);
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        Assert.assertEquals(nameField, element.getText());
        return this;
    }

    public AppInfoPage clickCloseAppInfo() {
        getElement(closeAppInfoButton).click();
        return this;
    }
}
