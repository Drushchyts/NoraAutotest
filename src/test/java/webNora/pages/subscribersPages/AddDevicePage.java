package webNora.pages.subscribersPages;

import webNora.pages.AbstractPage;

public class AddDevicePage extends AbstractPage {

    private String addDeviceButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[1]/form[1]/div[2]/a[2]";
    private String searchField = "//span[contains(text(),'Search by MAC, Serial Number or Identifier')]";
    private String selectDevice = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/div[1]";
    private String addButton = "//button[contains(text(),'Add')]";


    public AddDevicePage clickAddDeviceButton() throws InterruptedException {
        Thread.sleep(5000);
        getElement(addDeviceButton).click();
        return this;
    }

    public AddDevicePage selectDevice() throws InterruptedException {
        Thread.sleep(2000);
        getElement(searchField).click();
        waitForElementClickable(getElementBy(selectDevice));
        getElement(selectDevice).click();
        return this;
    }

    public AddDevicePage clickAdd() {
        getElement(addButton).click();
        return this;
    }


}
