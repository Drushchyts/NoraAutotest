package nora.web.helpers.drmServiceHelpers;

import nora.web.helpers.AbstractHelper;
import nora.web.pages.drmServicePages.AddDrmServicePage;

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
