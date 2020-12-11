package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.DeleteTvCategoriesPage;

public class DeleteTvCategoriesHelper extends AbstractHelper {

    DeleteTvCategoriesPage deleteTvCategoriesPage = new DeleteTvCategoriesPage();

    public DeleteTvCategoriesHelper deleteTvCategories(){
        deleteTvCategoriesPage.clickDeleteRadioButton()
                .clickAgreeRadioButton();
        return this;
    }
}
