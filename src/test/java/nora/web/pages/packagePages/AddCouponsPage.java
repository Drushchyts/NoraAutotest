package nora.web.pages.packagePages;

import nora.web.pages.AbstractPage;

public class AddCouponsPage extends AbstractPage {

    private String couponsButton = "//body/div[1]/div[2]/div[2]/section[1]/div[1]/ui-view[1]/ui-view[1]/ui-view[1]/div[1]/div[2]/a[4]";

    public AddCouponsPage clickCouponsButton() {
        getElement(couponsButton).click();
        return this;
    }
}
