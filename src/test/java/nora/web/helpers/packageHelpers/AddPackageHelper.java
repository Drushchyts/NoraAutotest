package nora.web.helpers.packageHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.packagePages.AddPackagePage;

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
