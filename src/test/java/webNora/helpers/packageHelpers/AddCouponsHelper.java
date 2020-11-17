package webNora.helpers.packageHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.packagePages.AddCouponsPage;

public class AddCouponsHelper extends AbstractHelper {

    AddCouponsPage addCouponsPage = new AddCouponsPage();

    public AddCouponsHelper clickCouponsButton(){
        addCouponsPage.clickCouponsButton();
        return this;
    }
}
