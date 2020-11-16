package nora.web.helpers.categotiesHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.categoriesPages.VodCategoriesPage;

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
