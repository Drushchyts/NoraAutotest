package webNora.pages.subscribersPages;

import webNora.pages.AbstractPage;

public class ActivationPage extends AbstractPage {

    private String activationButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[2]/a[3]";
    private String selectType = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[3]/b[1]";
    private String type = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[3]/div[1]/span[1]";
    private String commentField = "//textarea[@id='comment']";
    private String cashLocation = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/a[1]/span[2]";
    private String selectCashLocation = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/div[1]/span[1]";
    private String payment = "//label[contains(text(),'USD')]";
    private String totalField = "//input[@id='totalPrice']";
    private String processButton = "//button[@id='in-save1']";
    private String daysCheckBox = "//label[contains(text(),'Days, Months')]";
    private String daysField = "//input[@id='sublength']";

    public ActivationPage clickActivationButton() throws InterruptedException {
        executorWait(activationButton);
//        WebElement element = getElement(activationButton);
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", element);
//        Thread.sleep(2000);
//        waitForElementClickable(getElementBy(activationButton));
//        getElement(activationButton).click();
        return this;
    }

    public ActivationPage clickSelectType() throws InterruptedException {
        Thread.sleep(2000);
        getElement(selectType).click();
        waitForElementClickable(getElementBy(type));
        getElement(type).click();
        return this;
    }

    public ActivationPage clickDaysCheckBox() {
        waitForElementVisible(getElementBy(daysCheckBox));
        getElement(daysCheckBox).click();
        return this;
    }

    public ActivationPage enterDays() {
        waitForElementVisible(getElementBy(daysField));
        getElement(daysField).sendKeys("00");
        return this;
    }

    public ActivationPage selectCashLocation() {
        waitForElementClickable(getElementBy(cashLocation));
        getElement(cashLocation).click();
        waitForElementClickable(getElementBy(selectCashLocation));
        getElement(selectCashLocation).click();
        return this;
    }

    public ActivationPage enterTotal() {
        getElement(totalField).sendKeys("155");
        return this;
    }

    public ActivationPage clickProcess() {
        waitForElementClickable(getElementBy(processButton));
        getElement(processButton).click();
        jsScrollUp();
        return this;
    }
}
