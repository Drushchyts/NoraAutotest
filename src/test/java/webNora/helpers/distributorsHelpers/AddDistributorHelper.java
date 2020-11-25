package webNora.helpers.distributorsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.distributorsPages.AddDistributorPage;

public class AddDistributorHelper extends AbstractHelper {

    AddDistributorPage addDistributorPage = new AddDistributorPage();

    public AddDistributorHelper clickDistributors() {
        addDistributorPage.clickDistributorsModButton();
        return this;
    }
}
