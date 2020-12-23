package webNora.pages.infoPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;

public class ViewInfoPage extends AbstractPage {

    private String infoModButton = "//span[contains(text(),'Info')]";
    private final String noraVersion = "//td[contains(text(),'Nora version')]";
    private final String noraFrontendVersion = "//td[contains(text(),'Frontend version')]";


    public ViewInfoPage clickInfoModButton() {
        getElement(infoModButton).click();
        return this;
    }

    public ViewInfoPage checkNoraVersion(){
        WebElement elementOne = getElement(noraVersion);
        String textOne = "Nora version";
        Assert.assertEquals(textOne,elementOne.getText());
        return this;
    }

    public ViewInfoPage checkNoraFrontendVersion(){
        WebElement elementTwo = getElement(noraFrontendVersion);
        String textTwo = "Frontend version";
        Assert.assertEquals(textTwo,elementTwo.getText());
        return this;
    }

}
