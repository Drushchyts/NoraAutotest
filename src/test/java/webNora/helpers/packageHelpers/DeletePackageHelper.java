package webNora.helpers.packageHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.packagePages.DeletePackagePage;

public class DeletePackageHelper extends AbstractHelper {


    DeletePackagePage deletePackagePage = new DeletePackagePage();


    public DeletePackageHelper deletePackage() throws InterruptedException {
        deletePackagePage.enterNamePackage()
                .checkPackage()
                .deletePackage();
        return this;
    }


}
