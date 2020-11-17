package webNora.pages.categoriesPages;

import webNora.pages.AbstractPage;

public class AddCategoriesPage extends AbstractPage {

    private String categoriesButton = "//span[contains(text(),'Categories & Series')]";

    public AddCategoriesPage clickCategoriesMod() {
        getElement(categoriesButton).click();
        return this;
    }
}
