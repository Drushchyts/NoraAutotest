package webNora.pages.noraGoPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class VerifyToaPage extends AbstractPage {

    private String verifyText = "//div[contains(text(),'Hello and welcome to our Terms and Conditions of U')]";
    private String acceptButton = "//button[contains(text(),'Accept')]";

    public VerifyToaPage checkToaText(){
        WebElement element = getElement(verifyText);
        Assert.assertTrue(element.isDisplayed(),"Nora TOA not displayed");
        return this;
    }

    public VerifyToaPage clickAcceptButton(){
        getElement(acceptButton).click();
        return this;

    }
}
