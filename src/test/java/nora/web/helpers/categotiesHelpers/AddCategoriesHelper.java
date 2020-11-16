package nora.web.helpers.categotiesHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.categoriesPages.AddCategoriesPage;
import nora.web.pages.packagePages.AddPackagePage;

public class AddCategoriesHelper extends AbstractHelper {

    AddCategoriesPage addCategoriesPage = new AddCategoriesPage();

    public void clickCategoriesButton() {
        addCategoriesPage.clickCategoriesMod();
    }
}
