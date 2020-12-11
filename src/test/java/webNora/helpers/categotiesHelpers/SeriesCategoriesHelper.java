package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.SeriesCategoriesPage;

public class SeriesCategoriesHelper extends AbstractHelper {

    SeriesCategoriesPage seriesCategoriesPage = new SeriesCategoriesPage();

    public SeriesCategoriesHelper clickSeriesCategories() {
        seriesCategoriesPage.clickSeriesCategoriesButton();
        return this;
    }
}
