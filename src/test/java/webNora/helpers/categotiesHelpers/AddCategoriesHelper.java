package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.AddCategoriesPage;

public class AddCategoriesHelper extends AbstractHelper {

    AddCategoriesPage addCategoriesPage = new AddCategoriesPage();

    public void clickCategoriesButton() {
        addCategoriesPage.clickCategoriesMod();
    }
}
