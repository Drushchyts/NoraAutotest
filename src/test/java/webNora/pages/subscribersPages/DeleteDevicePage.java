package webNora.pages.subscribersPages;

import webNora.pages.AbstractPage;

public class DeleteDevicePage extends AbstractPage {


    private String deleteDeviceButton = "//tbody/tr[1]/td[9]/button[1]/span[1]";
    private String agreeDeleteButton = "//button[contains(text(),'Yes')]";
    private String deviceButton = "//*[@id=\"app-content\"]/div/ui-view/ui-view/ui-view/div/div/div[2]/a[2]";

    public DeleteDevicePage clickDeviceButton() {
        getElement(deviceButton).click();
        return this;
    }

    public DeleteDevicePage deleteDevice() throws InterruptedException {
        Thread.sleep(2000);
        getElement(deleteDeviceButton).click();
        waitForElementClickable(getElementBy(agreeDeleteButton));
        getElement(agreeDeleteButton).click();
        return this;
    }

}
