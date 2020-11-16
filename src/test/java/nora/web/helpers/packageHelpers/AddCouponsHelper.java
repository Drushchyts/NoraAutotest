package nora.web.helpers.packageHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.packagePages.AddCouponsPage;

public class AddCouponsHelper extends AbstractHelper {

    AddCouponsPage addCouponsPage = new AddCouponsPage();

    public AddCouponsHelper clickCouponsButton(){
        addCouponsPage.clickCouponsButton();
        return this;
    }
}
