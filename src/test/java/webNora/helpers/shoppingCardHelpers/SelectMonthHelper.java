package webNora.helpers.shoppingCardHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.shoppingCardPages.SelectMonthPage;

public class SelectMonthHelper extends AbstractHelper {

    SelectMonthPage selectMonthPage = new SelectMonthPage();

    public SelectMonthHelper selectOneMonthButton() {
        selectMonthPage.clickOneMonthButton();
        return this;
    }
}
