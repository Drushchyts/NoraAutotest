package webNora.pages.subscribersPages;

import webNora.pages.AbstractPage;

public class CheckAndDeleteSubscriberPage extends AbstractPage {

    private String searchField = "//input[@id='_searchBar']";
    private String nameSubscriber = "AleksandrTest";
    private String editButton = "//tbody/tr[2]/td[13]/div[1]/a[1]/span[1]";
    private String removeButton = "//button[contains(text(),'Remove')]";
    private String agreeDeleteSubscriberButton = "//button[contains(text(),'Yes')]";


    public CheckAndDeleteSubscriberPage enterSubscriberName() throws InterruptedException {
        waitForElementVisible(getElementBy(searchField));

        getElement(searchField).clear();
        sleep(2000);
        getElement(searchField).sendKeys(nameSubscriber);
        sleep(2000);
        return this;
    }

    public CheckAndDeleteSubscriberPage clickEditButton() throws InterruptedException {
        sleep1000();
        waitForElementClickable(getElementBy(editButton));
        getElement(editButton).click();
        return this;
    }

    public CheckAndDeleteSubscriberPage deleteSubscriber() {
        jsScroll();
        jsScroll();
        getElement(removeButton).click();
        waitForElementClickable(getElementBy(agreeDeleteSubscriberButton));
        getElement(agreeDeleteSubscriberButton).click();
        return this;
    }
}
