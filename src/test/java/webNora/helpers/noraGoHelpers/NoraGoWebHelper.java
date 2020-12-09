package webNora.helpers.noraGoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.noraGoPages.NoraGoWebPage;

import java.awt.*;

public class NoraGoWebHelper extends AbstractHelper {

    NoraGoWebPage noraGoWebPage = new NoraGoWebPage();

    public NoraGoWebHelper openWebNoraGo() throws AWTException {
        noraGoWebPage.openNoraGo();
        return this;
    }

    public NoraGoWebHelper loginNorGo() throws InterruptedException {
        noraGoWebPage.enterLoginAndPassword()
                .clickLogin();
        return this;
    }
}
