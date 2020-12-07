package webNora.pages.packagePages;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class AddCouponsPage extends AbstractPage {

    private String couponsButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/a[4]";
    private String addCouponButton = "//a[contains(text(),'Add New')]";
    private String nameField = "//input[@id='name']";
    private String generatorCode = "//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/a[1]";
    private String amountField = "//input[@id='amount']";
    private String currencyField = "//select[@id='currencies']";
    private String selectCurrency = "//option[contains(text(),'TWD')]";
    private String createButton = "//button[contains(text(),'Create')]";
    private String couponsField = "//td[contains(text(),'TestCouponsName')]";
    private String nameCoupon = "TestCouponsName";


    public AddCouponsPage clickCouponsButton() {
        getElement(couponsButton).click();
        return this;
    }

    public AddCouponsPage clickAddCouponButton() {
        waitForElementClickable(getElementBy(addCouponButton));
        getElement(addCouponButton).click();
        return this;
    }

    public AddCouponsPage enterNameCoupons() {
        waitForElementVisible(getElementBy(nameField));
        getElement(nameField).sendKeys(nameCoupon);
        return this;
    }

    public AddCouponsPage clickGeneratorCode() {
        getElement(generatorCode).click();
        return this;
    }

    public AddCouponsPage enterAmount() {
        getElement(amountField).clear();
        getElement(amountField).sendKeys("12");
        return this;
    }

//    public AddCouponsPage selectCurrencyCoupons() {
//        getElement(currencyField).click();
//        waitForElementClickable(getElementBy(selectCurrency));
//        getElement(selectCurrency).click();
//        return this;
//    }

    public AddCouponsPage clickCreateButton() {
        waitForElementClickable(getElementBy(createButton));
        getElement(createButton).click();
        return this;
    }

    public AddCouponsPage checkCreateCoupon() {
        waitForElementVisible(getElementBy(couponsField));
        WebElement element = getElement(couponsField);
        Assert.assertEquals(nameCoupon, element.getText());
        return this;

    }
}
