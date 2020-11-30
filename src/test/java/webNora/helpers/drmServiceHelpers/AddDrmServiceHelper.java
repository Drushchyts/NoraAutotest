package webNora.helpers.drmServiceHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.drmServicePages.AddDrmServicePage;

public class AddDrmServiceHelper extends AbstractHelper {

    AddDrmServicePage drmServicePage = new AddDrmServicePage();

    public AddDrmServiceHelper clickDrmServiceButton() {
        drmServicePage.clickDrmServiceMod();

        return this;
    }

    public AddDrmServiceHelper addDrmService() throws InterruptedException {
        drmServicePage.clickAddDRMServiceButton()
                .enterNameDRM()
                .selectDRMProvider()
                .enterPXValue()
                .clickCreateDRMButton();
        return this;
    }
}
