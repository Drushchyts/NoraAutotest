package webNora.pages.usersPages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webNora.pages.AbstractPage;


public class SearchAndDeleteUserPage extends AbstractPage {

    private String searchInput = "//body[1]/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/span[1]/i[1]";
    private String searchField = "//body[1]/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/span[1]/div[1]/input[1]";
    private String userNameField = "//*[@id=\"app-content\"]/div/ui-view/ui-view/div/div/div/div/div[1]/div/div/table/tbody/tr[1]/td[1]";
    private String name = "First Name Last Name";
    private String deleteUserButton = "//tbody/tr[1]/td[8]/div[1]/button[1]/span[1]";
    private String agreeDeleteUserButton = "//button[contains(text(),'Yes')]";

    public SearchAndDeleteUserPage clickSearchInputButton() {
        getElement(searchInput).click();
        return this;
    }

    public SearchAndDeleteUserPage enterSearchInput() {
        waitForElementVisible(getElementBy(searchField));
        getElement(searchField).sendKeys("First");
        return this;
    }

    public SearchAndDeleteUserPage checkUser() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementVisible(getElementBy(userNameField));
        WebElement element = getElement(userNameField);
        Assert.assertEquals(name, element.getText());

        return this;

    }

    public SearchAndDeleteUserPage deleteUser() {
        getElement(deleteUserButton).click();
        waitForElementClickable(getElementBy(agreeDeleteUserButton));
        getElement(agreeDeleteUserButton).click();
        return this;
    }


}

