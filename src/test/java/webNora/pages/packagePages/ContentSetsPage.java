package webNora.pages.packagePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import webNora.pages.AbstractPage;

import java.awt.*;
import java.time.Duration;


public class ContentSetsPage extends AbstractPage {


    private String contentSetsButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/a[3]";
    private String addContentSetsButton = "//a[contains(text(),'Add New')]";
    private String elemOne = "//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/i[1]";
    private String elemTwo = "//div[@class='col-md-12 dragdropscrollable grouplist nopadding-left']//div[@class='drophere']";
    private String vodNameField = "//input[@id='name']";
    private String searchMovies = "//body/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
    private String createSetButton = "//button[contains(text(),'Create')]";

    public ContentSetsPage clickContentSetsButton() {
        getElement(contentSetsButton).click();
        return this;
    }

    public ContentSetsPage clickAddContentSetsButton() {
        waitForElementClickable(getElementBy(addContentSetsButton));
        getElement(addContentSetsButton).click();
        return this;
    }

    public ContentSetsPage enterVodName() {
        waitForElementVisible(getElementBy(vodNameField));
        getElement(vodNameField).sendKeys("TestVodSet");
        return this;

    }

    public ContentSetsPage enterSearchNameMovies() {
        getElement(searchMovies).sendKeys("33");
        return this;
    }


    public void dragAndDropMovies() {
        waitForElementClickable(getElementBy(elemOne));
        waitForElementClickable(getElementBy(elemTwo));
        dragDrop(elemOne, elemTwo);
    }

    public ContentSetsPage clickCreateSetButton() {
        getElement(createSetButton).click();
        return this;
    }

}
