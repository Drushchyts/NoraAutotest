package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.TvCategoriesPage;

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
