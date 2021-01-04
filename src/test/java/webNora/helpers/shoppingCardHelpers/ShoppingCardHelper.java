package webNora.helpers.shoppingCardHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.shoppingCardPages.ShoppingCardPage;

public class ShoppingCardHelper extends AbstractHelper {

    ShoppingCardPage shoppingCardPage = new ShoppingCardPage();

    public ShoppingCardHelper openShoppingCard() {
        shoppingCardPage.openShoppingCardPage();
        return this;
    }
}
