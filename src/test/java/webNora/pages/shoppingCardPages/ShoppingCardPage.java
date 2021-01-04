package webNora.pages.shoppingCardPages;

import webNora.pages.AbstractPage;

public class ShoppingCardPage extends AbstractPage {




    public ShoppingCardPage openShoppingCardPage() {
        openNewWindow();
        openNewTab();
        navigateShoppingCardPage();
        return this;
    }
}
