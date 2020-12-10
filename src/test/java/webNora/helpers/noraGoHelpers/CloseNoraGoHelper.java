package webNora.helpers.noraGoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.noraGoPages.CloseNoraGoPage;

public class CloseNoraGoHelper extends AbstractHelper {

    CloseNoraGoPage closeNoraGoPage = new CloseNoraGoPage();

    public CloseNoraGoHelper backAdminPanel() {
        close();
        closeNoraGoPage.exitNoraGo();
        return this;
    }
}
