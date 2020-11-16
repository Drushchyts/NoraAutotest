package nora.web.helpers.categotiesHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.categoriesPages.RadioCategoriesPage;

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
