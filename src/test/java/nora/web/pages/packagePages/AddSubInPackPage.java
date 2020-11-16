package nora.web.pages.packagePages;

public class AddSubInPackPage extends AddPackagePage {

    private String firstPackageOnList = "/html[1]/body[1]/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[3]/div[1]/uib-accordion[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h4[1]/div[1]/span[1]/span[1]/b[1]";
    private String AddSubscriberButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/div[3]/div[1]/uib-accordion[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]";
    private String backButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/a[1]";



    public AddSubInPackPage clickFirstPackageOnList() {
        waitForElementClickable(getElementBy(firstPackageOnList));
        getElement(firstPackageOnList).click();
        return this;
    }

    public AddSubInPackPage clickAddSubscriberButton() {
        getElement(AddSubscriberButton).click();
        return this;
    }

    public AddPackagePage clickBack() {
        waitForElementClickable(getElementBy(backButton));
        getElement(backButton).click();
        return this;
    }
}
