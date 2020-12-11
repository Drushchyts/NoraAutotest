package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.DeleteVodCategoriesPage;

public class DeleteVodCategoriesHelper extends AbstractHelper {

    DeleteVodCategoriesPage deleteVodCategoriesPage = new DeleteVodCategoriesPage();

    public DeleteVodCategoriesHelper deleteVodCategories() {
        deleteVodCategoriesPage.clickDeleteVodButton()
                .clickAgreeVodButton();
        return this;
    }
}
