package webNora.helpers.shoppingCardHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.shoppingCardPages.SelectPackagePage;

public class SelectPackageHelper extends AbstractHelper {

    SelectPackagePage selectPackagePage = new SelectPackagePage();

    public SelectPackageHelper threeInOne() {
        selectPackagePage.clickThreeInOnePlanButton()
                .selectPackageType()
                .clickContinueButton();
        return this;
    }
}
