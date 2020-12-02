package webNora.pages.reportsPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class ActivationAuditPage extends AbstractPage {

    private String activationAuditButton = "//span[contains(text(),'Activation Audit')]";
    private String checkField = "//span[contains(text(),'Activation Audit Reports')]";
    private String checkText = "Activation Audit Reports";

    public ActivationAuditPage clickActivationAuditButton() {
        waitForElementClickable(getElementBy(activationAuditButton));
        getElement(activationAuditButton).click();
        return this;
    }

    public ActivationAuditPage checkActivationAudit() {
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        Assert.assertEquals(checkText, element.getText());
        return this;
    }
}
