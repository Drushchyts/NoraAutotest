package webNora.helpers.infoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.infoPages.ViewInfoPage;

public class ViewInfoHelper extends AbstractHelper {

    ViewInfoPage viewInfoPage = new ViewInfoPage();

    public ViewInfoHelper clickInfo() {
        viewInfoPage.clickInfoModButton();
        return this;
    }
}


