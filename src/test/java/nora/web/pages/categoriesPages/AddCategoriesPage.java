package nora.web.pages.categoriesPages;

import nora.web.pages.AbstractPage;
import nora.web.pages.packagePages.AddPackagePage;

public class AddCategoriesPage extends AbstractPage {

    private String categoriesButton = "//span[contains(text(),'Categories & Series')]";

    public AddCategoriesPage clickCategoriesMod() {
        getElement(categoriesButton).click();
        return this;
    }
}
