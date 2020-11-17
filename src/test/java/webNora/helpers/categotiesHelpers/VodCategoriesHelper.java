package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.VodCategoriesPage;

public class VodCategoriesHelper extends AbstractHelper {

    VodCategoriesPage vodCategoriesPage = new VodCategoriesPage();

    public VodCategoriesHelper addVodCategories() throws InterruptedException {
        vodCategoriesPage.clickVodCategoriesButton()
                .clickAddVodCategoriesButton()
                .enterName()
                .selectPackage()
                .clickSaveVodCategoriesButton();
        return this;
    }
}
