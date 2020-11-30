package webNora.helpers.distributorsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.distributorsPages.CheckAndDeleteDistributorPage;

public class CheckAndDeleteDistributorHelper extends AbstractHelper {

    CheckAndDeleteDistributorPage checkAndDeleteDistributorPage = new CheckAndDeleteDistributorPage();

    public CheckAndDeleteDistributorHelper checkAndDeleteDistributor() throws InterruptedException {
        checkAndDeleteDistributorPage.enterPackageSearch()
                .checkNamePackage()
                .deleteDistributor();
        return this;
    }


}
