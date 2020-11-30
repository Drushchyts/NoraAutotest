package webNora.helpers.settingsHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.settingsPages.ExtensionsPage;

public class ExtensionsHelper extends AbstractHelper {

    ExtensionsPage extensionsPage = new ExtensionsPage();

    public ExtensionsHelper extensions() {
        extensionsPage.clickExtensionsButton();
        return this;
    }
}


