package webNora.helpers.distributorsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.distributorsPages.AddDistributorPage;

public class AddDistributorHelper extends AbstractHelper {

    AddDistributorPage addDistributorPage = new AddDistributorPage();

    public AddDistributorHelper clickDistributors() throws InterruptedException {
        addDistributorPage.clickDistributorsModButton();
        return this;
    }

    public AddDistributorHelper addDistributor() throws InterruptedException {
        addDistributorPage.clickAddDistributorButton()
                .selectPackageDistributor()
                .enterFirsName()
                .enterLastName()
                .enterPassword()
                .enterEmail()
                .enterCompany()
                .clickCreateDistributorButton()
                .clickCancelDistributorButton();
        return this;
    }
}
