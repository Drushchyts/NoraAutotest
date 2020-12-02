package webNora.pages.reportsPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class StreamReportsPage extends AbstractPage {

    private String streamReportsButton = "//span[contains(text(),'Stream Reports')]";
    private String checkField = "//header/div[1]/div[1]/ul[1]/li[2]/span[1]";
    private String checkText = "Stream Reports";

    public StreamReportsPage clickStreamReportsButton() {
        waitForElementClickable(getElementBy(streamReportsButton ));
        getElement(streamReportsButton ).click();
        return this;
    }

    public StreamReportsPage checkStreamReports() {
        waitForElementVisible(getElementBy(checkField));
        WebElement element = getElement(checkField);
        Assert.assertEquals(checkText, element.getText());
        return this;
    }
}
