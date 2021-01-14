package webNora.helpers.noraGoHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.noraGoPages.VerifyToaPage;

public class VerifyToaHelper extends AbstractHelper {

    VerifyToaPage verifyToaPage = new VerifyToaPage();

    public VerifyToaHelper verifyToa(){
        verifyToaPage.checkToaText()
                .clickAcceptButton();
        return this;
    }
}
