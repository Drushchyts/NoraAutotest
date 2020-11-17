package webNora.helpers.drmServiceHelpers;

import webNora.helpers.AbstractHelper;
import webNora.pages.drmServicePages.AddDrmServicePage;

public class AddDrmServiceHelper extends AbstractHelper {

    AddDrmServicePage drmServicePage = new AddDrmServicePage();

    public AddDrmServiceHelper clickDrmServiceButton() {
        drmServicePage.clickDrmServiceMod()
                .clickAddDRMServiceButton()
                .enterNameDRM()
                .selectDRMProvider()
                .enterPXValue()
                .clickCreateDRMButton();
        return this;
    }
}
