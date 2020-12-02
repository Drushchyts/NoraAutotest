package webNora.pages.reportsPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class CpsReportsPage extends AbstractPage {

    private String cpsReportsButton = "//span[contains(text(),'CPS Reports')]";
    private String checkField = "//span[contains(text(),'Subscribers Reports')]";
    private String checkText = "Subscribers Reports";

    public CpsReportsPage clickCpsReportsButton () {
        waitForElementClickable(getElementBy(cpsReportsButton ));
        getElement(cpsReportsButton ).click();
        return this;
    }

    public CpsReportsPage checkCpsReportsReports() {
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        Assert.assertEquals(checkText, element.getText());
        return this;
    }
}
