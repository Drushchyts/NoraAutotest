package nora.web.helpers.categotiesHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.categoriesPages.TvCategoriesPage;

public class TvCategoriesHelper extends AbstractHelper {

    TvCategoriesPage tvCategoriesPage = new TvCategoriesPage();

    public TvCategoriesHelper addTvCategories() throws InterruptedException {
        tvCategoriesPage.clickTvCategoriesButton()
                .clickAddTvCategoriesButton()
                .enterName()
                .selectPackage()
                .clickSaveTvCategoriesButton();
        return this;
    }
}
