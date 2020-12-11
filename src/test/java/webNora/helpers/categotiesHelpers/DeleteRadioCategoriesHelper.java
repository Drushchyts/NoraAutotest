package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.DeleteRadioCategoriesPage;

public class DeleteRadioCategoriesHelper extends AbstractHelper {

    DeleteRadioCategoriesPage deleteRadioCategoriesPage = new DeleteRadioCategoriesPage();

    public DeleteRadioCategoriesHelper deleteRadioCategories() {
        deleteRadioCategoriesPage.clickDeleteTvButton()
                .clickAgreeTvButton();
        return this;
    }
}
