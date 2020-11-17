package webNora.helpers.categotiesHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.categoriesPages.RadioCategoriesPage;

public class RadioCategoriesHelper extends AbstractHelper {

    RadioCategoriesPage radioCategoriesPage = new RadioCategoriesPage();

    public RadioCategoriesHelper addRadioCategories() throws InterruptedException {
        radioCategoriesPage.clickRadioCategoriesButton()
                .clickAddRadioCategoriesButton()
                .enterName()
                .selectPackage()
                .clickSaveRadioCategoriesButton();
        return this;
    }
}
