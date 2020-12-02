package webNora.pages;

public class DeletePAge extends AbstractPage {

    private String field = "//input[@id='_searchBar']";
    private String editButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[3]/div[1]/uib-accordion[1]/div[1]/div[4]/div[1]/div[1]/div[1]/h4[1]/div[1]/span[1]/div[1]/a[5]/i[1]";
    private String removeButton = "//button[contains(text(),'Remove')]";
    private String agreeButton = "//button[contains(text(),'Yes')]";


    public DeletePAge delete() throws InterruptedException {
        getElement(field).clear();
        getElement(field).sendKeys("QA auto");
        Thread.sleep(500);
        getElement(editButton).click();
        waitForElementClickable(getElementBy(removeButton));
        getElement(removeButton).click();
        waitForElementClickable(getElementBy(agreeButton));
        getElement(agreeButton).click();
        Thread.sleep(1000);
        return this;

    }
}
