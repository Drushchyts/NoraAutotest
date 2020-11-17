package webNora.helpers.packageHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.packagePages.AddPackagePage;

public class AddPackageHelper extends AbstractHelper {

    AddPackagePage addPackagePage = new AddPackagePage();

    public AddPackageHelper clickPackageButton() {
        addPackagePage.clickPackageMod();
        return this;
    }

    public AddPackageHelper createPackage() {
        addPackagePage.clickAddButton()
                .enterNamePackage()
                .selectPlatform()
                .clickSaveButton();
        return this;
    }
}
